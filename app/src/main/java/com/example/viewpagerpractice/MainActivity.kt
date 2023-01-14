package com.example.viewpagerpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpagerpractice.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // 조금 뒤에 MainViewPagerAdapter클래스를 담아줄게
    // mViewpagerAdapter에 MainViewPagerAdapter클래스를 담아준다.
    lateinit var mViewpagerAdapter : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        // 최초로 실행되면 MainViewPagerAdapter클래스를 담아주는데 supportFragmentManager로 담을거야
        mViewpagerAdapter = MainViewPagerAdapter(supportFragmentManager)

        // 메인 xml의 id가 mainViewPagerd인 프래그먼트의 어댑터는 mViewpagerAdapter가 될거다
        mainViewPager.adapter = mViewpagerAdapter

        // 페이지가 많아지면 간단하게 부드럽도록 지원하는 기능???
        mainViewPager.offscreenPageLimit = 5
    }
}