package com.camilobenitez.parcial02.viewmodel

import androidx.lifecycle.ViewModel
import com.camilobenitez.parcial02.model.Product
import com.camilobenitez.parcial02.repository.ProductRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class ProductViewModel : ViewModel() {
    private val _products = MutableStateFlow(ProductRepository.productList)
    val products: StateFlow<List<Product>> = _products

    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String> = _searchQuery

    private val _cart = MutableStateFlow<List<Product>>(emptyList())
    val cart: StateFlow<List<Product>> = _cart

    fun updateSearchQuery(query: String) {
        _searchQuery.value = query
        _products.value = ProductRepository.productList.filter {
            it.name.contains(query, true) || it.category.contains(query, true)
        }
    }

    fun addToCart(product: Product) {
        if (!_cart.value.contains(product)) {
            _cart.update { it + product.copy(addedToCart = true) }

            _products.update { currentList ->
                currentList.map {
                    if (it.id == product.id) it.copy(addedToCart = true) else it
                }
            }
        }
    }
}


