package com.example.jose.bancoean.vista

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.jose.bancoean.R

class ActividadAgregarCuenta : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actividad_agregar_cuenta)

        val botonRegresar = findViewById<Button>(R.id.boton_regresar)

        botonRegresar.setOnClickListener{
            finish()
        }

        val botonAgregar = findViewById<Button>(R.id.boton_guardar)
        botonAgregar.setOnClickListener{
            val txtNumero = findViewById<EditText>(R.id.Numero_text)
            val txtNombre = findViewById<EditText>(R.id.Nombre_rext)
            val txtSaldo = findViewById<EditText>(R.id.Saldo_text)

            try {
                val num = txtNumero.text.toString().toInt()
                val nom = txtNombre.text.toString().toUpperCase()
                val saldo = txtSaldo.text.toString().toInt()
            }
            catch (e:Exception){
                Toast.makeText(this,e.message,Toast.LENGTH_SHORT).show()
            }
        }
    }
}
