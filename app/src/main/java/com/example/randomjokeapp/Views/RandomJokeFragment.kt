package com.example.randomjokeapp.Views

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.randomjokeapp.Adapter.RandomJokeViewHolder
import com.example.randomjokeapp.JokesApp
import com.example.randomjokeapp.Presenters.RandomJokePresenter
import com.example.randomjokeapp.Presenters.RandomJokeViewContract
import com.example.randomjokeapp.R
import com.example.randomjokeapp.databinding.FragmentRandomJokeBinding
import javax.inject.Inject

class RandomJokeFragment : BaseFragment() {
    private var _binding :FragmentRandomJokeBinding? =null
    private val binding : FragmentRandomJokeBinding? get() = _binding

    @Inject
    lateinit var randomJokePresenter: RandomJokePresenter

    override fun onAttach(context: Context) {
        super.onAttach(context)
        JokesApp.jokesComponent.inject(this)
    }

    override  fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        _binding = FragmentRandomJokeBinding.inflate(inflater,container,false)
        binding?.randomJokeRecycler?.apply {
            layoutManager = LinearLayoutManager(
                requireContext(), LinearLayoutManager.VERTICAL,false)
        }
        // Inflate the layout for this fragment
        return binding?.root
    }
}