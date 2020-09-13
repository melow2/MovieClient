package com.khs.movieclient.repository

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.khs.movieclient.service.MovieAPIService
import com.khs.movieclient.service.RetrofitInstance
import com.khs.tmdbclientapp.model.Movie

class MovieRepository(
    private val application: Application
) {
    private val service:MovieAPIService? = RetrofitInstance.getInstance()
    private val movieList:MutableLiveData<List<Movie>> = MutableLiveData()
}