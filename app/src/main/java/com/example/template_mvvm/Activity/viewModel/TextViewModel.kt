package com.example.template_mvvm.Activity.viewModel

import androidx.lifecycle.ViewModel

import com.example.template_mvvm.Activity.data.TextRepository
import com.example.template_mvvm.Activity.model.Text

class TextViewModel(private val repository: TextRepository) : ViewModel() {


    fun salva(text: String) = repository.salva(text)


}