package com.bignerdranch.android.criminalintent.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.bignerdranch.android.criminalintent.Crime

@Database(entities = [ Crime::class ], version = 1)
@TypeConverters(CrimeTypeConverters::class)         // CrimeTypeConverters 에 정의된 함수들을 가져와서 사용함
abstract class CrimeDatabase : RoomDatabase() {
    // CrimeDao 에 정의된 함수들을 사용할 수 있음
    abstract fun crimeDao(): CrimeDao
}