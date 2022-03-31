package com.example.randomjokeapp.Presenters

import com.example.randomjokeapp.Rest.RandomRepository
import javax.inject.Inject

class RandomJokePresenterImpl @Inject constructor(
    private val randomRepository: RandomRepository
) :RandomJokePresenter {

    private  var randomJokeViewContract:RandomJokeViewContract? = null

    override fun initializePresenter(viewContract: RandomJokeViewContract) {
        randomJokeViewContract = viewContract
    }

    override fun checkNetwork() {
     // connect to network state
    }

    override suspend fun getRandomJokes() {
        randomJokeViewContract?.jokeType(jokeType = String)
        randomJokeViewContract?.loadingJokes(true)
        randomJokeViewContract?.loadingSuccess(true)

        randomRepository.getRandomJoke()
    }

    override fun destroyPresenter() {
        randomJokeViewContract =null
    }

}

interface RandomJokePresenter{
    fun initializePresenter(viewContract: RandomJokeViewContract)
    fun checkNetwork()
    suspend fun getRandomJokes()
    fun destroyPresenter()
}

interface RandomJokeViewContract{
    fun loadingJokes(LOADING: Boolean)
    fun jokeType(jokeType: String.Companion)
    fun loadingSuccess(success: Boolean)

}
