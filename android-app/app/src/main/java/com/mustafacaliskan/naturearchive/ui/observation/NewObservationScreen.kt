package com.mustafacaliskan.naturearchive.ui.observation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewObservationScreen(
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    val repository = remember(context) {
        ObservationRepository(
            NatureArchiveDatabase.getInstance(context).observationDao()
        )
    }
    val coroutineScope = rememberCoroutineScope()

    var title by rememberSaveable { mutableStateOf("") }
    var notes by rememberSaveable { mutableStateOf("") }
    var expanded by rememberSaveable { mutableStateOf(false) }
    var selectedCategory by rememberSaveable { mutableStateOf("") }

    val categories = listOf(
        stringResource(R.string.new_observation_category_wildlife),
        stringResource(R.string.new_observation_category_plant),
        stringResource(R.string.new_observation_category_bird),
        stringResource(R.string.new_observation_category_mushroom),
        stringResource(R.string.new_observation_category_trail)
    )

    val isFormValid by remember(title, notes, selectedCategory) {
        derivedStateOf {
            title.trim().isNotEmpty() && notes.trim().isNotEmpty() && selectedCategory.isNotBlank()
        }
    }

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
                value = title,
                onValueChange = { title = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = NewObservationFieldSpacing),
                placeholder = {
                    Text(text = stringResource(R.string.new_observation_title_label))
                },
                singleLine = true
            )

            Spacer(modifier = Modifier.height(NewObservationFieldSpacing))

            Text(
                text = stringResource(R.string.new_observation_notes_label),
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.onSurface
            )

            OutlinedTextField(
                value = notes,
                onValueChange = { notes = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(min = NewObservationNotesMinHeight)
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

            ExposedDropdownMenuBox(
                expanded = expanded,
                onExpandedChange = { expanded = !expanded },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = NewObservationFieldSpacing)
            ) {
                OutlinedTextField(
                    value = selectedCategory.ifBlank { stringResource(R.string.new_observation_category_placeholder) },
                    onValueChange = {},
                    readOnly = true,
                    modifier = Modifier
                        .menuAnchor()
                        .fillMaxWidth(),
                    trailingIcon = {
                        ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded)
                    }
                )

                ExposedDropdownMenu(
                    expanded = expanded,
                    onDismissRequest = { expanded = false }
                ) {
                    categories.forEach { category ->
                        DropdownMenuItem(
                            text = { Text(category) },
                            onClick = {
                                selectedCategory = category
                                expanded = false
                            }
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(NewObservationActionSpacing))

            Button(
                onClick = {
                    if (isFormValid) {
                        val observation = ObservationEntity(
                            title = title.trim(),
                            notes = notes.trim(),
                            category = selectedCategory
                        )

                        coroutineScope.launch {
                            repository.insertObservation(observation)
                        }
                    }
                },
                enabled = isFormValid,
                modifier = Modifier
                    .fillMaxWidth()
                    .widthIn(max = NewObservationSaveButtonMaxWidth)
            ) {
                Text(text = stringResource(R.string.new_observation_save))
            }
        }
    }
}

private val NewObservationHorizontalPadding = 24.dp
private val NewObservationTopSpacing = 16.dp
private val NewObservationFieldSpacing = 8.dp
private val NewObservationActionSpacing = 24.dp
private val NewObservationNotesMinHeight = 120.dp
private val NewObservationSaveButtonMaxWidth = 180.dp

@Preview(showBackground = true)
@Composable
private fun NewObservationScreenPreview() {
    NatureArchiveTheme {
        NewObservationScreen()
    }
}
