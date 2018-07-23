package com.kermitye.ktpageindicator

import android.support.v4.view.ViewPager
import com.kermitye.pageindicator.ViewPagerIndicator

/**
 * Created by kermitye
 * Date: 2018/7/23 15:30
 * Desc:
 */

inline fun ViewPager.setIndicator(indicator: ViewPagerIndicator) = indicator.setViewPager(this)