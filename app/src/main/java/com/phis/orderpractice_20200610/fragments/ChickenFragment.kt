package com.phis.orderpractice_20200610.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.phis.orderpractice_20200610.BaseFragment
import com.phis.orderpractice_20200610.R
import com.phis.orderpractice_20200610.datas.Store

class ChickenFragment :BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_chicken, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setValues()
        setupEvents()
    }

    override fun setValues() {

    }

    override fun setupEvents() {

    }
}