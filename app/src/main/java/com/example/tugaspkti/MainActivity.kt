package com.example.tugaspkti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun Masuk_Halam_Menu(view: View) {
        var Masuk = Intent(this, Menu::class.java)
        startActivity(Masuk)
    }

    fun Masuk_Form_Daftar_Akun(view: View) {
        var i = Intent(this, Form_Daftar_Akun::class.java)
        startActivity(i)
    }
}