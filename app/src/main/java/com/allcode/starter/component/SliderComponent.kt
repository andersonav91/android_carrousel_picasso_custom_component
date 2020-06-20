package com.allcode.starter.component

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.viewpager.widget.ViewPager
import com.allcode.starter.R
import com.allcode.starter.adapter.CustomPagerAdapter
import kotlin.collections.ArrayList


class SliderComponent @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0,
    defStyleRes: Int = 0
) : LinearLayout(context, attrs, defStyle, defStyleRes) {
    init { }

    fun setImages(images: ArrayList<String>) {
        LayoutInflater.from(context).inflate(R.layout.slider_component, this, true)
        orientation = VERTICAL

        var mViewPager = findViewById(R.id.pager) as ViewPager
        val mCustomPagerAdapter = CustomPagerAdapter(context, images)
        mViewPager.setAdapter(mCustomPagerAdapter)
    }
}