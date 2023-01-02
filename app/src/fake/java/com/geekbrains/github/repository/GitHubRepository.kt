package com.geekbrains.github

import com.geekbrains.github.model.SearchResponse
import com.geekbrains.github.presenter.RepositoryContract
import com.geekbrains.github.repository.GitHubApi
import com.geekbrains.github.repository.RepositoryCallback
import retrofit2.Response

internal class GitHubRepository(private val gitHubApi: GitHubApi) : RepositoryContract {

    override fun searchGithub(
        query: String,
        callback: RepositoryCallback
    ) {
        callback.handleGitHubResponse(Response.success(SearchResponse(42, listOf())))
    }
}