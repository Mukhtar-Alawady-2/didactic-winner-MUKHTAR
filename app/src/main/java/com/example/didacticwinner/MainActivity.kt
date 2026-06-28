package com.example.didacticwinner

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.example.didacticwinner.ui.theme.DidacticWinnerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DidacticWinnerTheme {
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("مرحبا بك في مشروع didactic-winner")
                }
            }
        }
    }
}

@Composable
fun Greeting(message: String) {
    Text(text = message)
}
