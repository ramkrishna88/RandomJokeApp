package com.example.randomjokeapp.Rest

import androidx.navigation.Navigator
import com.example.randomjokeapp.model.NeverEndingList
import com.example.randomjokeapp.model.RandomJoke
import retrofit2.Response
import java.util.jar.Attributes
import javax.inject.Inject

interface RandomRepository  {
    suspend fun getRandomJoke(): Response<RandomJoke>
    suspend fun getTextInput(firstName : String,lastName : String ): Response<RandomJoke>
    suspend fun getNeverEndingList(numberOfJokes: Int):Response<NeverEndingList>
}



class RandomRepositoryImpl @Inject constructor(
    private val serviceApi: serviceApi
        ): RandomRepository {
    override suspend fun getRandomJoke(): Response<RandomJoke> {
        return serviceApi.getAllRandomJokes()
    }

    override suspend fun getTextInput(firstName: String, lastName: String): Response<RandomJoke> {
        return serviceApi.getAllTextInput(firstName, lastName)
    }

    override suspend fun getNeverEndingList(numberOfJokes: Int): Response<NeverEndingList> {
       return serviceApi.getAllNeverEndingList(numberOfJokes)
    }


}
