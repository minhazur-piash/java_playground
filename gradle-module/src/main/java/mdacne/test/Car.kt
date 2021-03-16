package mdacne.test

import kotlinx.serialization.Serializable

interface Car {
    var name: String

    @Serializable
    data class Default(override var name: String) : Car
}