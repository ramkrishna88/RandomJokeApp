package com.example.randomjokeapp.Adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.graphics.blue
import androidx.recyclerview.widget.RecyclerView
import com.example.randomjokeapp.JokesApp
import com.example.randomjokeapp.R.id.randomJoke
import com.squareup.picasso.Picasso
import com.squareup.picasso.RequestCreator
import kotlin.math.absoluteValue


class NeverEndingList(
    private val jokesApp: MutableList<JokesApp> = mutableListOf()
) : RecyclerView.Adapter<neverEndinListViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): neverEndinListViewHolder {
       TODO()
    }
    override fun onBindViewHolder(holder: neverEndinListViewHolder, position: Int)  =
       holder.bind(jokesApp[position])


    override fun getItemCount(): Int = jokesApp.size
}

class neverEndinListViewHolder(
    private val binding : RandomJokeItemBinding
):RecyclerView.ViewHolder(binding.root){
    class RandomJokeItemBinding(val root: View) {}
    fun bind(jokesApp: JokesApp) {

        Picasso.get()
            .load(randomJoke.absoluteValue)
            .fit()
            .into(randomJoke.absoluteValue)
    }

}

fun RequestCreator.into(blue: Int) {

}

