package com.sample.simpsonsviewer.main.ui.fragments.feedFragment

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sample.simpsonsviewer.main.ui.fragments.feedFragment.viewModel.FeedViewModel

class FeedViewModelFactory(
    private val app: Application
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(FeedViewModel::class.java)) {
            return FeedViewModel(app) as T
        }
        throw IllegalArgumentException("Unknown ViewModelClass")
    }
}
