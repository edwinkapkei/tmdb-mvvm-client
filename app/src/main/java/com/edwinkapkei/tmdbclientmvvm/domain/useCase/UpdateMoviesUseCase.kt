package com.edwinkapkei.tmdbclientmvvm.domain.useCase

import com.edwinkapkei.tmdbclientmvvm.data.model.movie.Movie
import com.edwinkapkei.tmdbclientmvvm.domain.repository.MovieRepository

class UpdateMoviesUseCase(private val movieRepository: MovieRepository) {

    suspend fun execute(): List<Movie>? = movieRepository.updateMovies()
}