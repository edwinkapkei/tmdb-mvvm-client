package com.edwinkapkei.tmdbclientmvvm.domain.useCase

import com.edwinkapkei.tmdbclientmvvm.data.model.artist.Artist
import com.edwinkapkei.tmdbclientmvvm.domain.repository.ArtistRepository

class UpdateArtistsUseCase(private val artistRepository: ArtistRepository) {
    suspend fun execute(): List<Artist>? = artistRepository.updateArtists()
}