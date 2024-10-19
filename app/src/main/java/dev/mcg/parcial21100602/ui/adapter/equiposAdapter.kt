package dev.mcg.parcial21100602.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.mcg.parcial21100602.R
import dev.mcg.parcial21100602.ui.model.equiposModel

class equiposAdapter (private var lstEquipos: List<equiposModel>):

    RecyclerView.Adapter<equiposAdapter.ViewHolder>(){

        class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
            val ivEquipo: ImageView = itemView.findViewById(R.id.ivEquipo)
            val tvMarca: TextView = itemView.findViewById(R.id.tvMarca)
            val tvModelo: TextView = itemView.findViewById(R.id.tvModelo)
            val tvCosto: TextView = itemView.findViewById(R.id.tvCosto)

        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            return ViewHolder(layoutInflater.inflate(R.layout.item_equipos, parent, false))

        }

        override fun getItemCount(): Int {
            return lstEquipos.size
        }
        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val item = lstEquipos[position]
            holder.ivEquipo.setImageResource(item.imagen)
            holder.tvMarca.text = item.marca
            holder.tvModelo.text = item.modelo
            holder.tvCosto.text = item.costo.toString()

        }


    }