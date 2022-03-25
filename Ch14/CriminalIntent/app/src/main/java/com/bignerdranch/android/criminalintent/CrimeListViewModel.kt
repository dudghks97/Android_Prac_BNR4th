package com.bignerdranch.android.criminalintent

import androidx.lifecycle.ViewModel

class CrimeListViewModel: ViewModel() {
    private val crimeRepository = CrimeRepository.get()
    val crimeListLiveData = crimeRepository.getCrimes()

    // 새로운 범죄 데이터 추가
    fun addCrime(crime: Crime) {
        crimeRepository.addCrime(crime)
    }
}