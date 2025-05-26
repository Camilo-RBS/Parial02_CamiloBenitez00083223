package com.camilobenitez.parcial02.ui.screens


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.camilobenitez.parcial02.viewmodel.ProductViewModel
import com.camilobenitez.parcial02.ui.components.CartItem
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun CartScreen(viewModel: ProductViewModel = viewModel()) {
    val cart by viewModel.cart.collectAsState()

    LazyColumn(modifier = Modifier.padding(16.dp)) {
        items(cart) { product ->
            CartItem(product = product)
        }
    }
}
