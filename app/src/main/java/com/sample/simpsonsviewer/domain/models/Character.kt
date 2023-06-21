package com.sample.simpsonsviewer.domain.models

import com.sample.simpsonsviewer.network.dto.NetworkCharacter

data class Character(
    val id: Int,
    val name: String,
    val description: String,
    val imageUrl: String,
) {
    companion object{
        fun fromDto(dto: NetworkCharacter): Character {
            return Character(
                id = dto.id,
                name = dto.name,
                description = dto.description,
                imageUrl = dto.imageUrl,
            )
        }
    }
}