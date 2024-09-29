package com.example.musicalg.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.musicalg.R
import android.widget.ArrayAdapter
import android.widget.ListView

class ContactoFragment : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflar el diseño del fragmento
        val rootView = inflater.inflate(R.layout.fragment_contacto, container, false)

        // Obtener referencia al ListView
        val listView: ListView = rootView.findViewById(R.id.listView)

        // Crear el adaptador con un diseño de elemento de lista personalizado
        val adapter = ArrayAdapter<String>(requireContext(), R.layout.list_item_contacto, R.id.textTitulo, mutableListOf())

        // Agregar elementos a la lista con título y descripción
        adapter.add("Nombre: Geronimo Guayara Rodríguez")
        adapter.add("Matricula: 2020-10314")

        // Establecer el adaptador en el ListView
        listView.adapter = adapter

        return rootView
    }
}
