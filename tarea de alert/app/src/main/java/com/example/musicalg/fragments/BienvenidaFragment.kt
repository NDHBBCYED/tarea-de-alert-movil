package com.example.musicalg.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.musicalg.R

class BienvenidaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.layout_bienvenida, container, false)

        // Aquí puedes realizar cualquier lógica adicional que desees para el fragmento oculto

        return view
    }

}
