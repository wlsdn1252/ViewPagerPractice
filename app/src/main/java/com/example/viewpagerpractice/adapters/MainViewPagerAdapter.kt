package com.example.viewpagerpractice.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.viewpagerpractice.ftagments.GreetingsFragment
import com.example.viewpagerpractice.ftagments.MyinfoFragment
import com.example.viewpagerpractice.ftagments.NameFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm){

    // 몇번의 포지션에따라 어떤 프래그먼트가 나와야하는지 물어보는 함수
    override fun getItem(position: Int): Fragment {
        if(position == 0){
            return NameFragment()
        }else if(position == 1){
            return MyinfoFragment()
        }else{
            return GreetingsFragment()
        }
    }

    // 총 몇개의 프래그먼트인지 카운트하는 함수
    override fun getCount(): Int {
        return 3
    }



}