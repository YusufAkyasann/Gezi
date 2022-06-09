package com.example.gezi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class IbadetYerleri : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ibadet_yerleri)
    }
    fun ibadetegit(v: View) {
        val intent = Intent(this, uluc::class.java)
        startActivity(intent)
    }
}