package com.kermitye.ktpageindicator

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.util.Log

/**
 * Created by kermitye
 * Date: 2018/7/23 16:48
 * Desc:
 */
class HomePageAdapter(fm: FragmentManager?, val items: List<HomeFragment>) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): HomeFragment {
        return items[position]
    }

    override fun getCount(): Int {
        return items.size
    }
}