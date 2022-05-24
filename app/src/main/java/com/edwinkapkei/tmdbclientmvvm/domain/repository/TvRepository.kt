package com.edwinkapkei.tmdbclientmvvm.domain.repository

import com.edwinkapkei.tmdbclientmvvm.data.model.tvShow.TvShow

interface TvRepository {

    suspend fun getTvShows(): List<TvShow>?

    suspend fun updateTvShows(): List<TvShow>?
}