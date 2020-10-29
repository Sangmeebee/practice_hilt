package com.sangmee.hilt.data.remote

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Inject
import javax.inject.Singleton

class RemoteDataSourceImpl @Inject constructor() : RemoteDataSource {
    override fun getData(): String {
        return "remote"
    }
}

@Module
@InstallIn(ApplicationComponent::class)
abstract class RemoteDataSourceModule {
    @Binds
    @Singleton
    abstract fun bindRemoteDataSource(remoteDataSourceImpl: RemoteDataSourceImpl): RemoteDataSource
}
