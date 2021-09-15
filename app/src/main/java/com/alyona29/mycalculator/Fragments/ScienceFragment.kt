package com.alyona29.mycalculator.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.alyona29.mycalculator.R

import com.alyona29.mycalculator.Fragments.BaseFragment.Companion.getAllViews
import com.alyona29.mycalculator.MainActivity

class ScienceKeyboardFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.science_fragment, container, false)

        view.getAllViews()
            .filterIsInstance<Button>()
            .forEach { it.setOnClickListener(activity as MainActivity?) }

        return view
    }
}