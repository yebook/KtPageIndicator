# Kotlin ViewPager 圆形指示器

> 使用Kotlin对ViewPager指示器进行封装，达到两步集成指示器



![1](https://github.com/yebook/KtPageIndicator/blob/master/1.png)





### 1. 布局中添加View

```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <android.support.v4.view.ViewPager
        android:id="@+id/mViewPager"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />

    <com.kermitye.pageindicator.ViewPagerIndicator
        android:id="@+id/mIndicator"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerHorizontal="true"
        android:layout_alignParentBottom="true"
        android:layout_marginBottom="50dp"
        android:orientation="horizontal"
        android:gravity="center"
        />
</RelativeLayout>
```



### 2.设置adapter,并设置指示器

```kotlin
var listData = listOf(HomeFragment(), HomeFragment(), HomeFragment())
mViewPager.adapter = HomePageAdapter(supportFragmentManager, listData)
mViewPager.setIndicator(mIndicator)
```
