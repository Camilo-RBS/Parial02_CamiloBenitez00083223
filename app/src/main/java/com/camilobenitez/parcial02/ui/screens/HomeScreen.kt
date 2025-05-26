package com.camilobenitez.parcial02.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.camilobenitez.parcial02.model.Product
import com.camilobenitez.parcial02.ui.components.ProductCard
import com.camilobenitez.parcial02.viewmodel.ProductViewModel

@Composable
fun HomeScreen(
    viewModel: ProductViewModel = viewModel(),
    onProductClick: (Product) -> Unit,
    onCartClick: () -> Unit
) {
    val products by viewModel.products.collectAsState()
    val searchQuery by viewModel.searchQuery.collectAsState()
    val cart by viewModel.cart.collectAsState()

    Column(Modifier.padding(16.dp)) {
        OutlinedTextField(
            value = searchQuery,
            onValueChange = viewModel::updateSearchQuery,
            label = { Text("Buscar") },
            modifier = Modifier.fillMaxWidth(),
            textStyle = TextStyle(color = Color.Black) // Forzar texto negro sin usar colors
        )

        Spacer(Modifier.height(8.dp))

        Button(
            onClick = onCartClick,
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "Carrito")
                Spacer(modifier = Modifier.width(8.dp))
                Text("Ir al carrito")
                if (cart.isNotEmpty()) {
                    Spacer(modifier = Modifier.width(8.dp))
                    Icon(
                        imageVector = Icons.Default.CheckCircle,
                        contentDescription = "Productos en carrito",
                        tint = Color.Green
                    )
                }
            }
        }

        LazyColumn {
            items(products) { product ->
                ProductCard(product = product, onClick = { onProductClick(product) })
            }
        }
    }
}
