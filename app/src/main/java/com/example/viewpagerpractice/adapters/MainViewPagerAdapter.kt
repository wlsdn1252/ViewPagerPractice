package com.example.viewpagerpractice.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.viewpagerpractice.ftagments.GreetingsFragment
import com.example.viewpagerpractice.ftagments.MyinfoFragment
import com.example.viewpagerpractice.ftagments.NameFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm){

    // 프래그먼트 페이지마다 탭레이아웃의 제목이 뭔가요
    override fun getPageTitle(position: Int): CharSequence? {
        return when (position){
            0 -> "이름"
            1 -> "내 정보"
            else -> "인사말"
        }
    }


    // 몇번의 포지션에따라 어떤 프래그먼트가 나와야하는지 물어보는 함수
    override fun getItem(position: Int): Fragment {
        return when (position){
            0 -> NameFragment()
            1 -> MyinfoFragment()
            else -> GreetingsFragment()
        }
    }

    // 총 몇개의 프래그먼트인지 카운트하는 함수
    override fun getCount(): Int {
        return 3
    }



}