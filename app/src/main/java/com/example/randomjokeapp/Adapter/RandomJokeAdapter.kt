package com.example.randomjokeapp.Adapter




import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.randomjokeapp.JokesApp


class RandomJokeAdapter(
    private val jokesApp: MutableList<JokesApp> = mutableListOf()
) : RecyclerView.Adapter<RandomJokeViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RandomJokeViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: RandomJokeViewHolder, position: Int) {
        holder.bind(jokesApp[position])
    }

    override fun getItemCount(): Int = jokesApp.size

}

class RandomJokeViewHolder(
private val binding : neverEndinListViewHolder.RandomJokeItemBinding
) : RecyclerView.ViewHolder(binding.root){
    fun bind(jokesApp: JokesApp) {


    }}
