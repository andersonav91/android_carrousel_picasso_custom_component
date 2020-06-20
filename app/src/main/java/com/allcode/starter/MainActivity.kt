package com.allcode.starter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.allcode.starter.databinding.ActivityMainBinding;

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        var images = arrayListOf<String>(
            "https://i.imgur.com/2bvab7y.jpg",
            "https://i.imgur.com/E4cOSLw.jpg",
            "https://i.imgur.com/tGbaZCY.jpg",
            "https://i.imgur.com/XgbZdeA.jpg",
            "https://i.imgur.com/0XEanXw.jpg"
        );

        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_main)
        binding.images = images
    }
}
