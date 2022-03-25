package com.bignerdranch.android.criminalintent.database

import androidx.room.TypeConverter
import java.util.*

// 타입 변환기
// Room 이 알 수 없는 타입에 대해서 어떻게 처리해야하는지를 알려줌
class CrimeTypeConverters {
    @TypeConverter
    fun fromDate(date: Date?): Long? {
        return date?.time
    }

    @TypeConverter
    fun toDate(millisSinceEpoch: Long?): Date? {
        return millisSinceEpoch?.let{
            Date(it)
        }
    }

    @TypeConverter
    fun toUUID(uuid: String?): UUID? {
        return UUID.fromString(uuid)
    }

    @TypeConverter
    fun fromUUID(uuid: UUID?): String? {
        return uuid?.toString()
    }
}