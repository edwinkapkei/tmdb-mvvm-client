package com.edwinkapkei.tmdbclientmvvm.domain.repository

import com.edwinkapkei.tmdbclientmvvm.data.model.movie.Movie

interface MovieRepository {

    suspend fun getMovies(): List<Movie>?

    suspend fun updateMovies(): List<Movie>?
}