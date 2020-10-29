package com.sangmee.hilt.data.local

class LocalDataSourceImpl : LocalDataSource {
    override fun getData(): String {
        return "local"
    }
}
