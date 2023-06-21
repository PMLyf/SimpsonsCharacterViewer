package com.sample.simpsonsviewer.domain.models

import com.sample.simpsonsviewer.network.dto.NetworkCharacter

data class Character(
    val id: Int,
    val name: String,
    val description: String,
    val imageUrl: String,
    val age: Int,
    val weight: Double,
    val height: Double,
    val hairColor: String,
    val professions: List<String>,
    val friends: List<String>
) {
    companion object{
        fun fromDto(dto: NetworkCharacter): Character {
            return Character(
                id = dto.id,
                name = dto.name,
                description = dto.description,
                imageUrl = dto.imageUrl,
                age = dto.age,
                weight = dto.weight,
                height = dto.height,
                hairColor = dto.hairColor,
                professions = dto.professions,
                friends = dto.friends
            )
        }
    }
}