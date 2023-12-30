package com.loc.newsapp.presentation.search

sealed class SearchEvents {
    data class UpdateSearchQuery (val searchQuery: String): SearchEvents()

    object SearchNews: SearchEvents()
}