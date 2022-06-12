package com.edwinkapkei.tmdbclientmvvm.data.repository

import com.edwinkapkei.tmdbclientmvvm.data.model.movie.MovieList
import retrofit2.Response

class MovieRemoteDataSourceImpl: MovieRemoteDataSource {
    override suspend fun getMovies(): Response<MovieList> {
        TODO("Not yet implemented")
    }
}