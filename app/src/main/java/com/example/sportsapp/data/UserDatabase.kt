package com.example.sportsapp.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.sportsapp.model.Athlete
import com.example.sportsapp.model.Sport
import com.example.sportsapp.model.User

@Database(entities = [User::class,Sport::class,Athlete::class],version = 1,exportSchema = false)

abstract class UserDatabase:RoomDatabase(){
    abstract fun userDao():UserDao
    abstract fun sportDao():SportDao
    companion object{

        @Volatile
        private  var INSTANCE:UserDatabase? =null

        fun getDatabase(context: Context):UserDatabase{
            val tempInstance = INSTANCE
            if(tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    UserDatabase::class.java,
                    "user_database"
                ).build()
                INSTANCE = instance
                return  instance
            }
        }
    }
}