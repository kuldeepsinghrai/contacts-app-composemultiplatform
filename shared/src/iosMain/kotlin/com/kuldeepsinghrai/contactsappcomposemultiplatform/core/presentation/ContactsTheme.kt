package com.kuldeepsinghrai.contactsappcomposemultiplatform.core.presentation

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.kuldeepsinghrai.contactsappcomposemultiplatform.ui.theme.DarkColorScheme
import com.kuldeepsinghrai.contactsappcomposemultiplatform.ui.theme.LightColorScheme
import com.kuldeepsinghrai.contactsappcomposemultiplatform.ui.theme.Typography

@Composable
actual fun ContactsTheme(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if(darkTheme) DarkColorScheme else LightColorScheme,
        typography = Typography,
        content = content
    )
}