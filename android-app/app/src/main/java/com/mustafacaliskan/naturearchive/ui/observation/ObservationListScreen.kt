package com.mustafacaliskan.naturearchive.ui.observation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import com.mustafacaliskan.naturearchive.ui.components.ObservationCard
import com.mustafacaliskan.naturearchive.ui.components.ObservationEmptyState
import com.mustafacaliskan.naturearchive.ui.theme.NatureArchiveTheme
import kotlinx.coroutines.launch

@Composable
fun ObservationListScreen(
    modifier: Modifier = Modifier,
    onObservationClick: (Long) -> Unit = {}
) {
    val context = LocalContext.current
    val repository = remember(context) {
        // Temporary repository creation until Dependency Injection is introduced in a future sprint.
        ObservationRepository(
            NatureArchiveDatabase.getInstance(context).observationDao()
        )
    }
    val coroutineScope = rememberCoroutineScope()

    var observations by remember { mutableStateOf<List<ObservationEntity>>(emptyList()) }

    LaunchedEffect(Unit) {
        coroutineScope.launch {
            observations = repository.getAllObservations()
        }
    }

    NatureArchiveScaffold(
        title = stringResource(R.string.observation_list_title),
        modifier = modifier
    ) { innerPadding ->
        if (observations.isEmpty()) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .padding(horizontal = 24.dp),
                verticalArrangement = Arrangement.Center
            ) {
                ObservationEmptyState()
            }
        } else {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .padding(horizontal = 24.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                items(
                    items = observations,
                    key = { observation -> observation.id }
                ) { observation ->
                    ObservationCard(
                        observation = observation,
                        onClick = { onObservationClick(observation.id.toLong()) }
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ObservationListScreenPreview() {
    NatureArchiveTheme {
        ObservationListScreen()
    }
}
