package com.sangmee.hilt.data.repository

import com.sangmee.hilt.data.local.LocalDataSourceImpl
import com.sangmee.hilt.data.remote.RemoteDataSourceImpl
import kotlin.random.Random

class RepositoryImpl(
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
