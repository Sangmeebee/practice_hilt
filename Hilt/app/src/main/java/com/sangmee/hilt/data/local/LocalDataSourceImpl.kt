package com.sangmee.hilt.data.local

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Inject
import javax.inject.Singleton

class LocalDataSourceImpl @Inject constructor() : LocalDataSource {
    override fun getData(): String {
        return "local"
    }
}

@Module
@InstallIn(ApplicationComponent::class)
abstract class LocalDataSourceModule{

    @Binds
    @Singleton
    abstract fun bindLocalDataSource(localDataSourceImpl: LocalDataSourceImpl) : LocalDataSource
}
