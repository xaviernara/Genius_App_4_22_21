package com.example.genius.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.genius.model.GeniusSearchResponse
import com.example.genius.repo.GeniusRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val geniusRepo:GeniusRepo) : ViewModel() {

    //For recyclerView
    private val geniusSearchResponseListMLD : MutableLiveData<List<GeniusSearchResponse>> = TODO()

    //for details fragment
    private val geniusSearchResponseMLD : MutableLiveData<GeniusSearchResponse> = TODO()


    val geniusSearchResponseLD = geniusRepo.geniusSearchFlow.asLiveData(viewModelScope.coroutineContext)








}