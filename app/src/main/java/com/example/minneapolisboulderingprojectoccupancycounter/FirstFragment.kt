package com.example.minneapolisboulderingprojectoccupancycounter

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import androidx.navigation.fragment.findNavController
import com.example.minneapolisboulderingprojectoccupancycounter.databinding.FragmentFirstBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val occupancyWebView = view?.findViewById<WebView>(R.id.occupancyWebView)
        if (occupancyWebView != null) {
            occupancyWebView.settings.javaScriptEnabled = true
            occupancyWebView.loadUrl("https://portal.rockgympro.com/portal/public/18a5ea0176c6494befd44f163f15750c/occupancy")
        }

        val fab = view?.findViewById<FloatingActionButton>(R.id.floatingActionButton)
        fab.setOnClickListener {
            val occupancyWebView = view?.findViewById<WebView>(R.id.occupancyWebView)
            if (occupancyWebView != null) {
                occupancyWebView.settings.javaScriptEnabled = true
                occupancyWebView.loadUrl("https://portal.rockgympro.com/portal/public/18a5ea0176c6494befd44f163f15750c/occupancy")
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }
}