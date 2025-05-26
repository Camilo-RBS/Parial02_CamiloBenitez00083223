package com.camilobenitez.parcial02

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.camilobenitez.parcial02.Navigation.Navigation
import com.camilobenitez.parcial02.ui.theme.Parcial02Theme
import com.camilobenitez.parcial02.viewmodel.ProductViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel: ProductViewModel by viewModels()
        setContent {
            Parcial02Theme {
                Navigation(viewModel = viewModel)
            }
        }
    }
}
