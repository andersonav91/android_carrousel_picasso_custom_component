package com.allcode.starter.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.viewpager.widget.PagerAdapter
import com.allcode.starter.R
import com.squareup.picasso.Picasso
import java.util.*

class CustomPagerAdapter(context: Context, images: ArrayList<String>) : PagerAdapter() {
    private val mContext: Context
    private val mLayoutInflater: LayoutInflater
    private var images = ArrayList<String>()

    override fun getCount(): Int {
        return images.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object` as LinearLayout
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view = mLayoutInflater.inflate(R.layout.pager_item, container, false)
        container.addView(view)
        val img = view.findViewById<View>(R.id.imageView) as ImageView
        Picasso.get()
            .load(images[position])
            .centerCrop()
            .fit()
            .into(img)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as LinearLayout)
    }

    init {
        this.images = images
        mContext = context
        mLayoutInflater = mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    }
}