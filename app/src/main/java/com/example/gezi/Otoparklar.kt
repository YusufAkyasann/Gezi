package com.example.gezi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Otoparklar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otoparklar)
    }
    fun parket(v: View) {
        val intent = Intent(this, belediye::class.java)
        startActivity(intent)
    }
}