package com.kuldeepsinghrai.contactsappcomposemultiplatform.di

import com.kuldeepsinghrai.contactsappcomposemultiplatform.contacts.data.SqlDelightContactDataSource
import com.kuldeepsinghrai.contactsappcomposemultiplatform.contacts.domain.ContactDataSource
import com.kuldeepsinghrai.contactsappcomposemultiplatform.core.data.DatabaseDriverFactory
import com.kuldeepsinghrai.contactsappcomposemultiplatform.core.data.ImageStorage
import com.kuldeepsinghrai.contactsappcomposemultiplatform.database.ContactDatabase

actual class AppModule {

    actual val contactDataSource: ContactDataSource by lazy {
        SqlDelightContactDataSource(
            db = ContactDatabase(
                driver = DatabaseDriverFactory().create()
            ),
            imageStorage = ImageStorage()
        )
    }
}