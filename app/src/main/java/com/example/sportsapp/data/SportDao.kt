package com.example.sportsapp.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.sportsapp.model.Athlete
import com.example.sportsapp.model.Sport
import com.example.sportsapp.model.User

@Dao
interface SportDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertSport(sport: Sport):Long

    @Query("SELECT * FROM sport_table ORDER BY id ASC")
    fun readAllData():LiveData<List<Sport>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertSportAthlete(sport: Athlete)

//    @Query("SELECT * FROM sport_table JOIN athlete on sport_table.id=athlete.sport_id")
//    suspend fun getAllSportsWithAthletes():LiveData<List<SportAndAthlete>>



}