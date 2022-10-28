package com.example.myapptodoin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapptodoin.databinding.ActivityRegistrousuarioBinding
import com.example.myapptodoin.databinding.ActivityTodoinsomosBinding
import com.example.myapptodoin.databinding.TodoinvillavoBinding

class TodoinVillavo : AppCompatActivity() {
    private lateinit var binding: ActivityRegistrousuarioBinding //inicio aquí
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrousuarioBinding.inflate(layoutInflater) //continuo aquí
        val view = binding.root //
        setContentView(view)   //
        binding.btnregistroregistrar.setOnClickListener {
            startActivity(Intent(this,Login::class.java))
            Toast.makeText(this, "click en el botón Registrar", Toast.LENGTH_LONG).show()
        }

       /* binding.btnregistroinicio.setOnClickListener {
            startActivity(Intent(this, Inicio::class.java))
            }*/

        /* binding.btnregistrofoto.setOnClickListener {
     startActivity(Intent(this, Camera::class.java))

 }*/

    }
}

