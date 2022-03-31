package com.example.randomjokeapp

import android.app.Application
import com.example.randomjokeapp.di.ApplicationModule
import com.example.randomjokeapp.di.DaggerJokesComponent
import com.example.randomjokeapp.di.JokesComponent

class JokesApp :Application() {
    override fun onCreate() {
        super.onCreate()
        jokesComponent = DaggerJokesComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()
    }
    companion object{
        lateinit var jokesComponent: JokesComponent
    }
}