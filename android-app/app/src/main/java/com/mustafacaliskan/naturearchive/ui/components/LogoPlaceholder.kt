package com.mustafacaliskan.naturearchive.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Eco
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mustafacaliskan.naturearchive.ui.theme.NatureArchiveTheme

@Composable
fun LogoPlaceholder(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .size(LogoPlaceholderSize)
            .clip(CircleShape)
            .background(
                MaterialTheme.colorScheme.surfaceContainerHighest.copy(alpha = 0.5f)
            ),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = Icons.Outlined.Eco,
            contentDescription = null,
            tint = MaterialTheme.colorScheme.primary.copy(alpha = 0.75f),
            modifier = Modifier.size(LogoPlaceholderIconSize)
        )
    }
}

private val LogoPlaceholderSize = 88.dp
private val LogoPlaceholderIconSize = 44.dp

@Preview(showBackground = true)
@Composable
private fun LogoPlaceholderPreview() {
    NatureArchiveTheme {
        LogoPlaceholder()
    }
}
