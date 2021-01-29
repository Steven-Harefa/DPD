package com.example.tugaspkti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_form__tampil__data.*

class Form_Tampil_Data : AppCompatActivity() {

    val JK = arrayOf("Laki - Laki", "Perempuan")
    val Agama = arrayOf("Islam", "Kristen", "Katolik", "Hindu", "Bundha", "Kong Hu Chu")
    val Pendidikan = arrayOf("TK/Paud", "SD", "SMP", "SMA/SMK/Sederajat", "D3", "S1", "S2", "S3", "Tidak Memiliki Pendidikan")
    val Pekerjaan = arrayOf("PNS", "TNI", "POLRI", "Tenaga Honorer", "Petani", "Ibu Rumah Tangga", "Wiraswasta", "Tidak Bekerja")
    val Status = arrayOf("PKH", "BPNT", "BST", "BLTDD", "BLTAPBD")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form__tampil__data)

        val AD_JK = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, JK)
        spinner.adapter = AD_JK
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(this@Form_Tampil_Data, "Jenis Kelamin" + JK[position], Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        val AD_Pendidikan = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, Pendidikan)
        spinner2.adapter = AD_Pendidikan
        spinner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(this@Form_Tampil_Data, "Pendidikan" + Pendidikan[position], Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        val AD_Pekerjaan = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, Pekerjaan)
        spinner3.adapter = AD_Pekerjaan
        spinner3.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(this@Form_Tampil_Data, "Pekerjaan" + Pekerjaan[position], Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        val AD_Agama = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, Agama)
        spinner5.adapter = AD_Agama
        spinner5.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(this@Form_Tampil_Data, "Agama" + Agama[position], Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

    }

    fun Masuk_Form_Perkumpulan_Data(view: View) {
        var i = Intent(this, Form_Tempat_Data_Berkumpul::class.java)
        startActivity(i)
    }

}