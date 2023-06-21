package com.sample.simpsonsviewer.main.ui.viewModels

import android.app.Application
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

public class SharedViewModel(application: Application): ViewModel() {
    private val logTag = "sharedViewModel"

    // create private values for the data we need to monitor
    // userAuthState, uid, userName, buttonClicked, favorites, charList,
    // charData

    private val _userAuthState: MutableLiveData<Boolean> by lazy { MutableLiveData<Boolean>() }
    private val _screenSize: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }


    // companion object
    companion object {
        private const val TAG = "SharedViewModel"
    }
}