package com.example.demoretrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubClient {

    @GET("/users/{user}/repos")
    fun reposForUser(@Path("user") user:String): Call<List<GitHubRepo>>
}