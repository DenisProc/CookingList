package com.example.cookinglist.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.cookinglist.R
import com.example.cookinglist.databinding.ActivityMainBinding
import com.example.cookinglist.presentation.diary.DiaryFragment
import com.example.cookinglist.presentation.mealPlaner.MealPlanerFragment
import com.example.cookinglist.presentation.recipeList.RecipeListFragment
import com.example.cookinglist.presentation.shopingList.ShopingListFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        startFragment1()

        binding.btnNavigation.setOnNavigationItemSelectedListener(this)
        binding.btnNavigation.selectedItemId = R.id.btn_navigation

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.panel_navigation_recipe_list -> supportFragmentManager.beginTransaction().replace(R.id.fragment_container, RecipeListFragment.newInstance()).commit()
            R.id.panel_navigation_planer -> supportFragmentManager.beginTransaction().replace(R.id.fragment_container, MealPlanerFragment.newInstance()).commit()
            R.id.panel_navigation_shoping_list -> supportFragmentManager.beginTransaction().replace(R.id.fragment_container, ShopingListFragment.newInstance()).commit()
            R.id.panel_navigation_diary -> supportFragmentManager.beginTransaction().replace(R.id.fragment_container, DiaryFragment.newInstance()).commit()
        }
        return true
    }
    private fun startFragment1(){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, RecipeListFragment.newInstance())
            .commit()
    }
}