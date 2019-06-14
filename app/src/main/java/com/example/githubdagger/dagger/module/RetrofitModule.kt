package com.example.githubdagger.dagger.module

import com.example.githubtraining.retrofit.RetrofitInterface
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton

@Module
class RetrofitModule(@Named("mBaseUrl")var mBaseUrl:String) {


    @Provides
    @Singleton
    fun provideHttpLogginingInterceptor(): HttpLoggingInterceptor{
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        return interceptor }

    @Provides
    @Singleton
    fun provideOkHttpClient(interceptor:HttpLoggingInterceptor): OkHttpClient{
        return OkHttpClient.Builder().addInterceptor(interceptor).build() }


    @Provides
    @Singleton
    fun provideGson(): GsonConverterFactory {
       return GsonConverterFactory.create()
    }

    @Provides
    @Singleton
    fun provideRxJava2CallAdapterFactory(): RxJava2CallAdapterFactory {
        return RxJava2CallAdapterFactory.create() }


    @Provides
    @Singleton
    fun provideRetrofit(client:OkHttpClient,rxJava:RxJava2CallAdapterFactory,gson: GsonConverterFactory): Retrofit{
        return Retrofit.Builder()
            .client(client)
            .addConverterFactory(gson)
            .addCallAdapterFactory(rxJava)
            .baseUrl(mBaseUrl)
            .build()

    }



}
