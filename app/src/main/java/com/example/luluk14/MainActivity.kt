package com.example.luluk14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Tpfl = findViewById<Button>(R.id.fragmentTPFL)
        val To = findViewById<Button>(R.id.fragmentTO)
        val Pplg = findViewById<Button>(R.id.fragmentPPLG)
        val Busana = findViewById<Button>(R.id.fragmentBusana)
        val Kuliner = findViewById<Button>(R.id.fragmentKuliner)

        Tpfl.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, Tpfl())
            fragmentTransaction.commit()
        }

        To.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, To())
            fragmentTransaction.commit()
        }

        Pplg.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, Pplg())
            fragmentTransaction.commit()
        }

        Busana.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, Busana())
            fragmentTransaction.commit()
        }

        Kuliner.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, Kuliner())
            fragmentTransaction.commit()
        }
    }
}