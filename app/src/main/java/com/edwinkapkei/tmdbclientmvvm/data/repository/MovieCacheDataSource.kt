package com.edwinkapkei.tmdbclientmvvm.data.repository

import com.edwinkapkei.tmdbclientmvvm.data.model.movie.Movie

interface MovieCacheDataSource {
    suspend fun getMoviesFromCache(): List<Movie>
    suspend fun saveMoviesToCache(movies: List<Movie>)
}