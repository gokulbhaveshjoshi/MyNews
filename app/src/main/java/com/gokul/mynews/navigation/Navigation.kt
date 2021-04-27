package com.gokul.mynews.navigation

import android.os.Bundle
import android.view.View
import androidx.navigation.NavDirections
import androidx.navigation.findNavController

/**
 * Navigate with destination id
 * */
fun View.navigateWithId(id: Int) = this.findNavController().navigate(id)

fun View.navigateWithBundle(id: Int, bundle : Bundle) = this.findNavController().navigate(id,bundle)

/**
 * Navigate with Nav Directions
 * */
fun View.navigateWithAction(action: NavDirections) = this.findNavController().navigate(action)

/**
 * Navigate to previous screen
 * */
fun View.navigateBack() = this.findNavController().navigateUp()
