package com.example.musicalg.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.musicalg.R
import android.text.Html
import android.text.method.LinkMovementMethod
import com.example.musicalg.databinding.FragmentCancionesBinding

class CancionesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_canciones, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentCancionesBinding.bind(view)
        val textView2 = binding.textView2
        val textView3 = binding.textView3

        val textView2Link = getString(R.string.textview2_link)
        val textView2Url = getString(R.string.textview2_url)
        val textView3Link = getString(R.string.textview3_link)
        val textView3Url = getString(R.string.textview3_url)

        val textView2Text = "<a href='$textView2Url'>$textView2Link</a>"
        val textView3Text = "<a href='$textView3Url'>$textView3Link</a>"

        textView2.text = Html.fromHtml(textView2Text)
        textView2.movementMethod = LinkMovementMethod.getInstance()

        textView3.text = Html.fromHtml(textView3Text)
        textView3.movementMethod = LinkMovementMethod.getInstance()
    }

}
