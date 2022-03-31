package com.example.randomjokeapp.Presenters

import com.example.randomjokeapp.Rest.RandomRepository
import javax.inject.Inject

class NeverEndingListImpl @Inject constructor(
    private val repositoySevice: RandomRepository
) :NeverEndingListPresenter {

    private  var neverEndingListViewContract:RandomJokeViewContract? = null

    override fun initializePresenter(viewContract: NeverEndingListViewContract) {
        neverEndingListViewContract = viewContract
    }
    override fun checkNetwork() {
        // connect to network state

    }

    override suspend fun getRandomJokes(numberOfJokes: Int) {
        repositoySevice.getNeverEndingList(numberOfJokes)
        neverEndingListViewContract?.loadingSuccess(true)
        neverEndingListViewContract?.loadingJokes(true)
        neverEndingListViewContract?.jokeType(jokeType = String)
    }

    override fun destroyPresenter() {
       neverEndingListViewContract = null
    }
}

interface NeverEndingListPresenter {
    fun initializePresenter(viewContract: NeverEndingListViewContract)
    fun checkNetwork()
    suspend fun getRandomJokes(numberOfJokes: Int)
    fun destroyPresenter()

}
interface NeverEndingListViewContract : RandomJokeViewContract {
    override fun loadingJokes(LOADING: Boolean)
    override fun jokeType(jokeType: String.Companion)
    override fun loadingSuccess(success: Boolean)
}