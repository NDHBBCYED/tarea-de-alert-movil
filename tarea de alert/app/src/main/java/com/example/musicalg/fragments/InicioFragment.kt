package com.example.musicalg.fragments

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import android.widget.VideoView
import androidx.fragment.app.Fragment
import com.example.musicalg.R

class InicioFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_inicio, container, false)

        val videoView: VideoView = view.findViewById(R.id.videoView)

        // Obtén la URI del archivo de video desde res/raw
        val videoUri = Uri.parse("android.resource://" + requireActivity().packageName + "/" + R.raw.cat)

        // Configura el controlador de medios para el reproductor de video
        val mediaController = MediaController(requireContext())
        mediaController.setAnchorView(videoView)
        videoView.setMediaController(mediaController)

        // Configura la URI del video en el reproductor de video
        videoView.setVideoURI(videoUri)

        // Reproduce el video
        videoView.start()

        // Configura el listener para repetir el video cuando termine
        videoView.setOnCompletionListener { mediaPlayer ->
            mediaPlayer?.let {
                // Reinicia la reproducción del video
                it.seekTo(0)
                it.start()
            }
        }

        return view
    }
}
