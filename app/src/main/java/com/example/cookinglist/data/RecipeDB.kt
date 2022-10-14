package com.example.cookinglist.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "recipes")
data class RecipeDB(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    @ColumnInfo(name = "name")
    var name: String,
    @ColumnInfo(name = "category")
    var category: String,
    @ColumnInfo(name = "process")
    var process: String,
    @ColumnInfo(name = "calorie")
    var calorie: Int,
    @ColumnInfo(name = "protein")
    var protein: Int,
    @ColumnInfo(name = "fat")
    var fat: Int,
    @ColumnInfo(name = "carbohydrates")
    var carbohydrates: Int
)