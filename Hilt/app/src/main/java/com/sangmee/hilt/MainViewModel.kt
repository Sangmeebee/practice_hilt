package com.sangmee.hilt

import com.sangmee.hilt.data.repository.Repository
import javax.inject.Inject

class MainViewModel @Inject constructor(private val repository: Repository) {

    val result = repository.getData()
}
