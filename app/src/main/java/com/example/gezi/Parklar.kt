package com.example.gezi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Parklar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parklar)
    }
    fun parkatikla(v: View) {
        val intent = Intent(this, akdag::class.java)
        startActivity(intent)
    }
}