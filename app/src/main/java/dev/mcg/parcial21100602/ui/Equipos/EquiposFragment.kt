package dev.mcg.parcial21100602.ui.Equipos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.mcg.parcial21100602.R
import dev.mcg.parcial21100602.ui.adapter.equiposAdapter
import dev.mcg.parcial21100602.ui.model.equiposModel


class EquiposFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fragment_equipos, container, false)

        val rvEquipos = view.findViewById<RecyclerView>(R.id.rvEquipos)
        rvEquipos.layoutManager = LinearLayoutManager(requireContext())
        rvEquipos.adapter = equiposAdapter(getEquipos())
        return view

    }
    private fun getEquipos(): List<equiposModel> {
        val lstEquipos: ArrayList<equiposModel> = ArrayList()
        lstEquipos.add(equiposModel(1,R.drawable.hp, "HP", "fdl0008LA", 3999.0))
        lstEquipos.add(equiposModel(2,R.drawable.asus, "Asus", "IdeaPad 0x1", 2999.0))
        lstEquipos.add(equiposModel(3,R.drawable.lenovo, "Lenovo", "M415", 4999.0))
        return lstEquipos

    }


}