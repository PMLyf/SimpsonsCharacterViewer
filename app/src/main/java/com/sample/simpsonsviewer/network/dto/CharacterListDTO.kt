package com.sample.simpsonsviewer.network.dto

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
class NetworkCharacterContainer(val characters: List<NetworkCharacter>)

@JsonClass(generateAdapter = true)
class NetworkCharacter(
    val id: Int,
    val name: String,
    val description: String,
    val imageUrl: String,
    val height: Double,
)