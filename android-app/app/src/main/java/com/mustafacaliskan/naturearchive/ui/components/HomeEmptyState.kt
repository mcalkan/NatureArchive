package com.mustafacaliskan.naturearchive.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Eco
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mustafacaliskan.naturearchive.R
import com.mustafacaliskan.naturearchive.ui.theme.NatureArchiveTheme

@Composable
fun HomeEmptyState(
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier.widthIn(max = HomeEmptyStateMaxWidth),
        shape = RoundedCornerShape(HomeEmptyStateCornerRadius),
        color = MaterialTheme.colorScheme.surfaceContainerLow
    ) {
        Column(
            modifier = Modifier.padding(HomeEmptyStatePadding),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                imageVector = Icons.Outlined.Eco,
                contentDescription = null,
                modifier = Modifier.size(HomeEmptyStateIconSize),
                tint = MaterialTheme.colorScheme.primary.copy(alpha = 0.5f)
            )
            Text(
                text = stringResource(R.string.home_empty_title),
                modifier = Modifier.padding(top = HomeEmptyStateTitleTopPadding),
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.onSurface,
                textAlign = TextAlign.Center
            )
            Text(
                text = stringResource(R.string.home_empty_description),
                modifier = Modifier.padding(top = HomeEmptyStateDescriptionTopPadding),
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                textAlign = TextAlign.Center
            )
        }
    }
}

private val HomeEmptyStateMaxWidth = 320.dp
private val HomeEmptyStateCornerRadius = 16.dp
private val HomeEmptyStatePadding = 24.dp
private val HomeEmptyStateIconSize = 56.dp
private val HomeEmptyStateTitleTopPadding = 16.dp
private val HomeEmptyStateDescriptionTopPadding = 8.dp

@Preview(showBackground = true)
@Composable
private fun HomeEmptyStatePreview() {
    NatureArchiveTheme {
        HomeEmptyState()
    }
}
