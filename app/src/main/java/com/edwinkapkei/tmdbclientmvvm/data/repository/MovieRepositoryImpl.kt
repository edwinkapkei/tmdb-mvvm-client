package com.edwinkapkei.tmdbclientmvvm.data.repository

import com.edwinkapkei.tmdbclientmvvm.data.model.movie.Movie
import com.edwinkapkei.tmdbclientmvvm.domain.repository.MovieRepository

class MovieRepositoryImpl: MovieRepository {
    override suspend fun getMovies(): List<Movie>? {
        TODO("Not yet implemented")
    }

    override suspend fun updateMovies(): List<Movie>? {
        TODO("Not yet implemented")
    }
}