package com.sangmee.hilt.data.remote

class RemoteDataSourceImpl : RemoteDataSource {
    override fun getData(): String {
        return "remote"
    }
}
