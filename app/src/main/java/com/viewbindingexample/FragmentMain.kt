package com.viewbindingexample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.viewbindingexample.databinding.FragmentMainBinding

class FragmentMain : Fragment() {

    lateinit var binding: FragmentMainBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)
        binding.tvHelloWorld.text = "Yellow World!"

    }
}