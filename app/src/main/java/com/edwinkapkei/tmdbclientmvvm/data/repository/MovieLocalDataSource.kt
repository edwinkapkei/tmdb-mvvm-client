package com.edwinkapkei.tmdbclientmvvm.data.repository

import com.edwinkapkei.tmdbclientmvvm.data.model.movie.Movie

interface MovieLocalDataSource {
    suspend fun getMoviesFromDB(): List<Movie>
    suspend fun saveMoviesToDB(movies: List<Movie>)
    suspend fun clearAll()
}