package com.androiddevs.mvvmnewsapp.DB

import androidx.room.TypeConverter
import com.androiddevs.mvvmnewsapp.Models.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }
}