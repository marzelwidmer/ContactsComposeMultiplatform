package ch.keepcalm.kmm.contactscomposemultiplatform

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform