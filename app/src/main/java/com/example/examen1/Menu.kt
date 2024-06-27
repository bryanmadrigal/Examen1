package com.example.examen1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.examen1.databinding.FragmentMenuBinding
import com.example.examen1.databinding.FragmentRaizcuadradaBinding


class Menu : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val Binding:FragmentMenuBinding
       Binding =FragmentMenuBinding.inflate(layoutInflater)
        Binding.Btnalcuadrado.setOnClickListener {
            findNavController().navigate(R.id.go_alcuadrado)


        }
        Binding.Btnraizcuadrada.setOnClickListener {
            findNavController().navigate(R.id.go_raizcuadrada)
        }
        Binding.Btnantecesor.setOnClickListener {
            findNavController().navigate(R.id.go_antecesor)
        }
        Binding.BtnSucesor.setOnClickListener {
            findNavController().navigate(R.id.go_sucesor)
        }
        return Binding.root
    }


}

