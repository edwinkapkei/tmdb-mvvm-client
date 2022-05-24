package com.edwinkapkei.tmdbclientmvvm.domain.repository

import com.edwinkapkei.tmdbclientmvvm.data.model.artist.Artist

interface ArtistRepository {

    suspend fun getArtists(): List<Artist>?

    suspend fun updateArtists(): List<Artist>?
}