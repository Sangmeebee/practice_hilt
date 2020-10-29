package com.sangmee.hilt.data.repository

import com.sangmee.hilt.data.local.LocalDataSourceImpl
import com.sangmee.hilt.data.remote.RemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Inject
import javax.inject.Singleton
import kotlin.random.Random

class RepositoryImpl @Inject constructor(
    private val localDataSource: LocalDataSourceImpl,
    private val remoteDataSource: RemoteDataSourceImpl
) : Repository {

    override fun getData(): String {
        return if (Random.nextBoolean()) {
            localDataSource.getData()
        } else {
            remoteDataSource.getData()
        }
    }
}

@Module
@InstallIn(ApplicationComponent::class)
abstract class RepositoryModule {

    //Repository를 요청하면 RepositoryImpl을 줄 수 있게 된다.
    @Binds
    @Singleton
    abstract fun bindRepository(repositoryImpl: RepositoryImpl): Repository
}
