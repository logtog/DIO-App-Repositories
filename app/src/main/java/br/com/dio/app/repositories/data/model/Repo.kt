package br.com.dio.app.repositories.data.model

import java.security.acl.Owner

data class Repo(
    val id: Long,
    val name: String,
    val owner: Owner,
    val stargazersCount: Long,
    val language: String,
    val htmlURL: String,
    val description: String
)
