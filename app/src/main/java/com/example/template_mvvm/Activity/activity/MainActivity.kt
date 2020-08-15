package com.example.template_mvvm.Activity.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProviders
import com.example.template_mvvm.Activity.viewModel.TextViewModel
import com.example.template_mvvm.Activity.viewModel.ViewModelFactory
import com.example.template_mvvm.R

class MainActivity : AppCompatActivity() {
    private val viewModel: TextViewModel by lazy {
        ViewModelProviders.of(this, ViewModelFactory).get(TextViewModel::class.java)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun publishText() {

        viewModel.salva("HelloWorld")

        Toast.makeText(this, "Seu Texto foi salvo com sucesso :D", Toast.LENGTH_LONG).show()
    }
}
