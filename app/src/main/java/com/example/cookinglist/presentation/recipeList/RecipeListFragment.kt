@file:Suppress("UNREACHABLE_CODE")

package com.example.cookinglist.presentation.recipeList

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cookinglist.R
import com.example.cookinglist.data.RecipeListRepositoryImpl
import com.example.cookinglist.databinding.FragmentRecipeListBinding
import com.example.cookinglist.domain.Recipe

class RecipeListFragment : Fragment() {
    private lateinit var binding: FragmentRecipeListBinding
    private val adapter = RecipeListAdapter()
    private val repository = RecipeListRepositoryImpl
    private val viewModel = RecipeListVIewModel(repository)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRecipeListBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView()
        binding.addButton.setOnClickListener {
            startCreateNewRecipeFragment()
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = RecipeListFragment()
    }

    private fun initRecyclerView() {
        binding.apply {
            recyclerView.layoutManager = LinearLayoutManager(activity)
            recyclerView.adapter = adapter
        }
        adapter.refresh()
    }

    private fun startCreateNewRecipeFragment() {
        requireActivity()
            .supportFragmentManager
            .beginTransaction()
            .addToBackStack("")
            .replace(R.id.fragment_container, CreateNewRecipeFragment.newInstance())
            .commit()
    }

}