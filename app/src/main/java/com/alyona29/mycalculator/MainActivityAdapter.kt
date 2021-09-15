package com.alyona29.mycalculator

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.alyona29.mycalculator.Fragments.BaseFragment
//import com.alyona29.mycalculator.Fragments.ScienceFragment

class MainActivityAdapter(
    fragmentManager: FragmentManager
) : FragmentPagerAdapter(fragmentManager) {

    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        when(position) {
            0 -> {
                return BaseFragment()
            }
            1 -> {
                //return ScienceFragment()
            }
        }
        return BaseFragment()
    }

}