package com.example.kotlin54.ui.actitvity

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kotlin54.data.BrawlStarsRepository
import com.example.kotlin54.data.model.ListItem
import com.example.kotlin54.data.utils.UiState


class BrawlStarsViewModel : ViewModel() {

    private val brawlStarsRepository = BrawlStarsRepository()
    private val _brawlStarsCharacterLiveData = MutableLiveData<UiState<List<ListItem>>>()
    val brawlStarsCharacterLiveData: LiveData<UiState<List<ListItem>>> =
        _brawlStarsCharacterLiveData

    init {
        Log.e("narte", "model")
        brawlStarsRepository.getCharacter(
            onResponse = { data ->
                Log.e("TAG", "bleach,$data")
                _brawlStarsCharacterLiveData.value = UiState(isLoading = false, success = data)
            },
            onFailure = { t ->

                Log.e("narte", "model,$t")
                _brawlStarsCharacterLiveData.value =
                    UiState(isLoading = false, errorMessage = t.message ?: "error")

            }
        )
    }
}