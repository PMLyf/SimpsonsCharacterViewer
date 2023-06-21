package com.sample.simpsonsviewer.main.ui.fragments.favoritesFragment

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.sample.simpsonsviewer.R
import com.sample.simpsonsviewer.main.ui.viewModels.SharedViewModel

/**
 * This fragment allows users to save a list of favorite characters
 * If a user is not signed in, the data will be stored locally, if they  are signed in, we can use firebase to store and fetch data
 */

class FavoritesFragment: Fragment(R.layout.fragment_home) {

        private val logTag = "FavoritesFragment"


}