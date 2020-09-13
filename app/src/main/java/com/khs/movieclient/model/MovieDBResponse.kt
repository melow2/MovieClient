package com.khs.tmdbclientapp.model

import com.google.gson.annotations.SerializedName

/**
 *
 *@auther hyeoksin
 *@since
 */

data class MovieDBResponse(
    @SerializedName("page")
    val page: Int,
    @SerializedName("total_results")
    val totalResults: Int,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("results")
    val movies: ArrayList<Movie>? = arrayListOf()
)