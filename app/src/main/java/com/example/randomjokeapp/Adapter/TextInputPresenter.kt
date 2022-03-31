package com.example.randomjokeapp.Adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.randomjokeapp.JokesApp
import com.example.randomjokeapp.R
import com.squareup.picasso.Picasso
import kotlin.math.absoluteValue

private val JokesApp.Companion.size: Int
    get() {
        TODO("Not yet implemented")
    }

class TextInputPresenterImpl(
    private val jokesApp: MutableList<JokesApp> = mutableListOf()
) :RecyclerView.Adapter<TextInputViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextInputViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: TextInputViewHolder, position: Int) =
        holder.bind(jokesApp[position])

    override fun getItemCount(): Int = JokesApp.size
}

class TextInputViewHolder(
    private val binding : neverEndinListViewHolder.RandomJokeItemBinding
    ) : RecyclerView.ViewHolder(binding.root){
    fun bind(jokesApp: JokesApp) {
        Picasso.get()
            .load(R.id.randomJoke.absoluteValue)
            .fit()
            .into(R.id.randomJoke.absoluteValue)
    }

}
