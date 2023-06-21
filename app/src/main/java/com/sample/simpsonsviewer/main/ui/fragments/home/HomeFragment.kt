package com.sample.simpsonsviewer.main.ui.fragments.home

import SharedViewModelFactory
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.sample.simpsonsviewer.R
import com.sample.simpsonsviewer.main.ui.viewModels.SharedViewModel

class HomeFragment: Fragment(R.layout.fragment_home) {

    private val logTag = "HomeFragment"


    private val viewModel: SharedViewModel by lazy {
        val activity = requireNotNull(this.activity) {
            "You can only access the viewModel after onActivityCreated()"
        }
        ViewModelProvider(this, SharedViewModelFactory(activity.application))[SharedViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}