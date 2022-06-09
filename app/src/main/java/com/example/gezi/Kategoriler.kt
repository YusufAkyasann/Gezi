package com.example.gezi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Kategoriler : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kategoriler)
    }
    fun tarih(v: View) {
        val intent = Intent(this, TarihiYerler::class.java)
        startActivity(intent)
    }
    fun park(v: View) {
        val intent = Intent(this, Parklar::class.java)
        startActivity(intent)
    }
    fun cami(v: View) {
        val intent = Intent(this, IbadetYerleri::class.java)
        startActivity(intent)
    }
    fun kutuphane(v: View) {
        val intent = Intent(this, Kutuphaneler::class.java)
        startActivity(intent)
    }
    fun mark(v: View) {
        val intent = Intent(this, Marketler::class.java)
        startActivity(intent)
    }
    fun otel(v: View) {
        val intent = Intent(this, Oteller::class.java)
        startActivity(intent)
    }
    fun oto(v: View) {
        val intent = Intent(this, Otoparklar::class.java)
        startActivity(intent)
    }
}