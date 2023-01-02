package com.geekbrains.github.presenter

import com.geekbrains.github.repository.RepositoryCallback

internal interface RepositoryContract {
    fun searchGithub(
        query: String,
        callback: RepositoryCallback
    )
}