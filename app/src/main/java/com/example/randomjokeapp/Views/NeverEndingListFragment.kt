package com.example.randomjokeapp.Views

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.randomjokeapp.Presenters.NeverEndingListPresenter
import com.example.randomjokeapp.Presenters.RandomJokePresenter
import com.example.randomjokeapp.R
import com.example.randomjokeapp.databinding.FragmentNeverEndingListBinding
import com.example.randomjokeapp.databinding.FragmentRandomJokeBinding
import javax.inject.Inject

class NeverEndingListFragment : BaseFragment() {
    private var _binding : FragmentNeverEndingListBinding? =null
    private val binding : FragmentNeverEndingListBinding? get() = _binding


    @Inject
    lateinit var neverEndingListPresenter: NeverEndingListPresenter
    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        _binding = FragmentNeverEndingListBinding.inflate(inflater, container, false)
        binding?.endingListRecycler?.apply {
            layoutManager = LinearLayoutManager(
                requireContext(), LinearLayoutManager.VERTICAL, false)
        }


        // Inflate the layout for this fragment
        return binding?.root
    }
}