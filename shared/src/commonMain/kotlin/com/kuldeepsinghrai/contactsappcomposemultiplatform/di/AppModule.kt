package com.kuldeepsinghrai.contactsappcomposemultiplatform.di

import com.kuldeepsinghrai.contactsappcomposemultiplatform.contacts.domain.ContactDataSource

expect class AppModule {
    val contactDataSource: ContactDataSource
}