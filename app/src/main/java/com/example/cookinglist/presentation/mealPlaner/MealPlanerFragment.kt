package com.example.cookinglist.presentation.mealPlaner

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cookinglist.R


class MealPlanerFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_meal_planer, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() = MealPlanerFragment()
    }
}