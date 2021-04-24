package com.example.genius.viewmodel

import androidx.lifecycle.*
import com.example.genius.model.geniusSearch.GeniusSearchResponse
import com.example.genius.repo.GeniusRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val geniusRepo:GeniusRepo) : ViewModel() {

    //For recyclerView
    private val geniusSearchResponseListMLD : MutableLiveData<List<GeniusSearchResponse>> = TODO()

    //for details fragment
    private val geniusSearchResponseMLD : MutableLiveData<GeniusSearchResponse> = TODO()


    val geniusSearchResponseListLD = geniusRepo.geniusSearchFlow.asLiveData(viewModelScope.coroutineContext)

    val geniusResponseLD : LiveData<GeniusSearchResponse>
        get() = geniusSearchResponseMLD




    fun createGeniusResponse(artistName: String ){

        viewModelScope.launch(Dispatchers.IO){
           val geniusSearch =  geniusRepo.createGeniusSearchResponse(artistName)
            geniusSearchResponseMLD.postValue(geniusSearch)
        }
    }








}