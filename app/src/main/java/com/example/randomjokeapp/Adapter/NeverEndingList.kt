package com.example.randomjokeapp.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.randomjokeapp.databinding.JokeRandomItemBinding
import com.example.randomjokeapp.model.Joke

class NeverEndingListAdapter(
    private val jokesData: MutableList<Joke> = mutableListOf()
) : RecyclerView.Adapter<NeverEndingListViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NeverEndingListViewHolder {
       return NeverEndingListViewHolder(
           JokeRandomItemBinding.inflate(
               LayoutInflater.from(parent.context),
               parent,
               false
           )
       )
    }
    override fun onBindViewHolder(holder: NeverEndingListViewHolder, position: Int)  =
       holder.bind(jokesData[position])


    override fun getItemCount(): Int = jokesData.size
}

class NeverEndingListViewHolder(
    private val binding : JokeRandomItemBinding
):RecyclerView.ViewHolder(binding.root){
    fun bind(joke: Joke) {
        // todo here you bind the data to your views
        // create the text views in the layout
    }

}

