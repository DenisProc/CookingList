package com.example.cookinglist.presentation.recipeList

import androidx.lifecycle.ViewModel
import com.example.cookinglist.data.RecipeListRepositoryImpl
import com.example.cookinglist.domain.Recipe

class RecipeListVIewModel(private val repository: RecipeListRepositoryImpl) : ViewModel(){
    fun addRecipe(recipe: Recipe){
        repository.addRecipe(recipe)
    }
    fun deleteRecipe(recipe: Recipe){
        repository.deleteRecipe(recipe)
    }
    fun getRecipeList(): List<Recipe> {
        return repository.getRecipeList()
    }
}