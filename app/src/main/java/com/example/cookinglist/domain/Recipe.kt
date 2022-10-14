package com.example.cookinglist.domain

data class Recipe(val name:String){
    var category = ""
    var process = ""
    var calorie = 0
    var protein = 0
    var fat = 0
    var carbohydrates = 0
    val ingredients = listOf<Ingredients>()
    var id = BASE_ID

    companion object {
        var BASE_ID = -1
    }
}
