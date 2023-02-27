package com.example.scrollrv

import android.telecom.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PixApi {
    @GET("/api/")
    fun getImages(
        @Query("key")key: String = "33974972-247364195013993d0746119d9",
        @Query ("q")picture:String,
        @Query("per_page") perPage: Int = 3,
        @Query("page") page: Int ,)
    :retrofit2.Call<PixaModel>

}