package com.example.cookinglist.domain

interface RecipeListRepository {

    fun addRecipe(recipe: Recipe)
    fun deleteRecipe(recipe: Recipe)
    fun getRecipeList(): List<Recipe>
}