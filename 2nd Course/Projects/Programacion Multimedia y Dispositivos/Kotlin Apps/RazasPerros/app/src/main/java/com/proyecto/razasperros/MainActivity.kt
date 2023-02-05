package com.proyecto.razasperros

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.SearchView

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var listaDeRazas: ArrayList<Raza>
    private lateinit var razaAdapter: RazaAdapter
    private lateinit var searchView: SearchView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        searchView = findViewById(R.id.searchView)

        listaDeRazas = ArrayList()
        anyadirRazas()

        razaAdapter = RazaAdapter(listaDeRazas)
        recyclerView.adapter = razaAdapter

        searchView.setOnQueryTextListener(object :SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                listaFiltrada(newText)
                return true
            }

        })
        razaAdapter.onItemClick = {
            val intent = Intent(this, DetallesActivity::class.java)
            intent.putExtra("raza", it)
            startActivity(intent)

        }
    }

   private fun listaFiltrada (query:String?){
       if (query!=null){
           val listaFiltrada = ArrayList<Raza>()
           for (i in listaDeRazas      ){
               if (i.nombre.lowercase(Locale.ROOT).contains(query))
                   listaFiltrada.add(i)
           }
           if (listaFiltrada.isEmpty()){
               Toast.makeText(this,"No se han encontrado coincidencias",Toast.LENGTH_SHORT).show()
           }else{
               razaAdapter.setListaFiltrada(listaFiltrada)
           }
       }
   }

   private fun anyadirRazas(){
        listaDeRazas.add(
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
        listaDeRazas.add(
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
        listaDeRazas.add(
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
        listaDeRazas.add(
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
        listaDeRazas.add(
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

    }
}