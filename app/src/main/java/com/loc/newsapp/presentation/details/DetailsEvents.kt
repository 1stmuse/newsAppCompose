package com.loc.newsapp.presentation.details

import com.loc.newsapp.domain.model.Article

sealed class DetailsEvents {
    data class UpsertDeleteArticle(val article: Article): DetailsEvents()

    object RemoveSideEffect: DetailsEvents()
}