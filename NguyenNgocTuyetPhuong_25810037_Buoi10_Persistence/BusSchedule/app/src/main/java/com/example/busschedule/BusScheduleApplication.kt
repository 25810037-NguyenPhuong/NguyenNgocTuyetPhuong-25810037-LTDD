package com.example.busschedule

import android.app.Application
import com.example.busschedule.data.AppDatabase

class BusScheduleApplication : Application() {
    // tao database khi lan dau can dung
    val database: AppDatabase by lazy { AppDatabase.getDatabase(this) }
}
