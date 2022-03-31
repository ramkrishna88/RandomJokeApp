package com.example.randomjokeapp.Rest


import com.example.randomjokeapp.model.NeverEndingList
import com.example.randomjokeapp.model.RandomJoke
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface serviceApi {

    @GET(RANDOM_JOKE_PATH)
    suspend fun getAllRandomJokes() : Response<RandomJoke>

    @GET(text_Input)
    suspend fun getAllTextInput(
        // todo add the first name and last name queries
        @Query("first_name") firstName : String,
        @Query("last_name") lastName : String
    ) : Response<RandomJoke>

    @GET(never_EndingList)
    suspend fun getAllNeverEndingList(
        @Path("number") numberOfJokes: Int = 20
    ) : Response<NeverEndingList>

    companion object{
        //http://api.icndb.com/jokes/random
        const val BASE_URL = "https://api.icndb.com/"
        private const val RANDOM_JOKE_PATH = "jokes/random"

        //http://api.icndb.com/jokes/random?firstName=John&lastName=Doe
        private const val text_Input = "jokes/random"
        //http://api.icndb.com/jokes/random/<number>
        private const val never_EndingList = "jokes/random/{number}"
    }
}