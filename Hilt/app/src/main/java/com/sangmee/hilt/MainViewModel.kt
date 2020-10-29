package com.sangmee.hilt

import com.sangmee.hilt.data.repository.RepositoryImpl

class MainViewModel {

    private val repository = RepositoryImpl()
    val result = repository.getData()
}
