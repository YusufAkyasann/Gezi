package com.example.gezi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun ilk(view: View?) {
        startActivity(Intent(this@MainActivity, Giris::class.java))
    }
    fun ikinci(view: View?) {
        startActivity(Intent(this@MainActivity, KayitOl::class.java))
    }


}