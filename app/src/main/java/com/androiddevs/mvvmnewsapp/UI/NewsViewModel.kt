package com.androiddevs.mvvmnewsapp.UI

import androidx.lifecycle.ViewModel
import com.androiddevs.mvvmnewsapp.Repository.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
) : ViewModel() {
}