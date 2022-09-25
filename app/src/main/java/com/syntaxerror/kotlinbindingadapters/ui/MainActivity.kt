package com.syntaxerror.kotlinbindingadapters.ui

/**
 **************************************************************************************
 *
 *** Project Details ***
 *
 * Project Name : KotlinBindingAdapters.
 * Package Id : com.syntaxerror.kotlinbindingadapters.data
 * Created By :  Shrawan Shinde
 * Created Date :  25,September,2022
 *
 *** Contact Details ***
 *
 * Name : Shrawan B. Shinde
 * Email : syntaxerror1972@gmail.com
 * Github Link : https://github.com/syntaxerror1972/KotlinBindingAdapters
 * LinkedIn Link : https://in.linkedin.com/in/shrawan-shinde-59ba57a1
 * Copyright (c) 2022. All rights reserved.
 *
 **************************************************************************************
 */
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.syntaxerror.kotlinbindingadapters.R
import com.syntaxerror.kotlinbindingadapters.data.User
import com.syntaxerror.kotlinbindingadapters.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var dataBinding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        var userObj = User("Shrawan Shinde","syntaxerror1972@gmail.com","9876543201","Kolhapur","https://preview.keenthemes.com/metronic-v4/theme/assets/pages/media/profile/profile_user.jpg")
        dataBinding.user = userObj
    }
}