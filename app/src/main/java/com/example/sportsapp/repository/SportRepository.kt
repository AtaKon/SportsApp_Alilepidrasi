package com.example.sportsapp.repository

import androidx.lifecycle.LiveData
import com.example.sportsapp.data.SportDao
import com.example.sportsapp.model.Sport
import com.example.sportsapp.model.User

class SportRepository(private val sportDao:SportDao) {

    val readAllData: LiveData<List<Sport>> = sportDao.readAllData()

    suspend fun addSport(sport:Sport){
        sportDao.insertSport(sport)
    }


}