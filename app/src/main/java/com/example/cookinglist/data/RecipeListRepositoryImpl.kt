package com.example.cookinglist.data

import com.example.cookinglist.domain.Recipe
import com.example.cookinglist.domain.RecipeListRepository

object RecipeListRepositoryImpl:RecipeListRepository {
    private val recipeList = mutableListOf<Recipe>()
    private var idCounter = 0

    override fun addRecipe(recipe: Recipe) {
        if (recipe.id == Recipe.BASE_ID){
            recipe.id = idCounter
            idCounter++
        }
        recipeList.add(recipe)
    }

    override fun deleteRecipe(recipe: Recipe) {
        recipeList.remove(recipe)
    }

    override fun getRecipeList(): List<Recipe> {
        return recipeList
    }
}