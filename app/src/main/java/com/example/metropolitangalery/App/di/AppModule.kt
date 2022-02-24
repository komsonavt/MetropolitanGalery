package com.example.metropolitangalery.App.di

import android.content.Context
import com.example.network.GalleryApi
import com.example.network.GalleryGetDataSource
import com.example.network.GalleryGetDataSourceImpl
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@AppScope
@Module
interface AppModule {

    @Binds
    @AppScope
    fun bindGalleryDataSource(galleryGetDataSource: GalleryGetDataSourceImpl) : GalleryGetDataSource

}