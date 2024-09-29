package com.example.musicalg.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AlertDialog
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.musicalg.R

class RegistroFragment : NavHostFragment() {

    private lateinit var editTextName: EditText
    private lateinit var buttonSubmit: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_registro, container, false)

        editTextName = view.findViewById(R.id.editTextName)
        buttonSubmit = view.findViewById(R.id.buttonSubmit)

        buttonSubmit.setOnClickListener {
            val name = editTextName.text.toString().trim()

            if (name.isEmpty()) {
                showAlert("Debes completar todos los campos")
            } else {
                showWelcomeMessage(name)
            }
        }

        return view
    }

    private fun showAlert(message: String) {
        val builder = AlertDialog.Builder(requireContext())
        builder.setMessage(message)
            .setPositiveButton("Aceptar", null)
            .create()
            .show()
    }

    private fun showWelcomeMessage(name: String) {
        val welcomeMessage = "Bienvenido $name"
        val builder = AlertDialog.Builder(requireContext())
        builder.setMessage(welcomeMessage)
            .setPositiveButton("Aceptar") { _, _ ->
                // Navigate to the BienvenidaFragment
                navController.navigate(R.id.bienvenidaFragment)
            }
            .create()
            .show()
    }
}

