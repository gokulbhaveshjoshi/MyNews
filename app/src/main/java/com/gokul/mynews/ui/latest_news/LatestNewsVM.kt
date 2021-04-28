package com.gokul.mynews.ui.latest_news

import androidx.lifecycle.ViewModel
import com.gokul.mynews.R
import com.gokul.mynews.adapter.common_methodss.GenericAdapter
import com.gokul.mynews.databinding.ItemNewsBinding
import com.gokul.mynews.navigation.navigateWithId

class LatestNewsVM: ViewModel() {
    val adapter = object : GenericAdapter<ItemNewsBinding, String>(){
        override fun getResourceLayoutId() = R.layout.item_news
        override fun onBindHolder(holder: ItemNewsBinding, dataClass: String) {
            holder.CvMain.setOnClickListener {
                holder.root.navigateWithId(R.id.action_home2_to_newsDetails)
            }
        }    }


    init {
        adapter.submitList(listOf("1","2","3"))
        adapter.notifyDataSetChanged()
    }
}