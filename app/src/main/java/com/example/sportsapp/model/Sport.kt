package com.example.sportsapp.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "sport_table")
data class Sport (
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val sports_name:String,
    val type:String,
    val gender:String
)
