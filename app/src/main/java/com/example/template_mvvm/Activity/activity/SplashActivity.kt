package com.example.template_mvvm.Activity.activity

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity
import com.example.template_mvvm.R


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        timer()
    }

    private fun timer (){
        val timer = object: CountDownTimer(3000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
            }
            override fun onFinish() {
                openHome()
            }
        }
        timer.start()
    }

    fun openHome(){
        intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}