package com.example.sportsapp.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(foreignKeys = arrayOf(
    ForeignKey(entity = Sport::class,
        parentColumns = arrayOf("id"),
        childColumns = arrayOf("sports_id"),
        onDelete = ForeignKey.CASCADE)
))
data class Team (
    @PrimaryKey(autoGenerate = true)
    val team_id:Int,
    val team_name:String,
    val stadium_name:String,
    val city:String,
    val sports_id:Int,
    val yearOfFoundation:Int
)