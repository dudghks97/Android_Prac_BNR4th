package com.bignerdranch.android.criminalintent

import android.app.Application

// CrimeRepository 인스턴스를 생성하도록 함
// 사용을 위해서는 매니페스트 파일에 android:name="CriminalIntentApplication" 을 추가해줘야함
class CriminalIntentApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        CrimeRepository.initialize(this)
    }
}