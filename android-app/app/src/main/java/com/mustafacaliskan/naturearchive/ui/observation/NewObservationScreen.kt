package com.mustafacaliskan.naturearchive.ui.observation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mustafacaliskan.naturearchive.R
import com.mustafacaliskan.naturearchive.ui.components.NatureArchiveScaffold
import com.mustafacaliskan.naturearchive.ui.theme.NatureArchiveTheme

@Composable
fun NewObservationScreen(
    modifier: Modifier = Modifier,
    onBackClick: () -> Unit = {}
) {
    NatureArchiveScaffold(
        title = stringResource(R.string.new_observation_title),
        modifier = modifier
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .verticalScroll(rememberScrollState())
                .padding(horizontal = NewObservationHorizontalPadding),
            verticalArrangement = Arrangement.Top
        ) {
            Spacer(modifier = Modifier.height(NewObservationTopSpacing))

            Text(
                text = stringResource(R.string.new_observation_title_label),
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.onSurface
            )

            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = NewObservationFieldSpacing),
                placeholder = {
                    Text(text = stringResource(R.string.new_observation_title_label))
                }
            )

            Spacer(modifier = Modifier.height(NewObservationFieldSpacing))

            Text(
                text = stringResource(R.string.new_observation_notes_label),
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.onSurface
            )

            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = NewObservationFieldSpacing),
                placeholder = {
                    Text(text = stringResource(R.string.new_observation_notes_label))
                }
            )

            Spacer(modifier = Modifier.height(NewObservationFieldSpacing))

            Text(
                text = stringResource(R.string.new_observation_category_label),
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.onSurface
            )

            Surface(
                shape = MaterialTheme.shapes.medium,
                tonalElevation = 1.dp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = NewObservationFieldSpacing)
            ) {
                Text(
                    text = stringResource(R.string.new_observation_category_placeholder),
                    modifier = Modifier.padding(NewObservationCategoryPadding),
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    textAlign = TextAlign.Start
                )
            }

            Spacer(modifier = Modifier.height(NewObservationActionSpacing))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(NewObservationActionSpacing),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(
                    onClick = {},
                    enabled = false,
                    modifier = Modifier.widthIn(max = NewObservationSaveButtonMaxWidth)
                ) {
                    Text(text = stringResource(R.string.new_observation_save))
                }

                TextButton(onClick = onBackClick) {
                    Text(text = stringResource(R.string.new_observation_cancel))
                }
            }
        }
    }
}

private val NewObservationHorizontalPadding = 24.dp
private val NewObservationTopSpacing = 16.dp
private val NewObservationFieldSpacing = 8.dp
private val NewObservationActionSpacing = 16.dp
private val NewObservationCategoryPadding = 16.dp
private val NewObservationSaveButtonMaxWidth = 160.dp

@Preview(showBackground = true)
@Composable
private fun NewObservationScreenPreview() {
    NatureArchiveTheme {
        NewObservationScreen(onBackClick = {})
    }
}
