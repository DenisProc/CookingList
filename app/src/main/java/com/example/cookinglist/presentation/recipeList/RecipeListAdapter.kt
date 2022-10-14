package com.example.cookinglist.presentation.recipeList

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cookinglist.R
import com.example.cookinglist.databinding.RecipeListCardviewBinding
import com.example.cookinglist.domain.Recipe


class RecipeListAdapter : RecyclerView.Adapter<RecipeListAdapter.RecipeListHolder>() {
    private var recipeList = listOf(Recipe("Рикотта"),Recipe("Картошка"),Recipe("Синабон"))

    class RecipeListHolder(item: View) : RecyclerView.ViewHolder(item) {
        private val binding = RecipeListCardviewBinding.bind(item)

        fun bind(recipe: Recipe) = with(binding) {
            recipeName.text = recipe.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeListHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.recipe_list_cardview, parent, false)
        return RecipeListHolder(view)
    }

    override fun onBindViewHolder(holder: RecipeListHolder, position: Int) {
        holder.bind(recipeList[position])
    }

    override fun getItemCount(): Int {
        return recipeList.size
    }

    fun refresh(){
        notifyDataSetChanged()
    }
    fun submitList(recipesList:List<Recipe>){
        recipeList = recipesList
        refresh()
    }
}