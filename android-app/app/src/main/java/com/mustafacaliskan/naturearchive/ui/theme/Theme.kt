package com.mustafacaliskan.naturearchive.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = ForestGreenLight,
    onPrimary = BackgroundLight,
    secondary = SageGreen,
    onSecondary = BackgroundDark,
    tertiary = WarmAmber,
    onTertiary = BackgroundDark,
    background = BackgroundDark,
    onBackground = BackgroundLight,
    surface = SurfaceDark,
    onSurface = BackgroundLight
)

private val LightColorScheme = lightColorScheme(
    primary = ForestGreen,
    onPrimary = BackgroundLight,
    secondary = EarthBrown,
    onSecondary = BackgroundLight,
    tertiary = WarmAmber,
    onTertiary = BackgroundDark,
    background = BackgroundLight,
    onBackground = BackgroundDark,
    surface = SurfaceLight,
    onSurface = BackgroundDark
)

@Composable
fun NatureArchiveTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
