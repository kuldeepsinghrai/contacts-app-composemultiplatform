package com.kuldeepsinghrai.contactsappcomposemultiplatform.contacts.data

import com.kuldeepsinghrai.contactsappcomposemultiplatform.contacts.domain.Contact
import com.kuldeepsinghrai.contactsappcomposemultiplatform.core.data.ImageStorage
import database.ContactEntity

suspend fun ContactEntity.toContact(imageStorage: ImageStorage): Contact {
    return Contact(
        id = id,
        firstName = firstName,
        lastName = lastName,
        email = email,
        phoneNumber = phoneNumber,
        photoBytes = imagePath?.let { imageStorage.getImage(it) }
    )
}