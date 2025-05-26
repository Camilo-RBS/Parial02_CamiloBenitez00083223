package com.camilobenitez.parcial02.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.camilobenitez.parcial02.model.Product

@Composable
fun CartItem(product: Product) {
    val backgroundColor = when (product.category.lowercase()) {
        "tecnología" -> Color(0xFFE0F7FA)
        "ropa" -> Color(0xFFFFF3E0)
        "fotografía" -> Color(0xFFE8F5E9)
        "accesorios" -> Color(0xFFF3E5F5)
        else -> Color(0xFFF7F7F7)
    }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        colors = CardDefaults.cardColors(containerColor = backgroundColor),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Row(modifier = Modifier.padding(8.dp)) {
            Image(
                painter = rememberAsyncImagePainter(product.image),
                contentDescription = null,
                modifier = Modifier.size(80.dp)
            )
            Spacer(Modifier.width(8.dp))
            Column {
                Text(product.name)
                Text(product.category)
                Text("${product.price} USD")
            }
        }
    }
}
