package com.example.gezi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class TarihiYerler : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tarihi_yerler)
    }
    fun kaleyetikla(v: View) {
        val intent = Intent(this, kale::class.java)
        startActivity(intent)
    }
}