package com.example.githubdagger.screen

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.githubdagger.R
import com.example.githubdagger.databinding.ActivityMainBinding
import dagger.android.support.DaggerAppCompatActivity


class LoginActivity : AppCompatActivity() {

    private lateinit var viewModel: LoginViewModel
    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProviders.of(this).get(LoginViewModel::class.java)
        mBinding.login = viewModel


    }
}
