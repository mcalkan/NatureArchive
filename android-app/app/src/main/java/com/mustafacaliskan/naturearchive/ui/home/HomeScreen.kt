package com.mustafacaliskan.naturearchive.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mustafacaliskan.naturearchive.R
import com.mustafacaliskan.naturearchive.ui.components.HomeEmptyState
import com.mustafacaliskan.naturearchive.ui.components.LogoPlaceholder
import com.mustafacaliskan.naturearchive.ui.components.NatureArchiveScaffold
import com.mustafacaliskan.naturearchive.ui.theme.NatureArchiveTheme

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    onNewObservationClick: () -> Unit = {}
) {
    NatureArchiveScaffold(
        title = stringResource(R.string.home_top_bar_title),
        modifier = modifier
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .verticalScroll(rememberScrollState())
                .padding(horizontal = HomeHorizontalPadding),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(HomeTopSpacing))

            LogoPlaceholder()

            Spacer(modifier = Modifier.height(HomeLogoToHeroSpacing))

            Text(
                text = stringResource(R.string.home_headline),
                modifier = Modifier.widthIn(max = HomeHeroMaxWidth),
                style = MaterialTheme.typography.headlineSmall,
                color = MaterialTheme.colorScheme.onBackground,
                textAlign = TextAlign.Center
            )
            Text(
                text = stringResource(R.string.home_subtitle),
                modifier = Modifier
                    .padding(top = HomeHeroSubtitleTopPadding)
                    .widthIn(max = HomeHeroMaxWidth),
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.75f),
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(HomeHeroToEmptyStateSpacing))

            HomeEmptyState()

            Spacer(modifier = Modifier.height(HomeEmptyStateToButtonSpacing))

            Button(
                onClick = onNewObservationClick,
                modifier = Modifier
                    .fillMaxWidth()
                    .widthIn(max = HomeButtonMaxWidth)
            ) {
                Text(
                    text = stringResource(R.string.home_new_observation),
                    style = MaterialTheme.typography.labelLarge
                )
            }

            Spacer(modifier = Modifier.weight(1f))

            Text(
                text = stringResource(R.string.home_offline_hint),
                modifier = Modifier.padding(
                    top = HomeFooterTopPadding,
                    bottom = HomeFooterBottomPadding
                ),
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.6f),
                textAlign = TextAlign.Center
            )
        }
    }
}

private val HomeHorizontalPadding = 24.dp
private val HomeTopSpacing = 32.dp
private val HomeLogoToHeroSpacing = 24.dp
private val HomeHeroMaxWidth = 480.dp
private val HomeHeroSubtitleTopPadding = 8.dp
private val HomeHeroToEmptyStateSpacing = 40.dp
private val HomeEmptyStateToButtonSpacing = 24.dp
private val HomeButtonMaxWidth = 400.dp
private val HomeFooterTopPadding = 24.dp
private val HomeFooterBottomPadding = 24.dp

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    NatureArchiveTheme {
        HomeScreen(onNewObservationClick = {})
    }
}
