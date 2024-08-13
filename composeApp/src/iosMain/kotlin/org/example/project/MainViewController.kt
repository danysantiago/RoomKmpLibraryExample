package org.example.project

import androidx.compose.ui.window.ComposeUIViewController
import com.example.data.getRoomDatabase

fun MainViewController() = ComposeUIViewController { App(getRoomDatabase()) }