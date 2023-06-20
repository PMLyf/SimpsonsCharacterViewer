package com.sample.simpsonsviewer.main.ui.viewModels

import android.app.Application
import android.util.Log
import androidx.lifecycle.ViewModel

public class SharedViewModel(application: Application): ViewModel() {
    private val logTag = "sharedViewModel"

    init {
        Log.i(logTag, "sharedViewModel created!")
    }
    // values  that need to be monitored by the ui


    // companion object
    companion object {
        private const val TAG = "SharedViewModel"
    }
}