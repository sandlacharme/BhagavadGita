package com.example.bhagavadgita

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RelativeLayout

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
       /* val layout  = findViewById<RelativeLayout>(R.id.layout_splash_screen)
        layout.setOnClickListener(){
            startActivity(Intent(this, MainActivity::class.java))
        }*/



    }
}