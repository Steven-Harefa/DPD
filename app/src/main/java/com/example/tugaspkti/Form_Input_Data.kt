package com.example.tugaspkti

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_form__input__data.*

class Form_Input_Data : AppCompatActivity(), View.OnClickListener {

    val JK = arrayOf("Laki - Laki", "Perempuan")
    val Agama = arrayOf("Islam", "Kristen", "Katolik", "Hindu", "Bundha", "Kong Hu Chu")
    val Pendidikan = arrayOf("TK/Paud", "SD", "SMP", "SMA/SMK/Sederajat", "D3", "S1", "S2", "S3", "Tidak Memiliki Pendidikan")
    val Pekerjaan = arrayOf("PNS", "TNI", "POLRI", "Tenaga Honorer", "Petani", "Ibu Rumah Tangga", "Wiraswasta", "Tidak Bekerja")
    val Status_Kesejahteraan = arrayOf("PKH", "BPNT", "BST", "BLTDD", "BLTAPBD")
    val Status_Perkawinan = arrayOf("Kawin", "Belum Kawin")
    val Status_Dalam_Keluarga = arrayOf("Kepala Keluarga", "Orangtua", "Istri", "Anak")

    private lateinit var NIK : EditText
    private lateinit var No_Induk_Desa : EditText
    private lateinit var No_KK : EditText
    private lateinit var Nama : EditText
    private lateinit var Gender : Spinner
    private lateinit var Tempat_Lahir : EditText
    private lateinit var Tanggal_Lahir : EditText
    private lateinit var Pendi : Spinner
    private lateinit var Peker : Spinner
    private lateinit var Alamat_Dom : EditText
    private lateinit var Aga : Spinner
    private lateinit var SP : Spinner
    private lateinit var SDK : Spinner
    private lateinit var SK : Spinner
    private lateinit var NA : EditText
    private lateinit var NI : EditText
    private lateinit var NKA : EditText

    private lateinit var Tombol_Simpan : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form__input__data)

        val AD_JK = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, JK)
        spinner4.adapter = AD_JK
        spinner4.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(this@Form_Input_Data, "Jenis Kelamin" + JK[position], Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        val AD_Pendidikan = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, Pendidikan)
        spinner7.adapter = AD_Pendidikan
        spinner7.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(this@Form_Input_Data, "Pendidikan" + Pendidikan[position], Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        val AD_Pekerjaan = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, Pekerjaan)
        spinner8.adapter = AD_Pekerjaan
        spinner8.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(this@Form_Input_Data, "Pekerjaan" + Pekerjaan[position], Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        val AD_Agama= ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, Agama)
        spinner9.adapter = AD_Agama
        spinner9.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(this@Form_Input_Data, "Agama" + Agama[position], Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        val AD_Status_Perkawinan = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, Status_Perkawinan)
        spinner11.adapter = AD_Status_Perkawinan
        spinner11.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(this@Form_Input_Data, "Status Perkawinan" + Status_Perkawinan[position], Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        val AD_Status_Dalam_Keluarga = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, Status_Dalam_Keluarga)
        spinner12.adapter = AD_Status_Dalam_Keluarga
        spinner12.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(this@Form_Input_Data, "Status Dalam Keluarga" + Status_Dalam_Keluarga[position], Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        val AD_Status_Kesejahteraan = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, Status_Kesejahteraan)
        spinner13.adapter = AD_Status_Kesejahteraan
        spinner13.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(this@Form_Input_Data, "Status Kesejahteraan" + Status_Kesejahteraan[position], Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        NIK = findViewById(R.id.editTextTextPersonName4)
        No_Induk_Desa = findViewById(R.id.editTextTextPersonName5)
        No_KK = findViewById(R.id.editTextTextPersonName6)
        Nama = findViewById(R.id.editTextTextPersonName7)
        Gender = findViewById(R.id.spinner4)
        Tempat_Lahir = findViewById(R.id.editTextTextPersonName9)
        Tanggal_Lahir = findViewById(R.id.editTextTextPersonName10)
        Pendi = findViewById(R.id.spinner7)
        Peker = findViewById(R.id.spinner8)
        Alamat_Dom = findViewById(R.id.editTextTextPersonName13)
        Aga = findViewById(R.id.spinner9)
        SP = findViewById(R.id.spinner11)
        SDK = findViewById(R.id.spinner12)
        SK = findViewById(R.id.spinner13)
        NA = findViewById(R.id.editTextTextPersonName17)
        NI = findViewById(R.id.editTextTextPersonName18)
        NKA = findViewById(R.id.editTextTextPersonName19)



        Tombol_Simpan = findViewById(R.id.button2)
        Tombol_Simpan.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        Fun_Save_Data()
        Selesai()
    }

    private fun Fun_Save_Data(){
        val T_NIK = NIK.text.toString().trim()
        val T_No_Induk_Desa = No_Induk_Desa.text.toString().trim()
        val T_KK = No_KK.text.toString().trim()
        val T_Nama = Nama.text.toString().trim()
        val T_JK = Gender.selectedItem.toString().trim()
        val T_Tempat_Lahir = Tempat_Lahir.text.toString().trim()
        val T_Tanggal_Lahir = Tanggal_Lahir.text.toString().trim()
        val T_Pendidikan = Pendi.selectedItem.toString().trim()
        val T_Pekerjaan = Peker.selectedItem.toString().trim()
        val T_Alamat_Domisili = Alamat_Dom.text.toString().trim()
        val T_Agama = Aga.selectedItem.toString().trim()
        val T_SP = SP.selectedItem.toString().trim()
        val T_SDK = SDK.selectedItem.toString().trim()
        val T_SK = SK.selectedItem.toString().trim()
        val T_NA = NA.text.toString().trim()
        val T_NI = NI.text.toString().trim()
        val T_NKA = NKA.text.toString().trim()

        if(T_NIK.isEmpty()){
            NIK.error = "Isi NIK"
            return
        }

        val Ref = FirebaseDatabase.getInstance().getReference("Data Penduduk Desa")

        val D_NIK = Ref.push().key

        val Masuk = Data_Penduduk(T_NIK)

//        , T_No_Induk_Desa, T_KK, T_Nama, T_JK, T_Tempat_Lahir, T_Tanggal_Lahir, T_Pendidikan, T_Pekerjaan, T_Alamat_Domisili, T_Agama, T_SP, T_SDK, T_SK, T_NA, T_NI, T_NKA

        if (D_NIK != null) {
            Ref.child(D_NIK).setValue(Masuk)
        }

    }

    private fun Selesai() {
        NIK.text.clear()
        No_Induk_Desa.text.clear()
        No_KK.text.clear()
        Nama.text.clear()
        Tempat_Lahir.text.clear()
        Tanggal_Lahir.text.clear()
        Alamat_Dom.text.clear()
        NA.text.clear()
        NI.text.clear()
        NKA.text.clear()
    }

}