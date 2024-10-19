package dev.mcg.parcial21100602.ui.Gastos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import dev.mcg.parcial21100602.R


class GastosFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootview: View = inflater.inflate(R.layout.fragment_gastos, container, false)


        val etIngresoFijo = rootview.findViewById<EditText>(R.id.etIngreso)
        val etGastoFijo = rootview.findViewById<EditText>(R.id.etGastoFijo)
        val etGastoVariable = rootview.findViewById<EditText>(R.id.etGastoVariable)
        val btnCalcular = rootview.findViewById<Button>(R.id.btnCalcular)
        val tvResultado = rootview.findViewById<TextView>(R.id.tvResultad)

        btnCalcular.setOnClickListener {
            val ingresoFijo = etIngresoFijo.text.toString()
            val gastoFijo = etGastoFijo.text.toString()
            val gastoVariable = etGastoVariable.text.toString()

            if(ingresoFijo.isNotEmpty() && gastoFijo.isNotEmpty() && gastoVariable.isNotEmpty()){

                val ingf = ingresoFijo.toFloat()
                val gf = gastoFijo.toFloat()
                val gv = gastoVariable.toFloat()

                if(ingf > 0 && gf > 0 && gv > 0){
                    val saldo = ingf - (gf + gv)
                    tvResultado.text = "Saldo: $saldo"
                }else{
                    tvResultado.text = "Ingrese valores válidos (mayores a cero)"
                }


            }

        }
        return rootview



    }

}