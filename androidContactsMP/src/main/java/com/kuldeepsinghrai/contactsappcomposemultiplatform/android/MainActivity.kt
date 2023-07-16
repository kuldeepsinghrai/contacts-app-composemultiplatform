package com.kuldeepsinghrai.contactsappcomposemultiplatform.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.*
import androidx.compose.ui.platform.LocalContext
import com.kuldeepsinghrai.contactsappcomposemultiplatform.App
import com.kuldeepsinghrai.contactsappcomposemultiplatform.core.presentation.ImagePickerFactory
import com.kuldeepsinghrai.contactsappcomposemultiplatform.di.AppModule

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App(
                darkTheme = isSystemInDarkTheme(),
                dynamicColor = true,
                appModule = AppModule(LocalContext.current.applicationContext),
                imagePicker = ImagePickerFactory().createPicker()
            )
        }
    }
}