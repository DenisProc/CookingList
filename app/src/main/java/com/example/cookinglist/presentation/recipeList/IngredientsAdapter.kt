package com.example.cookinglist.presentation.recipeList

import android.text.Editable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.example.cookinglist.R
import com.example.cookinglist.databinding.AddIngridCardviewBinding
import com.example.cookinglist.domain.Ingredients

class IngredientsAdapter(val listener: Listener) : RecyclerView.Adapter<IngredientsAdapter.IngredientsHolder>() {
    var ingredientsList = mutableListOf(Ingredients("Картошка"))

    class IngredientsHolder(item: View) : RecyclerView.ViewHolder(item) {
        private val binding = AddIngridCardviewBinding.bind(item)

        fun bind(ingredients: Ingredients, adapter: IngredientsAdapter) = with(binding) {
            addIngridEditTxt.text = Editable.Factory.getInstance().newEditable(ingredients.ingredName)
            addIngredBtn.setOnClickListener {
                it.isVisible = false
            adapter.ingredientsList.add(Ingredients("Морковь"))}
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IngredientsHolder {
        val view =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.add_ingrid_cardview, parent, false)
        return IngredientsHolder(view)
    }

    override fun onBindViewHolder(holder: IngredientsHolder, position: Int) {
        holder.bind(ingredientsList[position], this)
    }

    override fun getItemCount(): Int {
        return ingredientsList.size
    }

    fun refresh() {
        notifyDataSetChanged()
    }

    interface Listener {
        fun onClick()
        fun onLongClick():Boolean
    }
}