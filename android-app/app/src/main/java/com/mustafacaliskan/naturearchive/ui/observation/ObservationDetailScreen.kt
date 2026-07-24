package com.mustafacaliskan.naturearchive.ui.observation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mustafacaliskan.naturearchive.R
import com.mustafacaliskan.naturearchive.data.local.database.NatureArchiveDatabase
import com.mustafacaliskan.naturearchive.data.local.entity.ObservationEntity
import com.mustafacaliskan.naturearchive.data.repository.ObservationRepository
import com.mustafacaliskan.naturearchive.ui.components.NatureArchiveScaffold
import com.mustafacaliskan.naturearchive.ui.theme.NatureArchiveTheme
import kotlinx.coroutines.launch

@Composable
fun ObservationDetailScreen(
    observationId: Long?,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    val repository = remember(context) {
        ObservationRepository(
            NatureArchiveDatabase.getInstance(context).observationDao()
        )
    }
    val coroutineScope = rememberCoroutineScope()

    var observation by remember { mutableStateOf<ObservationEntity?>(null) }

    LaunchedEffect(observationId) {
        if (observationId != null) {
            coroutineScope.launch {
                observation = repository.getObservationById(observationId)
            }
        }
    }

    NatureArchiveScaffold(
        title = stringResource(R.string.observation_detail_title),
        modifier = modifier
    ) { innerPadding ->
        if (observation == null) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .padding(horizontal = 24.dp),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = stringResource(R.string.observation_detail_unavailable),
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        } else {
            val currentObservation = observation!!
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .padding(horizontal = 24.dp)
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Text(
                    text = stringResource(R.string.observation_detail_category_label),
                    style = MaterialTheme.typography.labelMedium,
                    color = MaterialTheme.colorScheme.primary
                )
                Text(
                    text = currentObservation.category,
                    style = MaterialTheme.typography.titleMedium
                )

                Text(
                    text = stringResource(R.string.observation_detail_title_label),
                    style = MaterialTheme.typography.labelMedium,
                    color = MaterialTheme.colorScheme.primary
                )
                Text(
                    text = currentObservation.title,
                    style = MaterialTheme.typography.titleLarge
                )

                Text(
                    text = stringResource(R.string.observation_detail_created_label),
                    style = MaterialTheme.typography.labelMedium,
                    color = MaterialTheme.colorScheme.primary
                )
                Text(
                    text = formatDate(currentObservation.createdAt),
                    style = MaterialTheme.typography.bodyLarge
                )

                Text(
                    text = stringResource(R.string.observation_detail_notes_label),
                    style = MaterialTheme.typography.labelMedium,
                    color = MaterialTheme.colorScheme.primary
                )
                Text(
                    text = currentObservation.notes.ifBlank { stringResource(R.string.observation_detail_notes_empty) },
                    style = MaterialTheme.typography.bodyLarge
                )

                Button(onClick = onBackClick) {
                    Text(text = stringResource(R.string.observation_detail_back))
                }
            }
        }
    }
}

private fun formatDate(timestamp: Long): String {
    val formatter = java.text.SimpleDateFormat("MMM d, yyyy", java.util.Locale.getDefault())
    return formatter.format(java.util.Date(timestamp))
}

@Preview(showBackground = true)
@Composable
private fun ObservationDetailScreenPreview() {
    NatureArchiveTheme {
        ObservationDetailScreen(
            observationId = 1L,
            onBackClick = {}
        )
    }
}
