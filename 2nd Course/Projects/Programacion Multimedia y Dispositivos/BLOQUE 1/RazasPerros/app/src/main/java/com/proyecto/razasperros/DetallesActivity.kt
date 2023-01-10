package com.proyecto.razasperros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.ImageView
import android.widget.TextView

class DetallesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalles)



        val raza = intent.getParcelableExtra<Raza>("raza")
        if (raza != null){
            val imagen:ImageView = findViewById(R.id.ivDetallesImagen)
            val nombreRaza:TextView = findViewById(R.id.tvDetallesTitulo)
            val detallesRaza: TextView = findViewById(R.id.tvDetallesRaza)
            val tituloDescripcion : TextView = findViewById(R.id.tvTituloDescripcion)


            nombreRaza.text = raza.nombre
            detallesRaza.text= raza.descripcionLarga
            detallesRaza.movementMethod = ScrollingMovementMethod()
            tituloDescripcion.text=getString(R.string.tituloDescripción)
            imagen.setImageResource(raza.image)
        }
    }
}