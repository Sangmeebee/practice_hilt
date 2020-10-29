package com.sangmee.hilt

import com.sangmee.hilt.data.repository.Repository

class MainViewModel(private val repository: Repository) {

    val result = repository.getData()
}
