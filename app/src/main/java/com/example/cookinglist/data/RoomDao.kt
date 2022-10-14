package com.example.cookinglist.data

import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@androidx.room.Dao
interface RoomDao {
    @Insert
    fun insertRecipe(recipeDB: RecipeDB)
    @Query ("SELECT * FROM recipes")
    fun getAllRecipes(): Flow<List<RecipeDB>>
}