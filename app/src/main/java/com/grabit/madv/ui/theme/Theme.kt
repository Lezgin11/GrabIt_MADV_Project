package com.grabit.madv.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF2E6945),
    onPrimary = Color.White,
    primaryContainer = Color(0xFFE2EEDD),
    onPrimaryContainer = Color(0xFF132117),
    background = Color(0xFFF7F8F5),
    onBackground = Color(0xFF1C211E),
    surface = Color.White,
    onSurface = Color(0xFF1C211E),
    surfaceVariant = Color(0xFFF1F3EE),
    onSurfaceVariant = Color(0xFF414943)
)

@Composable
fun GrabItTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = LightColorScheme,
        content = content
    )
}
