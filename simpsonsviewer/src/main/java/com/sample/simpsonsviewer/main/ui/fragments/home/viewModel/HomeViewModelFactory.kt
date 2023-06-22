package com.sample.simpsonsviewer.main.ui.fragments.home.viewModel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sample.simpsonsviewer.main.ui.viewModels.SharedViewModel

@Suppress("UNCHECKED_CAST")
class SharedViewModelFactory(
    private val app: Application
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SharedViewModel::class.java)) {
            return SharedViewModel(app) as T
        }
        throw IllegalArgumentException("Unknown ViewModelClass")
    }
}