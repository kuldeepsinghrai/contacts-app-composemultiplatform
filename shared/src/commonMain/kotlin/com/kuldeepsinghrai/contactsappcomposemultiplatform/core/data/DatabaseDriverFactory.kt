package com.kuldeepsinghrai.contactsappcomposemultiplatform.core.data

import com.squareup.sqldelight.db.SqlDriver

expect class DatabaseDriverFactory {
    fun create(): SqlDriver
}