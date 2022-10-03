package com.example.daggerdemo.di

import com.example.daggerdemo.data.repository.MyRepositoryImpl
import com.example.daggerdemo.domain.repository.MyRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun bindMyRepository(myRepositoryImpl: MyRepositoryImpl): MyRepository


}