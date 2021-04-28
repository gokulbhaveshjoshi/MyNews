package com.gokul.mynews.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.gokul.mynews.ui.latest_news.LatestNews


@Suppress("DEPRECATION")
class MyNewsPageAdapter (fm : FragmentManager) : FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {    override fun getCount() = 3
    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> {
                LatestNews()
            }
            1 -> {
                LatestNews()
            }
            2 -> {
                LatestNews()
            }
            else -> null!!
        }
    }    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> {
                "Latest News"
            }
            1 -> {
                "Category"
            }
            2 -> {
                "Saved"
            }
            else -> ""
        }
    }}