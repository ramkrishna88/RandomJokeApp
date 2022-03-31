package com.example.randomjokeapp.model


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class RandomJoke(
    @SerializedName("type")
    @Expose
    val type: String,
    @SerializedName("value")
    @Expose
    val value: Joke
)

data class Joke(
    @SerializedName("categories")
    @Expose
    val categories: List<String>,
    @SerializedName("id")
    @Expose
    val id: Int,
    @SerializedName("joke")
    @Expose
    val joke: String
)