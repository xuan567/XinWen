package com.example.xinwen.View.home

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter


class MyPagerAdapter(lifecycle: Lifecycle, fm: FragmentManager?, fragmentList: List<Fragment>):
    FragmentStateAdapter(fm!!,lifecycle){
    var fragmentList:List<Fragment>

    init {
        this.fragmentList = fragmentList
    }

    override fun getItemCount(): Int {
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }

}