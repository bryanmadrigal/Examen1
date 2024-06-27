package com.example.examen1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.examen1.databinding.FragmentAlcuadradoBinding

 class alcuadrado : Fragment() {
    private lateinit var Binding: FragmentAlcuadradoBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Binding = FragmentAlcuadradoBinding.inflate(layoutInflater)



        start()

        return Binding.root
    }

    public fun start() {
        Binding.Btnalcuadrado.setOnClickListener {
            val num1:Int = Binding.TfNum1.editText?.text.toString().toInt()
            val Resultado:Int = alcuadrado(num1)
            Binding.TvResultado.text = Resultado.toString()
        }

         }

     private fun alcuadrado (num1:Int): Int {
         return num1*num1

     }
    /*
     private fun alcuadrado(num1: Int, num11: Int) {

     }*/


 }

