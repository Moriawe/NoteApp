package com.plcoding.cleanarchitecturenoteapp.feature_note.presentation.notes

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.plcoding.cleanarchitecturenoteapp.di.AppModule
import com.plcoding.cleanarchitecturenoteapp.feature_note.presentation.MainActivity
import com.plcoding.cleanarchitecturenoteapp.feature_note.presentation.util.Screen
import com.plcoding.cleanarchitecturenoteapp.ui.theme.CleanArchitectureNoteAppTheme
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import dagger.hilt.android.testing.UninstallModules
import org.junit.Before
import org.junit.Rule
import org.junit.jupiter.api.Assertions.*

@HiltAndroidTest
@UninstallModules(AppModule::class)
internal class NotesScreenTest {

    @get:Rule(order = 0)
    val hiltRule = HiltAndroidRule(this)

    @get:Rule(order = 1)
    val composeRule = createAndroidComposeRule<MainActivity>()

    @Before
    fun setUp() {
        hiltRule.inject()
        composeRule.setContent {
            val navController = rememberNavController()
            CleanArchitectureNoteAppTheme {
                NavHost(
                    navController = navController,
                    startDestination = Screen.NotesScreen.route
                ) {
                    composable(route = Screen.NotesScreen.route) {

                    }
                }
            }
        }
    }

}