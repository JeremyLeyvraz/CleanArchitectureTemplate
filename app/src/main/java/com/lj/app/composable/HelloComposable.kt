package com.lj.app.composable

import androidx.compose.material.Text
import androidx.compose.runtime.Composable

/**
 * Display a 'Hello' message.
 */
@Composable
fun HelloWorldComposable(viewModel: HelloViewModel) {
    Text(text = viewModel.getText())
}