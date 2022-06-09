package com.example.gezi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Kutuphaneler : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kutuphaneler)
    }
    fun pasa(v: View) {
        val intent = Intent(this, pasa::class.java)
        startActivity(intent)
    }
}