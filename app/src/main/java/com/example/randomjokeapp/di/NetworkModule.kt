package com.example.randomjokeapp.di

import com.example.randomjokeapp.Rest.RandomRepository
import com.example.randomjokeapp.Rest.RandomRepositoryImpl
import com.example.randomjokeapp.Rest.serviceApi
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


@Module
class NetworkModule {
    @Provides
    fun provideNetworkService(okHttpClient: OkHttpClient) =
        Retrofit
            .Builder()
            .baseUrl(serviceApi.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
            .create(serviceApi::class.java)

    @Provides
    fun providesOkHttpClient()=
        OkHttpClient
            .Builder()
            .addInterceptor(HttpLoggingInterceptor().apply {
                level =HttpLoggingInterceptor.Level.BODY
            })
            .connectTimeout(30,TimeUnit.SECONDS)
            .readTimeout(30,TimeUnit.SECONDS)
            .writeTimeout(30,TimeUnit.SECONDS)
            .build()

    @Provides
    fun ProvideRandomRepository(serviceApi: serviceApi): RandomRepository =
        RandomRepositoryImpl(serviceApi)


}