package com.example.favouritefruitpage
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FavouriteFruitPage()
        }
    }
}

@Composable
fun FavouriteFruitPage() {
    var grapesChecked by remember { mutableStateOf(false) }
    var orangeChecked by remember { mutableStateOf(false) }
    var appleChecked by remember { mutableStateOf(false) }

    MaterialTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                "Tulika's favourite fruit is:",
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier.padding(vertical = 8.dp)
            )

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(vertical = 8.dp)
            ) {
                Checkbox(
                    checked = grapesChecked,
                    onCheckedChange = { grapesChecked = it }
                )
                Text("Grapes")
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(vertical = 8.dp)
            ) {
                Checkbox(
                    checked = orangeChecked,
                    onCheckedChange = { orangeChecked = it }
                )
                Text("Orange")
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(vertical = 8.dp)
            ) {
                Checkbox(
                    checked = appleChecked,
                    onCheckedChange = { appleChecked = it }
                )
                Text("Apple")
            }

            Text("Selected fruits:")
            if (grapesChecked) {
                Text("Grapes")
            }
            if (orangeChecked) {
                Text("Orange")
            }
            if (appleChecked) {
                Text("Apple")
            }
        }
    }
}
