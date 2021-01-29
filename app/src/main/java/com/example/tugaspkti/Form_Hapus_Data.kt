package com.example.tugaspkti

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Form_Hapus_Data : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form__hapus__data)
    }

    fun Selesai(view: View) {
        finish()
    }
}