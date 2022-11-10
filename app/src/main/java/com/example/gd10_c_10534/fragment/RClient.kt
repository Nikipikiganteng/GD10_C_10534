package com.example.gd10_c_10534.fragment

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RClient {


    private const val BASE_URL = "http://10.53.12.24/ci4-apiserver/public/"
    val instances: api by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.create(api::class.java)
    }
}