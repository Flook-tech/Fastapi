package com.example.fastapi
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("user")
    fun getUsers(): Call<List<User>>
}
