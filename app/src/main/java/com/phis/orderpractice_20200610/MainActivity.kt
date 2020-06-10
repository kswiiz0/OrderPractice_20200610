package com.phis.orderpractice_20200610

import android.os.Bundle
import androidx.fragment.app.FragmentPagerAdapter
import com.phis.orderpractice_20200610.adapters.MyFragmentPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    lateinit var pagerAdapter: FragmentPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setValues()
        setupEvents()

    }

    override fun setValues() {

        pagerAdapter = MyFragmentPagerAdapter(supportFragmentManager)
        viewPagerMain.adapter = pagerAdapter;

        tablayout.setupWithViewPager(viewPagerMain)


    }

    override fun setupEvents() {

    }

}
