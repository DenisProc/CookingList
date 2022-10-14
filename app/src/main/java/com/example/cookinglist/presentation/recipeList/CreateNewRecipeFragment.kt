package com.example.cookinglist.presentation.recipeList

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cookinglist.R
import com.example.cookinglist.databinding.FragmentCreateNewRecipeBinding
import com.example.cookinglist.databinding.FragmentRecipeListBinding

class CreateNewRecipeFragment : Fragment(), IngredientsAdapter.Listener {
    private lateinit var binding: FragmentCreateNewRecipeBinding
    private val adapter = IngredientsAdapter(this)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCreateNewRecipeBinding.inflate(inflater)
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = CreateNewRecipeFragment()
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        binding.apply {
            ingredRecyclerView.layoutManager = LinearLayoutManager(activity)
            ingredRecyclerView.adapter = adapter
        }
        adapter.refresh()
    }

    override fun onClick() {
        TODO("Not yet implemented")
    }

    override fun onLongClick(): Boolean {
        TODO("Not yet implemented")
    }
    private fun initBtn(){
        binding.saveRecipe.setOnClickListener {  }
    }
}