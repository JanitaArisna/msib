package com.example.msib

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Nav() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Home") {
        composable("Home") {
            HomeScreen(navController = navController)
        }
        composable("1") {
            Screen1(navController = navController)
        }
        composable("2") {
            Screen2(navController = navController)
        }
        composable("3") {
            Screen3(navController = navController)
        }
    }
}
