package com.example.tugaspkti

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_form__input__data.*
import kotlinx.android.synthetic.main.activity_form__ubah__data.*

class Form_Ubah_Data : AppCompatActivity() {

    val JK = arrayOf("Laki - Laki", "Perempuan")
    val Agama = arrayOf("Islam", "Kristen", "Katolik", "Hindu", "Bundha", "Kong Hu Chu")
    val Pendidikan = arrayOf("TK/Paud", "SD", "SMP", "SMA/SMK/Sederajat", "D3", "S1", "S2", "S3", "Tidak Memiliki Pendidikan")
    val Pekerjaan = arrayOf("PNS", "TNI", "POLRI", "Tenaga Honorer", "Petani", "Ibu Rumah Tangga", "Wiraswasta", "Tidak Bekerja")
    val Status_Kesejahteraan = arrayOf("PKH", "BPNT", "BST", "BLTDD", "BLTAPBD")
    val Status_Perkawinan = arrayOf("Kawin", "Belum Kawin")
    val Status_Dalam_Keluarga = arrayOf("Kepala Keluarga", "Orangtua", "Istri", "Anak")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form__ubah__data)

        val AD_JK = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, JK)
        spinner6.adapter = AD_JK
        spinner6.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(this@Form_Ubah_Data, "Jenis Kelamin" + JK[position], Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        val AD_Pendidikan = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, Pendidikan)
        spinner10.adapter = AD_Pendidikan
        spinner10.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(this@Form_Ubah_Data, "Pendidiakn" + Pendidikan[position], Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }


        val AD_Pekerjaan = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, Pekerjaan)
        spinner14.adapter = AD_Pekerjaan
        spinner14.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(this@Form_Ubah_Data, "Pekerjaan" + Pekerjaan[position], Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        val AD_Agama= ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, Agama)
        spinner15.adapter = AD_Agama
        spinner15.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(this@Form_Ubah_Data, "Agama" + Agama[position], Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        val AD_Status_Perkawinan = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, Status_Perkawinan)
        spinner16.adapter = AD_Status_Perkawinan
        spinner16.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(this@Form_Ubah_Data, "Status Perkawinan" + Status_Perkawinan[position], Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        val AD_Status_Dalam_Keluarga = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, Status_Dalam_Keluarga)
        spinner17.adapter = AD_Status_Dalam_Keluarga
        spinner17.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(this@Form_Ubah_Data, "Status Dalam Keluarga" + Status_Dalam_Keluarga[position], Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        val AD_Status_Kesejahteraan = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, Status_Kesejahteraan)
        spinner18.adapter = AD_Status_Kesejahteraan
        spinner18.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(this@Form_Ubah_Data, "Status Kesejahteraan" + Status_Kesejahteraan[position], Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }


    }

    fun Siap(view: View) {
        finish()
    }
}