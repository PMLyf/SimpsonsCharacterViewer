package com.sample.simpsonsviewer.main.ui.fragments.home.viewModel

import android.app.Application
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

public class HomeViewModel(application: Application): ViewModel() {
    private val logTag = "sharedViewModel"

    // create private values for the data we need to monitor
    // userAuthState, uid, userName, buttonClicked, favorites, charList,
    // charData

    private val _userAuthState: MutableLiveData<Boolean> by lazy { MutableLiveData<Boolean>() }


    // Public values for the data to be accessed or changed
    private val _navigateToFavorites = MutableLiveData<Boolean>()
    val navigateToFavorites: MutableLiveData<Boolean>
        get() = _navigateToFavorites

    private val _navigateToCharList = MutableLiveData<Boolean>()
    val navigateToCharList: MutableLiveData<Boolean>
        get() = _navigateToCharList

    private val _navigateToCharData = MutableLiveData<Boolean>()
    val navigateToCharData: MutableLiveData<Boolean>
        get() = _navigateToCharData

    private val _navigateToLogin = MutableLiveData<Boolean>()
    val navigateToLogin: MutableLiveData<Boolean>
        get() = _navigateToLogin

    private val _navigateToSettings = MutableLiveData<Boolean>()

    val navigateToSettings: MutableLiveData<Boolean>
        get() = _navigateToSettings

    init {
        Log.i(logTag, "sharedViewModel created!")
    }
    // values  that need to be monitored by the ui

    // a function to reset navigation flags
    // this can be accessed by the ui
    fun resetNavFlags() {
        _navigateToFavorites.value = false
        _navigateToCharList.value = false
        _navigateToCharData.value = false
        _navigateToLogin.value = false
        _navigateToSettings.value = false
    }
    // public functions to trigger navigation
    fun onFavorites() {
        Log.i(logTag, "onFavorites")
        _navigateToFavorites.value = true
    }

    fun onCharList() {
        Log.i(logTag, "onCharList")
        _navigateToCharList.value = true
    }

    fun onCharData() {
        Log.i(logTag, "onCharData")
        _navigateToCharData.value = true
    }

    fun onLogin() {
        Log.i(logTag, "onLogin")
        _navigateToLogin.value = true
    }

    fun onSettings() {
        Log.i(logTag, "onSettings")
        _navigateToSettings.value = true
    }


    // companion object
    companion object {
        private const val TAG = "SharedViewModel"
    }
}