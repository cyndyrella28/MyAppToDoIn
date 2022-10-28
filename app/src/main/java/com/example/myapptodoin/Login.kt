package com.example.myapptodoin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapptodoin.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding  //para que un usuario x se pueda loguear
    override fun onCreate(savedInstanceState:Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btnloginingresar.setOnClickListener {
            val Usuario= binding.txtusuario.text.toString()
            val Contraseña = binding.txtcontrasena.text.toString()
            if (Usuario.isEmpty()&&Contraseña.isEmpty()) {
                Toast.makeText(this, "No puedes tener datos nulos", Toast.LENGTH_SHORT).show()
            }
            if (Usuario=="pepe"&&Contraseña=="12345") {
                startActivity(Intent(this, TodoinVillavo::class.java))
            } else {
                Toast.makeText(this, "Datos incorrectos", Toast.LENGTH_LONG).show()
            }
        }
    }
}
