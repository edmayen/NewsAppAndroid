package com.androiddevs.mvvmnewsapp.DB

import android.content.Context
import androidx.room.*
import com.androiddevs.mvvmnewsapp.Models.Article


@Database(
    entities = [Article::class],
    version = 1
)
@TypeConverters(Converters::class)
abstract class ArticleDatabase: RoomDatabase() {

    abstract fun getArticle(): ArticleDao

    companion object{
        @Volatile
        private var instance: ArticleDatabase? = null
        private val LOCK = Any()

        operator  fun invoke(context: Context) = instance ?: synchronized(LOCK){
            instance ?: createDataBase(context).also { instance = it }
        }

        private fun createDataBase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                ArticleDatabase::class.java,
                "article_db.db"
            ).build()
    }
}