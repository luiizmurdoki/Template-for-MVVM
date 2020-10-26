package com.example.template_mvvm.Activity.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProviders
import com.example.template_mvvm.Activity.viewModel.TextViewModel
import com.example.template_mvvm.Activity.viewModel.ViewModelFactory
import com.example.template_mvvm.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val viewModel: TextViewModel by lazy {
        ViewModelProviders.of(this, ViewModelFactory).get(TextViewModel::class.java)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

     private fun  setListeners(){
         //Cliando no botão chamamos a função publishText que chama a viewModel
         image.setOnClickListener {
             publishText()
         }
     }

    private fun publishText() {
        //aqui chamamos a funcão da viewModel que salva o texto que estamos enviamos
        viewModel.salva("HelloWorld")

        //o toast sobe um texto indicando o que a ação foi feita
        Toast.makeText(this, "Seu Texto foi salvo com sucesso :D", Toast.LENGTH_LONG).show()
    }


    //For images / para as imagens
    //<a href="https://stories.freepik.com/work">Illustration by Freepik Stories</a>
}
