package com.example.daggerdemo.data.repository

import android.app.Application
import com.example.daggerdemo.R
import com.example.daggerdemo.data.remote.MyApi
import com.example.daggerdemo.domain.repository.MyRepository
import javax.inject.Inject

class MyRepositoryImpl @Inject constructor(
    private val api: MyApi,
    private val appContext: Application
): MyRepository {

    init {
        val appName = appContext.getString(R.string.app_name)
        println("Hello from the repository. The app name is $appName")
    }

    override suspend fun doNetworkCall() {

    }
}