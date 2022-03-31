package com.example.randomjokeapp.model


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class NeverEndingList(
    @SerializedName("type")
    @Expose
    val type: String,
    @SerializedName("value")
    @Expose
    val value: List<Joke>
)