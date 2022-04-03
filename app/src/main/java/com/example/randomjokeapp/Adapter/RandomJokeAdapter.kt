package com.example.randomjokeapp.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.randomjokeapp.JokesApp
import com.example.randomjokeapp.databinding.JokeRandomItemBinding

class RandomJokeAdapter(
    private val jokesApp: MutableList<JokesApp> = mutableListOf()
) : RecyclerView.Adapter<RandomJokeViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RandomJokeViewHolder {
        return RandomJokeViewHolder(
            JokeRandomItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: RandomJokeViewHolder, position: Int) {
        holder.bind(jokesApp[position])
    }

    override fun getItemCount(): Int = jokesApp.size

}

class RandomJokeViewHolder(
private val binding : JokeRandomItemBinding
) : RecyclerView.ViewHolder(binding.root){
    fun bind(jokesApp: JokesApp) {


    }}
