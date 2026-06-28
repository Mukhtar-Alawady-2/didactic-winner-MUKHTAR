package com.example.didacticwinner.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = androidx.compose.ui.graphics.Color(0xFF1EB980),
    primaryVariant = androidx.compose.ui.graphics.Color(0xFF045D56),
    secondary = androidx.compose.ui.graphics.Color(0xFFFF6859)
)

@Composable
fun DidacticWinnerTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colors = DarkColorPalette,
        typography = androidx.compose.material.Typography(),
        shapes = androidx.compose.material.Shapes(),
        content = content
    )
}
