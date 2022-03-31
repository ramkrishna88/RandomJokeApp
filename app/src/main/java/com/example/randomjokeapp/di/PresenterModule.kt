package com.example.randomjokeapp.di

import com.example.randomjokeapp.Presenters.NeverEndingListImpl
import com.example.randomjokeapp.Presenters.NeverEndingListPresenter
import com.example.randomjokeapp.Presenters.RandomJokePresenter
import com.example.randomjokeapp.Presenters.RandomJokePresenterImpl
import com.example.randomjokeapp.Rest.RandomRepository
import dagger.Module
import dagger.Provides

@Module
class PresenterModule {

     @Provides
     fun textInputPresenter(randomRepository: RandomRepository): RandomJokePresenter {
          return RandomJokePresenterImpl(randomRepository)
     }
     @Provides
     fun neverEndingListPresenter(randomRepository: RandomRepository): NeverEndingListPresenter {
          return NeverEndingListImpl(randomRepository)
     }
}
