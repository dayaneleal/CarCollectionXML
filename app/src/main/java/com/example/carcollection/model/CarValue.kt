package com.example.carcollection.model

data class Car(
    val id: String,
    val value: CarValue
)

data class CarValue(
    val id: String,
    val name: String,
    val year: String,
    val licence: String,
    val imageUrl: String,
    val place: CarLocation?
)

data class CarLocation(
    val lat: Double,
    val long: Double
)
