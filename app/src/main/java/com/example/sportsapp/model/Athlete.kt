package com.example.sportsapp.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.util.*

@Entity(foreignKeys = arrayOf(
    ForeignKey(entity = Sport::class,
    parentColumns = arrayOf("id"),
    childColumns = arrayOf("sport_id"),
    onDelete = ForeignKey.CASCADE)
))
data class Athlete (
    @PrimaryKey(autoGenerate = true)
    val athlete_id:Int,
    val firstName:String,
    val lastName:String,
    val city:String,
    val country:String,
    val sport_id:Int,
    val dateOfBirth:Date
)
