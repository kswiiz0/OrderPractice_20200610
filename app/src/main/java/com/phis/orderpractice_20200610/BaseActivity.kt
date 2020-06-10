package com.phis.orderpractice_20200610

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {
    val mContext = this

    abstract fun setValues()
    abstract fun setupEvents()
}