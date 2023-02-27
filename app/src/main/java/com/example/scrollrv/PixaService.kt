package com.example.scrollrv

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PixaService {
    val retrofit = Retrofit.Builder().baseUrl("https://pixabay.com/api/").addConverterFactory(
        GsonConverterFactory.create()
    ).build()

    val api = retrofit.create(PixApi::class.java)

}