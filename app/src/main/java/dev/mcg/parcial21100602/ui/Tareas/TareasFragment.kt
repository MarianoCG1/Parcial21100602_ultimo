package dev.mcg.parcial21100602.ui.Tareas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import dev.mcg.parcial21100602.R


class TareasFragment : Fragment() {

    var arrso = arrayOf("Salir a pasear", "Caminar", "Hacer las compras", "Ir a la universidad", "Lavar el auto")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_tareas, container, false)

        val lstTareas: ListView = view.findViewById(R.id.lstTareas)
        val adaptador = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, arrso)
        lstTareas.adapter = adaptador

        return view
    }


}