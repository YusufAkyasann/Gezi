package com.example.gezi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.util.Patterns
import android.widget.Toast


class Giris : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_giris)


    }





    fun ucuncu(v: View) {
        val intent = Intent(this, Kategoriler::class.java)
        startActivity(intent)
    }

    fun besinci(v: View) {
        val intent = Intent(this, KayitOl::class.java)
        startActivity(intent)
    }
}





