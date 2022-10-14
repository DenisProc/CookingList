package com.example.cookinglist.domain
import com.example.cookinglist.data.RecipeListRepositoryImpl
import com.example.cookinglist.presentation.recipeList.RecipeListVIewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

class AppDI {
    val koinModule = module {
        single { RecipeListRepositoryImpl }
        viewModel {
            RecipeListVIewModel(get())
        }
    }
}