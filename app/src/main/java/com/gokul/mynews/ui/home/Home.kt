package com.gokul.mynews.ui.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.gokul.mynews.R
import com.gokul.mynews.databinding.HomeBinding

class Home: Fragment(R.layout.home) {

    lateinit var binding: HomeBinding
    private val viewModel by viewModels<HomeVM>()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = HomeBinding.bind(view)
        viewModel.childFragment =requireActivity().supportFragmentManager
        binding.vm = viewModel


    }
}