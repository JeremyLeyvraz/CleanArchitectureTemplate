package com.lj.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.lj.app.navigation.MainNavigation
import com.lj.app.ui.theme.TemplateTheme
import dagger.hilt.android.AndroidEntryPoint

/**
 * Main activity: define the navigation and the theme.
 */
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TemplateTheme {
                MainNavigation()
            }
        }
    }
}
