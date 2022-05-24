package com.edwinkapkei.tmdbclientmvvm.data.model.tvShow


import com.google.gson.annotations.SerializedName

data class TvShowList(
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val tvShows: List<TvShow>
)