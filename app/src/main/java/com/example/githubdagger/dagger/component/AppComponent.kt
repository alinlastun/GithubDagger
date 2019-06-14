package com.example.githubdagger.dagger.component

import com.example.githubdagger.dagger.module.RetrofitModule
import com.example.githubdagger.screen.LoginActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@Component(modules = [RetrofitModule::class])
interface AppComponent {

/*  //  fun inject(mainActivity: LoginActivity)

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun mBaseUrl(@Named("mBaseUrl")baseUrl:String):Builder

        fun build():AppComponent
    }*/
}