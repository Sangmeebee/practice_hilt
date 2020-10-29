package com.sangmee.hilt

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.sangmee.hilt.data.repository.Repository

class MainViewModel @ViewModelInject constructor(private val repository: Repository) : ViewModel() {

    val result = repository.getData()
}
