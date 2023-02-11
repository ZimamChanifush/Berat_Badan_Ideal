package com.example.beratbadanideal_zimamchanifushs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var Nama : EditText
    private lateinit var Tb : EditText
    private lateinit var rblakilaki : RadioButton
    private lateinit var rbperempuan : RadioButton
    private lateinit var Hasil : TextView
    private lateinit var proses : Button

    private var tb : Int =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Nama = findViewById(R.id.Etnama)
        Tb = findViewById(R.id.Ettb)
        rblakilaki = findViewById(R.id.rblaki2)
        rbperempuan = findViewById(R.id.rbpermpuan)
        Hasil = findViewById(R.id.TxtKg)
        proses = findViewById(R.id.btnproses)
       proses .setOnClickListener {
           var tinggi = Tb.text.toString().toInt()

           if (rblakilaki.isChecked){
               tb = (tinggi - 100) - (tinggi - 100) * (10/100)
               Hasil.setText(tb.toString() + "Kg")
           }else{
               tb  = (tinggi - 100) - (tinggi - 100) * (15/100)
               Hasil.setText(tb.toString() + "Kg")
           }
       }

    }

}