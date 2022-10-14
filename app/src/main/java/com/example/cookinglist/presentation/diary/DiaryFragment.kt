package com.example.cookinglist.presentation.diary

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cookinglist.R

class DiaryFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_calory_diary, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() = DiaryFragment()
    }
}