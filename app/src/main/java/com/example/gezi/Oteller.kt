package com.example.gezi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Oteller : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oteller)
    }
    fun otelegt(v: View) {
        val intent = Intent(this, tree::class.java)
        startActivity(intent)
    }
}