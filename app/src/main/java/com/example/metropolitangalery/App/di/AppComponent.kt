package com.example.metropolitangalery.App.di

import android.content.Context
import com.example.metropolitangalery.App.App
import dagger.BindsInstance
import dagger.Component

@AppScope
@Component(modules = [AppModule::class])
interface AppComponent {

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance context: Context) : AppComponent
    }

    fun inject(application: App)
}