package com.kermitye.ktpageindicator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listData = listOf(HomeFragment(), HomeFragment(), HomeFragment())

        mViewPager.adapter = HomePageAdapter(supportFragmentManager, listData)
        mViewPager.setIndicator(mIndicator)

    }
}
