package com.sample.simpsonsviewer.main.ui.fragments.feedFragment.viewModel

import android.app.Application
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.work.WorkManager
import com.sample.simpsonsviewer.domain.models.Character

public class FeedViewModel(application: Application): ViewModel() {
    private val logTag = "FeedViewModel"

    private val workManager = WorkManager.getInstance(application)

    private val _characterList = MutableLiveData<List<Char>>()
    private val _character = MutableLiveData<Any>()

    // create  a test list of simpsons characters data
    /**
     * char model
     *                 id = dto.id,
    name = dto.name,
    description = dto.description,
    imageUrl = dto.imageUrl,
    age = dto.age,
    weight = dto.weight,
    height = dto.height,
    hairColor = dto.hairColor,
    professions = dto.professions,
    friends = dto.friends
     * */

    val characterList: LiveData<List<Char>>
        get() = _characterList

    fun getCharacterList(): List<Character> {
        // get character list from server
        val testList = ArrayList<Character>(

        )
        return testList
    }

    fun displayCharacterDetails(it: Any) {
        TODO("Not yet implemented")
    }

    fun onRemovePost(position: Int) {

    }

    // give me a public function called genTestList that returns a list of Characters from the model. Create the list here in the function with random simpsons daa
    fun genTestList() {


    }


}