package org.example.project

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.example.data.getRoomDatabase

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "KotlinProject",
    ) {
        App(getRoomDatabase())
    }
}