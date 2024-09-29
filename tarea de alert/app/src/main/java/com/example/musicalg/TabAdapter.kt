package com.example.musicalg

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.musicalg.fragments.InicioFragment
import com.example.musicalg.fragments.RegistroFragment
import com.example.musicalg.fragments.CancionesFragment
import com.example.musicalg.fragments.ContactoFragment


class TabAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> InicioFragment()
            1 -> RegistroFragment()
            2 -> CancionesFragment()
            3 -> ContactoFragment()
            else -> throw IllegalArgumentException("Invalid tab position")
        }
    }
}
