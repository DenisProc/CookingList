package com.example.cookinglist.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
@Database(entities = [RecipeDB::class], version = 1)
abstract class RoomDB: RoomDatabase() {
    abstract fun getRoomDao():RoomDao

    companion object{
        fun getDb(context: Context) :RoomDB{
            return Room.databaseBuilder(context.applicationContext,RoomDB::class.java,"cooking.db").build()
        }
    }
}