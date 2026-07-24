package com.mustafacaliskan.naturearchive.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.mustafacaliskan.naturearchive.ui.home.HomeScreen
import com.mustafacaliskan.naturearchive.ui.observation.NewObservationScreen
import com.mustafacaliskan.naturearchive.ui.observation.ObservationListScreen

@Composable
fun NatureArchiveNavGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    startDestination: String = Routes.Home
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(Routes.Home) {
            HomeScreen(
                onNewObservationClick = {
                    navController.navigate(Routes.NewObservation)
                },
                onMyObservationsClick = {
                    navController.navigate(Routes.ObservationList)
                }
            )
        }

        composable(Routes.NewObservation) {
            NewObservationScreen()
        }

        composable(Routes.ObservationList) {
            ObservationListScreen()
        }
    }
}
