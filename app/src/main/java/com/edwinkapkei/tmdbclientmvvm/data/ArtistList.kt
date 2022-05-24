package com.edwinkapkei.tmdbclientmvvm.data


import com.google.gson.annotations.SerializedName

data class ArtistList(
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val artists: List<Artist>
)