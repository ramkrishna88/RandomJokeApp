package com.example.randomjokeapp.Presenters

import com.example.randomjokeapp.Rest.RandomRepository
import com.example.randomjokeapp.Rest.serviceApi
import javax.inject.Inject

class TextInputPresenter @Inject constructor(
    private val serviceRepository: RandomRepository
) {
}

interface TextInputViewContract{

}