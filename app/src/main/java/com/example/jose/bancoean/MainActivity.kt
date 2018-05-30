package com.example.jose.bancoean

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.jose.bancoean.vista.ActividadAgregarCuenta

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonAbrirCuenta = findViewById<Button>(R.id.boton_agregar_cuenta)
        botonAbrirCuenta.setOnClickListener{
            val intent = Intent(this,ActividadAgregarCuenta::class.java){
                startActivity(intent)
            }
        }
    }
}
