package com.edwinkapkei.tmdbclientmvvm.data.repository

import com.edwinkapkei.tmdbclientmvvm.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDataSource {
    suspend fun getMovies(): Response<MovieList>
}