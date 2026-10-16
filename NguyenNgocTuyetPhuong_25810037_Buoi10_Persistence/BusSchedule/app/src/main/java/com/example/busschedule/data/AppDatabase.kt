package com.example.busschedule.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [BusSchedule::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun busScheduleDao(): BusScheduleDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                Room.databaseBuilder(context, AppDatabase::class.java, "app_database")
                    // nap du lieu co san tu file trong thu muc assets
                    .createFromAsset("database/bus_schedule.db")
                    .fallbackToDestructiveMigration()
                    .build()
                    .also { INSTANCE = it }
            }
        }
    }
}
