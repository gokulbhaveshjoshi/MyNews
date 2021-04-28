package com.gokul.mynews.ui.home

import androidx.fragment.app.FragmentManager
import androidx.lifecycle.ViewModel
import com.gokul.mynews.adapter.MyNewsPageAdapter

class HomeVM: ViewModel() {
    lateinit var childFragment : FragmentManager

    val myNewsAdapter by lazy { MyNewsPageAdapter(childFragment) }
}