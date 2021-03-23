package com.example.sportsapp.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.sportsapp.data.UserDatabase
import com.example.sportsapp.model.Sport
import com.example.sportsapp.repository.SportRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class SportViewModel(application: Application): AndroidViewModel(application)  {
    val readAllData: LiveData<List<Sport>>
    private val repository:SportRepository
    init{
        val sportDao=
            UserDatabase.getDatabase(
                application
            ).sportDao()
        repository = SportRepository(sportDao)
        readAllData=repository.readAllData
    }

    fun addUser(sport: Sport){
        viewModelScope.launch(Dispatchers.IO){
            repository.addSport(sport)
        }
    }
}