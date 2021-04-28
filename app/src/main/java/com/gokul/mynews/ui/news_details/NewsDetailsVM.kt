package com.gokul.mynews.ui.news_details

import android.view.View
import androidx.lifecycle.ViewModel
import com.gokul.mynews.R
import com.gokul.mynews.navigation.navigateBack

class NewsDetailsVM: ViewModel() {
    fun onClick(view: View){
        when(view.id){
            R.id.ivBack ->{
                view.navigateBack()
            }
        }
    }
}