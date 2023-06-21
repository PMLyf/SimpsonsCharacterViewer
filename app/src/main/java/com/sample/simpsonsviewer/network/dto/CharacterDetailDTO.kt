package com.sample.simpsonsviewer.network.dto

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
class NetworkCharacterDetailContainer(val characters: List<NetworkCharacter>)

@JsonClass(generateAdapter = true)
class NetworkDetailCharacter(
    val id: Int,
    val name: String,
    val description: String,
    val imageUrl: String,
    val height: Double,
    val age: Int,
    val weight: Double,
    val hairColor: String,
    val professions: List<String>,
    val friends: List<String>
)