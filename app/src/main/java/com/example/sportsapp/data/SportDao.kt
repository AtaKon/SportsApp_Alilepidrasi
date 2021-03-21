package com.example.sportsapp.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.sportsapp.model.Athlete
import com.example.sportsapp.model.Sport

@Dao
interface SportDao {

    @Query("SELECT * FROM sport_table")
    fun getSportData(): List<Sport>?

    @Insert
    fun insertSport(sport: Sport):Long


    @Insert
    fun insertSportAthlete(sport: Athlete)

    @Query("SELECT * FROM sport_table JOIN athlete on sport_table.id=athlete.sport_id")
    fun getAllSportsWithAthletes():List<SportAndAthlete>?



}