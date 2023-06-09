package com.example.xinwen.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.xinwen.model.RecommendRequest
import com.example.xinwen.db.Result

class RecommendViewModel:ViewModel() {
    private val _recommendLiveData = MutableLiveData<Result>()
    val recommendLiveData:LiveData<Result> = _recommendLiveData
    val recommendRequest =  RecommendRequest()
    fun recommend(){
        recommendRequest.recommendRequest(_recommendLiveData)
    }

}