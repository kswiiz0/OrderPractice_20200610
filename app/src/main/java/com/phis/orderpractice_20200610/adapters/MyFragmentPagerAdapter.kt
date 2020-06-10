package com.phis.orderpractice_20200610.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.phis.orderpractice_20200610.fragments.ChickenFragment
import com.phis.orderpractice_20200610.fragments.PizzaFragment

class MyFragmentPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "피자 주문"
            else -> "치킨 주문"
        }
    }


    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> PizzaFragment()
            else -> ChickenFragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }
}