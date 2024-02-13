package com.example.kotlin54.data.utils

data class UiState<T>(
    val isLoading : Boolean = true,
    val errorMessage:String? = null,
    val success: T? = null
)
