package com.example.tugaspkti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }

    fun Masuk_Form_Tampil_Data(view: View) {
        var i = Intent(this, Form_Tampil_Data::class.java)
        startActivity(i)
    }

    fun Masuk_Form_Ubah_Data(view: View) {
        var i = Intent(this, Form_Ubah_Data::class.java)
        startActivity(i)
    }

    fun Masuk_Form_Input_Data(view: View) {
        var i = Intent(this, Form_Input_Data::class.java)
        startActivity(i)
    }

    fun Masuk_Form_Hapus_Data(view: View) {
        var i = Intent(this, Form_Hapus_Data::class.java)
        startActivity(i)
    }

    fun Masuk_Form_About_Us(view: View) {
        var i = Intent(this, Form__About_Us::class.java)
        startActivity(i)
    }

    fun Keluar(view: View) {
        finish()
    }
}