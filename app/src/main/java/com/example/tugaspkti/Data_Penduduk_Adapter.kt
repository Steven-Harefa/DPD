package com.example.tugaspkti

import android.annotation.SuppressLint
import android.content.Context
import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import kotlin.contracts.Returns


class Data_Penduduk_Adapter(val M_Data_Penduduk : Context, val Layout_Res_ID : Int, val List_Data_Penduduk : List<Data_Penduduk>) : ArrayAdapter<Data_Penduduk> (M_Data_Penduduk, Layout_Res_ID, List_Data_Penduduk){

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val LY : LayoutInflater = LayoutInflater.from(M_Data_Penduduk)
        val LHT : View = LY.inflate(Layout_Res_ID, null)

        val TKS = LHT.findViewById<TextView>(R.id.R_NIK)
        
        val Penduduk = List_Data_Penduduk[position]

        TKS.text = Penduduk.NIK

        return LHT
    }

}