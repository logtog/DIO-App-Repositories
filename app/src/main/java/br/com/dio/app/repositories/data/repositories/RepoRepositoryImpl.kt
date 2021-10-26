package br.com.dio.app.repositories.data.repositories

import br.com.dio.app.repositories.core.RemoteException
import br.com.dio.app.repositories.data.model.Repo
import kotlinx.coroutines.flow.flow
import br.com.dio.app.repositories.data.services.GitHubService
import kotlinx.coroutines.flow.Flow
import retrofit2.HttpException


class RepoRepositoryImpl(private val service: GitHubService) : RepoRepository {

    override suspend fun listRepositories(user: String): Flow<List<Repo>> = flow {
        try {
            val repoList = service.listRepositories(user)
            emit(repoList)

        } catch (ex: HttpException) {
            throw RemoteException(ex.message ?: "Não foi possivel fazer a busca no momento!")
        }
    }
}