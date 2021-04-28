package com.gokul.mynews.ui.latest_news

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.gokul.mynews.R
import com.gokul.mynews.databinding.LatestNewsBinding

class LatestNews: Fragment(R.layout.latest_news){
    private lateinit var binding: LatestNewsBinding
    private val viewModel by viewModels<LatestNewsVM>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = LatestNewsBinding.bind(view)
        binding.vm = viewModel
    }

}