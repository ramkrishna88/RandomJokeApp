package com.example.randomjokeapp.Views

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.randomjokeapp.Adapter.NeverEndingListAdapter
import com.example.randomjokeapp.Presenters.NeverEndingListPresenter
import com.example.randomjokeapp.databinding.FragmentNeverEndingListBinding
import javax.inject.Inject

class NeverEndingListFragment : BaseFragment() {
    private var _binding : FragmentNeverEndingListBinding? =null
    private val binding : FragmentNeverEndingListBinding? get() = _binding

    private val adapterNeverEnding by lazy {
        NeverEndingListAdapter()
    }

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
            adapter = adapterNeverEnding
        }


        // Inflate the layout for this fragment
        return binding?.root
    }
}