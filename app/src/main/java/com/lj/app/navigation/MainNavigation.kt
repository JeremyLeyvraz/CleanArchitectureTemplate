package com.lj.app.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.lj.app.composable.HelloWorldComposable
import com.lj.app.composable.HelloViewModel

private const val HOME_DESTINATION = "home"

/**
 * Define the navigation through the application.
 */
@Composable
fun MainNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = HOME_DESTINATION) {
        composable(HOME_DESTINATION)
        {
            val viewModel = hiltViewModel<HelloViewModel>()
            HelloWorldComposable(viewModel)
        }
    }
}
