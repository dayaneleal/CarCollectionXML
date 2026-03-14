package com.example.carcollection.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.carcollection.database.converters.DateConverters
import com.example.carcollection.database.dao.UserLocationDao
import com.example.carcollection.database.model.UserLocation

@Database(entities = [UserLocation::class], version = 1)
@TypeConverters(DateConverters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userLocationDao(): UserLocationDao
}