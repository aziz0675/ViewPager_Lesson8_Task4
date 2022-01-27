package com.example.viewpager_lesson8_task4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    lateinit var viewPagerAdapter: ViewPagerAdapter
    lateinit var viewPager: ViewPager
    lateinit var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()

    }
    fun initViews(){

        viewPager = findViewById(R.id.viewpager)
        viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)

        viewPagerAdapter.add(FirstFragment(),"First")
        viewPagerAdapter.add(FragmentSecond(),"Second")
        viewPagerAdapter.add(FirstFragment(),"Third")
        viewPagerAdapter.add(FragmentSecond(),"Fourth")


        //set the adapter
        viewPager.adapter = viewPagerAdapter

        tabLayout = findViewById(R.id.tab_layout)
        tabLayout.setupWithViewPager(viewPager)
    }
}