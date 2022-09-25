package com.syntaxerror.kotlinbindingadapters.adapter

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

/**
 **************************************************************************************
 *
 *** Project Details ***
 *
 * Project Name : KotlinBindingAdapters.
 * Package Id : com.syntaxerror.kotlinbindingadapters.adapter
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
@BindingAdapter("loadImageFromUrl")
fun ImageView.loadImageFromUrl(url:String){
    Glide.with(this.context).load(url).into(this)
}