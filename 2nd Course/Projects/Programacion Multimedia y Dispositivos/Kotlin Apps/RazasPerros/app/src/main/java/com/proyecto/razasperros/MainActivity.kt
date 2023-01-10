package com.proyecto.razasperros

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var razaList: ArrayList<Raza>
    private lateinit var razaAdapter: RazaAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        razaList = ArrayList()

        razaList.add(
            Raza(
                R.drawable.doberman,
                "Doberman",
                "Hembra: Entre 63cm y 68cm\n" + "Macho: Entre 68cm y 72cm",
                "Hembra: Entre 32kg y 35kg\n" +
                        "Macho: Entre 40kg y 45kg", "Color: Negro, Marrón",
                "Tipo de pelo: Raso, Corto",
                "Color de ojos: Marrón",
                getString(R.string.detalles_doberman)
            )
        )
        razaList.add(
            Raza(
                R.drawable.malamut,
                "Alaskan Malamute",
                "Entre 58cm y 63cm\n" +
                        "Macho: Entre 58cm y 63cm",
                "Hembra: Entre 34kg y 38kg\nMacho: Entre 34kg y 38kg",
                "Color: Azul, Negro",
                "Tipo de pelo: Largo",
                "Color de ojos: Marrón",
                getString(R.string.detalles_malamute)
            )
        )
        razaList.add(
            Raza(
                R.drawable.jamthud,
                "Jämthund",
                "Hembra: Entre 52cm y 60cm\nMacho: Entre 57cm y 65cm",
                "Hembra: Entre 25kg y 30kg\nMacho: Entre 25kg y 30kg",
                "Color: Azul",
                "Tipo de pelo: Largo",
                "Color de ojos: Marrón",
                getString(R.string.detalles_jamthund)
            )
        )
        razaList.add(
            Raza(
                R.drawable.pastoraleman,
                "Pastor Alemán",
                "Hembra: Entre 55cm y 60cm\nMacho: Entre 60cm y 65cm",
                "Hembra: Entre 22kg y 32kg\nMacho: Entre 30kg y 40kg",
                "Color: Negro, Marrón, Azul, Rojo",
                "Tipo de pelo: Corto, Largo",
                "Color de ojos: Marrón",
                getString(R.string.detalles_pastor_aleman)
            )
        )
        razaList.add(
            Raza(
                R.drawable.grifonbruselas,
                "Grifón de Bruselas",
                "Hembra: Entre 20cm y 28cm\nMacho: Entre 20cm y 28cm",
                "Hembra: Entre 3kg y 6kg\nMacho: Entre 3kg y 6kg",
                "Color: Rojo",
                "Tipo de pelo: Corto, Largo, Duro",
                "Color de ojos: Marrón",
                getString(R.string.grifon_bruselas)
            )
        )



        razaAdapter = RazaAdapter(razaList)
        recyclerView.adapter = razaAdapter

        razaAdapter.onItemClick = {
            val intent = Intent(this, DetallesActivity::class.java)
            intent.putExtra("raza", it)
            startActivity(intent)

        }
    }
}