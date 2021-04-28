package com.gokul.mynews.util

import androidx.databinding.BindingAdapter
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager

object BindingAdapter {


    @BindingAdapter(value = ["recyclerAdapter"], requireAll = false)
    @JvmStatic
    fun RecyclerView.setRecyclerAdapter(adapter: RecyclerView.Adapter<*>) {
        this.adapter = adapter
    }


    @BindingAdapter(value = ["setPagerAdapter"], requireAll = false)
    @JvmStatic
    fun ViewPager.setRecyclerAdapter(adapter: FragmentStatePagerAdapter) {
        this.adapter = adapter
    }


}