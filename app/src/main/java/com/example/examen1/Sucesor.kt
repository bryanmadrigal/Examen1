package com.example.examen1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.examen1.databinding.FragmentAlcuadradoBinding
import com.example.examen1.databinding.FragmentAntecesorBinding
import com.example.examen1.databinding.FragmentSucesorBinding

class Sucesor : Fragment() {
    private lateinit var Binding: FragmentSucesorBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Binding = FragmentSucesorBinding.inflate(layoutInflater)



        start()

        return Binding.root
    }

    public fun start() {
        Binding.Btnsucesor.setOnClickListener {
            val num1:Int = Binding.TfNum1.editText?.text.toString().toInt()
            val Resultado:Int = Sucesor(num1)
            Binding.TvResultado.text = Resultado.toString()
        }

    }

    private fun Sucesor (num1:Int): Int {
        val a = num1 + 1
        return a * a * a

    }
    /*
     private fun Sucesor(num1: Int, num1: Int) {

     }*/


}

