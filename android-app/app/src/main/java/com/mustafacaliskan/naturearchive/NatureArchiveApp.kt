package com.mustafacaliskan.naturearchive

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.mustafacaliskan.naturearchive.navigation.NatureArchiveNavGraph
import com.mustafacaliskan.naturearchive.ui.theme.NatureArchiveTheme

@Composable
fun NatureArchiveApp() {
    NatureArchiveTheme {
        val navController = rememberNavController()

        NatureArchiveNavGraph(
            navController = navController,
            modifier = Modifier.fillMaxSize()
        )
    }
}
