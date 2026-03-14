package com.example.carcollection

import android.app.Application
import com.example.carcollection.database.DatabaseBuilder

class Application : Application() {

    override fun onCreate() {
        super.onCreate()
        DatabaseBuilder.getInstance(this)
    }
}