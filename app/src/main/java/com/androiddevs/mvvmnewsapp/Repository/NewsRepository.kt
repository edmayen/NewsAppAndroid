package com.androiddevs.mvvmnewsapp.Repository

import com.androiddevs.mvvmnewsapp.API.RetrofitInstance
import com.androiddevs.mvvmnewsapp.DB.ArticleDatabase

class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)
}