package com.edwinkapkei.tmdbclientmvvm.domain.useCase

import com.edwinkapkei.tmdbclientmvvm.data.model.tvShow.TvShow
import com.edwinkapkei.tmdbclientmvvm.domain.repository.TvRepository

class UpdateTvShowsUseCase(private val tvRepository: TvRepository) {
    suspend fun execute(): List<TvShow>? = tvRepository.updateTvShows()
}