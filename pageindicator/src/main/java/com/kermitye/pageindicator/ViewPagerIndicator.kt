package com.kermitye.pageindicator

import android.content.Context
import android.support.v4.view.ViewPager
import android.util.AttributeSet
import android.widget.ImageView
import android.widget.LinearLayout

/**
 * Created by kermitye
 * Date: 2018/7/23 15:30
 * Desc:
 */
class ViewPagerIndicator @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) :
        LinearLayout(context, attrs, defStyleAttr) {

    var mViewPager: ViewPager? = null
    var mCount: Int = 0

    /*init {
        init()
    }


    fun init() {

    }*/

    fun setViewPager(viewPager: ViewPager) {
        this.mViewPager = viewPager
        mCount = mViewPager?.adapter?.count ?: 0
        mViewPager?.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            var oldPosition: Int = 0

            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
            }

            override fun onPageSelected(position: Int) {
                getChildAt(oldPosition)?.isEnabled = false
                getChildAt(position)?.isEnabled = true
                oldPosition = position
            }
        })
        getDot()
    }

    fun setCount(count: Int) {
        this.mCount = count
        getDot()
    }

    fun getDot() {
        if (mCount == 0 || mCount == 1) return
        var image : ImageView
        var params: LayoutParams = LayoutParams(30,30)
        params.leftMargin = 8
        params.rightMargin = 8
        removeAllViews()
        for (i in 0 until mCount) {
            image = ImageView(this.context)
            image.isEnabled = if (i == 0) true else false
            image.setBackgroundResource(R.drawable.dot_selector)
            image.layoutParams = params
            addView(image)
        }
    }


}