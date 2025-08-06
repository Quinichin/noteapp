package com.example.noteezy.utils.response

sealed class ResultStatus<out T> {
    data class Success<T>(val data: T) : ResultStatus<T>()
    data class Error(val message: String) : ResultStatus<Nothing>()
    object Loading : ResultStatus<Nothing>()
}