package com.example.sportsapp.data

import androidx.room.Embedded
import androidx.room.Relation
import com.example.sportsapp.model.Athlete
import com.example.sportsapp.model.Sport
import java.util.*

//data class SportAndAthlete(val id:Int, val sports_name:String,val type:String,val gender:String,
//                            val athlete_id:Int,val firstName:String,val lastName:String,val city:String,val country:String,val sport_id:Int,val dateOfBirth:Date)

data class SportAndAthlete(
    @Embedded val sport:Sport,
    @Relation(
        parentColumn = "Id",
        entityColumn = "sport_id"
    )
    val athlete: Athlete
)