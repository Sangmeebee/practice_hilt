package com.sangmee.hilt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sangmee.hilt.data.local.LocalDataSourceImpl
import com.sangmee.hilt.data.remote.RemoteDataSourceImpl
import com.sangmee.hilt.data.repository.Repository
import com.sangmee.hilt.data.repository.RepositoryImpl
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

//    private val mainViewModel by lazy {
//        val localDataSource = LocalDataSourceImpl()
//        val remoteDataSource = RemoteDataSourceImpl()
//        val repository = RepositoryImpl(localDataSource, remoteDataSource)
//        MainViewModel(repository)
//    }

    //Inject 어노테이션 : 필드에 의존성 주입
    @Inject lateinit var repository: Repository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        tv_output.text = mainViewModel.result
        tv_output.text = repository.getData()
    }
}

