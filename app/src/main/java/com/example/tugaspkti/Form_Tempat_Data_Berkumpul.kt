package com.example.tugaspkti

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import  android.view.View
import android.widget.ListView
import com.google.firebase.database.*

class Form_Tempat_Data_Berkumpul : AppCompatActivity() {

    private lateinit var Sumber_Data : DatabaseReference
    private lateinit var List_Data_Penduduk_Baru : MutableList<Data_Penduduk>
    private lateinit var Item_List : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form__tempat__data__berkumpul)

        Sumber_Data = FirebaseDatabase.getInstance().getReference("Data Penduduk Desa")

        List_Data_Penduduk_Baru = mutableListOf()

        Item_List = findViewById(R.id.Tempat_Semua_Data)

        Sumber_Data.addValueEventListener(object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                if(snapshot.exists()){
                    for(i in snapshot.children){
                        val DP = i.getValue(Data_Penduduk::class.java)
                        if(DP != null){
                            List_Data_Penduduk_Baru.add(DP)
                        }
                    }

                    val Argus = Data_Penduduk_Adapter(applicationContext, R.layout.ruby, List_Data_Penduduk_Baru)
                    Item_List.adapter = Argus


                }
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

        })



    }
}