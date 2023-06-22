package com.sample.simpsonsviewer.main.ui.fragments.feedFragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sample.simpsonsviewer.R
import com.sample.simpsonsviewer.databinding.FragmentFeedBinding
import com.sample.simpsonsviewer.main.ui.fragments.feedFragment.adapters.FeedListAdapter
import com.sample.simpsonsviewer.main.ui.fragments.feedFragment.helper.FeedItemTouchHelperCallback
import com.sample.simpsonsviewer.main.ui.fragments.feedFragment.viewModel.FeedViewModel

/**
 * This FeedFragment hosts the recycler / card view for the data received from the server
 */

class FeedFragment: Fragment(R.layout.fragment_feed){
    private val logTag = "FeedFragment"

    private lateinit var _binding: FragmentFeedBinding
    private val binding get() = _binding

    private lateinit var  itemTouchHelper: ItemTouchHelper

    private val viewModel: FeedViewModel by lazy {
        val activity = requireNotNull(this.activity) {
            "You can only access the viewModel after onActivityCreated()"
        }
        ViewModelProvider(this, FeedViewModelFactory(activity.application))
            .get(FeedViewModel::class.java)
    }

    private var viewModelAdapter: FeedListAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // set observers here
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // get binding object
        _binding = FragmentFeedBinding.inflate(inflater, container, false)

        // set life cycle owner
        binding.lifecycleOwner = viewLifecycleOwner
        binding.feedViewModel = viewModel

        /** Set up click bindings here**/
        viewModelAdapter = FeedListAdapter(FeedItemClick { post ->
            var value = post
            return@FeedItemClick
        },viewModel)
        /** set layout manager and adapter for recycler view **/
        binding.root.findViewById<RecyclerView>(R.id.recyclerViewFeed).apply {
            layoutManager = LinearLayoutManager(context)
            adapter = viewModelAdapter

            ItemTouchHelper(FeedItemTouchHelperCallback(viewModelAdapter!!)).attachToRecyclerView(binding.recyclerViewFeed)

        }

        return binding.root
    }
}


class FeedItemClick(val block: (Any) -> Unit) {
    /**
     * Called when a post is clicked
     *
     * @param post the post that was clicked
     */
    fun onClick(char: Char) = block(char)
}