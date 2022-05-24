package com.edwinkapkei.tmdbclientmvvm.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.edwinkapkei.tmdbclientmvvm.data.model.artist.Artist
import com.edwinkapkei.tmdbclientmvvm.data.model.movie.Movie
import com.edwinkapkei.tmdbclientmvvm.data.model.tvShow.TvShow

@Database(entities = [Movie::class, TvShow::class, Artist::class], version = 1, exportSchema = false)
abstract class TMDBDatabase : RoomDatabase() {

    abstract fun movieDao(): MovieDao
    abstract fun tvShowDao(): TvShowDao
    abstract fun artistDao(): ArtistDao
}