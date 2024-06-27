package com.example.examen1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.examen1.databinding.FragmentRaizcuadradaBinding
import kotlin.math.sqrt

class Raizcuadrada : Fragment() {
    private lateinit var Binding: FragmentRaizcuadradaBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Binding = FragmentRaizcuadradaBinding.inflate(layoutInflater)



        start()

        return Binding.root
    }

    public fun start() {

        Binding.Btnraizcuadrada.setOnClickListener {
            val num1:Double = Binding.TfNum1.editText?.text.toString().toDouble()
            val Resultado:Double = raizcuadrada(num1)
            Binding.TvResultado.text = Resultado.toDouble().toString()
        }

    }

    private fun raizcuadrada (num1:Double): Double {
        return sqrt(num1)

    }
    /*
     private fun raizcuadrada(num1: Int, num11: Int) {

     }*/


}





