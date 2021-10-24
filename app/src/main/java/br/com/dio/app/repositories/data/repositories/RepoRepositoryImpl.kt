package br.com.dio.app.repositories.data.repositories

import br.com.dio.app.repositories.data.model.Repo
import kotlinx.coroutines.flow.flow
import br.com.dio.app.repositories.data.services.GitHubService
import kotlinx.coroutines.flow.Flow

class RepoRepositoryImpl(private val service: GitHubService) : RepoRepository {

    override suspend fun listRepositories(user: String): Flow<List<Repo>> = flow {
        val repoList = service.listRepositories(user)
        emit(repoList)
    }
}