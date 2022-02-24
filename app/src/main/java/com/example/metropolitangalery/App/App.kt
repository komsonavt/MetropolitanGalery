package com.example.metropolitangalery.App

import android.app.Application
import android.content.Context
import com.example.metropolitangalery.App.di.AppComponent
import com.example.metropolitangalery.App.di.DaggerAppComponent

class App : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        appComponent = DaggerAppComponent.factory().create(applicationContext)
        super.onCreate()
    }
}