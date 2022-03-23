package com.bignerdranch.android.criminalintent.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.bignerdranch.android.criminalintent.Crime
import java.util.*

@Dao
interface CrimeDao {

    // 데이터베이스 전체 검색 쿼리
    @Query("SELECT * FROM crime")
    fun getCrimes(): LiveData<List<Crime>>

    // 특정 id 검색 쿼리
    @Query("SELECT * FROM crime WHERE id=(:id)")
    fun getCrime(id: UUID): LiveData<Crime?>
}