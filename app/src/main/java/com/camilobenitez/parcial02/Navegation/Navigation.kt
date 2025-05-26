package com.camilobenitez.parcial02.Navigation

import androidx.compose.runtime.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.camilobenitez.parcial02.model.Product
import com.camilobenitez.parcial02.ui.screens.CartScreen
import com.camilobenitez.parcial02.ui.screens.DetailScreen
import com.camilobenitez.parcial02.ui.screens.HomeScreen
import com.camilobenitez.parcial02.viewmodel.ProductViewModel

@Composable
fun Navigation(viewModel: ProductViewModel) {
    val navController = rememberNavController()
    var selectedProduct by remember { mutableStateOf<Product?>(null) }

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(viewModel = viewModel, onProductClick = {
                selectedProduct = it
                navController.navigate("detail")
            }, onCartClick = {
                navController.navigate("cart")
            })
        }
        composable("detail") {
            selectedProduct?.let {
                DetailScreen(product = it, viewModel = viewModel)
            }
        }
        composable("cart") {
            CartScreen(viewModel = viewModel)
        }
    }
}
