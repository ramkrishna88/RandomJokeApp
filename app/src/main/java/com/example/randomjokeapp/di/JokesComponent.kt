package com.example.randomjokeapp.di

import com.example.randomjokeapp.MainActivity
import com.example.randomjokeapp.Views.NeverEndingListFragment
import com.example.randomjokeapp.Views.RandomJokeFragment
import com.example.randomjokeapp.Views.TextInputFragment
import dagger.Component

@Component(
    modules = [
        ApplicationModule::class,
        NetworkModule::class,
        PresenterModule::class
    ])
interface JokesComponent {
    fun inject(mainActivity : MainActivity)
    fun inject(randomJokeFragment: RandomJokeFragment)
    fun inject(textInputFragment: TextInputFragment)
    fun inject(neverEndingListFragment: NeverEndingListFragment)
}