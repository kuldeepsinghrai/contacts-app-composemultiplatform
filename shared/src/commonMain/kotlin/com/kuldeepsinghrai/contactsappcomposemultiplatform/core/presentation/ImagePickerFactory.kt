package com.kuldeepsinghrai.contactsappcomposemultiplatform.core.presentation

import androidx.compose.runtime.Composable

expect class ImagePickerFactory {

    @Composable
    fun createPicker(): ImagePicker
}