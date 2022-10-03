package com.example.daggerdemo.domain.repository

interface MyRepository {
    suspend fun doNetworkCall()
}