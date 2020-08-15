package com.example.template_mvvm.Activity.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.template_mvvm.Activity.data.TextRepository

object ViewModelFactory : ViewModelProvider.NewInstanceFactory() {

    private fun repository() = TextRepository()

    override fun <T : ViewModel?> create(modelClass: Class<T>): T = TextViewModel(repository()) as T

}