package com.example.examen1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.examen1.databinding.FragmentAlcuadradoBinding
import com.example.examen1.databinding.FragmentAntecesorBinding

class Antecesor : Fragment() {
    private lateinit var Binding: FragmentAntecesorBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Binding = FragmentAntecesorBinding.inflate(layoutInflater)



        start()

        return Binding.root
    }

    public fun start() {
        Binding.Btnantecesor.setOnClickListener {
            val num1:Int = Binding.TfNum1.editText?.text.toString().toInt()
            val Resultado:Int = antecesor(num1)
            Binding.TvResultado.text = Resultado.toString()
        }

    }

    private fun antecesor (num1:Int): Int {
        return num1 -1

    }
    /*
     private fun antecesor(num1: Int, num1: Int) {

     }*/


}


