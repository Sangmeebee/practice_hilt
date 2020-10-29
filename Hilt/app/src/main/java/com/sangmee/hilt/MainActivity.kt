package com.sangmee.hilt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sangmee.hilt.data.local.LocalDataSourceImpl
import com.sangmee.hilt.data.remote.RemoteDataSourceImpl
import com.sangmee.hilt.data.repository.RepositoryImpl
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mainViewModel by lazy {
        val localDataSource = LocalDataSourceImpl()
        val remoteDataSource = RemoteDataSourceImpl()
        val repository = RepositoryImpl(localDataSource, remoteDataSource)
        MainViewModel(repository)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_output.text = mainViewModel.result
    }
}

