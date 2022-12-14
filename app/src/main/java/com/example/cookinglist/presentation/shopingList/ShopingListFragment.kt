package com.example.cookinglist.presentation.shopingList

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cookinglist.R

class ShopingListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_shoping_list, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() = ShopingListFragment()
    }
}