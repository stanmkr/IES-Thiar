package com.proyecto.razasperros

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RazaAdapter(private var listaRazas: ArrayList<Raza>) :
    RecyclerView.Adapter<RazaAdapter.RazaViewHolder>() {

    var onItemClick: ((Raza) -> Unit)? = null

    class RazaViewHolder(val itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imagenView: ImageView = itemView.findViewById(R.id.imageView)
        val nombreView: TextView = itemView.findViewById(R.id.tvNombre)
        val tamanyoView: TextView = itemView.findViewById(R.id.tvTamanyo)
        val pesoView: TextView = itemView.findViewById(R.id.tvPeso)
        val colorView: TextView = itemView.findViewById(R.id.tvColor)
        val tipoPeloView: TextView = itemView.findViewById(R.id.tvTipoPelo)
        val colorOjosView: TextView = itemView.findViewById(R.id.tvColorOjos)


    }
    fun setListaFiltrada(listaRazas: ArrayList<Raza>){
        this.listaRazas = listaRazas
        notifyDataSetChanged()
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RazaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_item, parent, false)
        return RazaViewHolder(view)
    }

    override fun onBindViewHolder(holder: RazaViewHolder, position: Int) {
        val raza = listaRazas[position]
        holder.imagenView.setImageResource(raza.image)
        holder.nombreView.text = raza.nombre
        holder.tamanyoView.text = raza.tamanyo
        holder.pesoView.text = raza.peso
        holder.colorView.text = raza.color
        holder.tipoPeloView.text = raza.tipoPelo
        holder.colorOjosView.text = raza.colorOjos


        holder.itemView.setOnClickListener {
            onItemClick?.invoke(raza)
        }
    }

    override fun getItemCount(): Int {
        return listaRazas.size
    }

}