package com.example.genius.view.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.genius.R
import com.example.genius.adapter.OnBoardingPagerAdapter
import com.example.genius.view.MainActivity
import com.example.genius.view.onboarding.screens.ScreenOneFragment
import com.example.genius.view.onboarding.screens.SecondScreenFragment
import com.example.genius.view.onboarding.screens.ThirdScreenFragment
import kotlinx.android.synthetic.main.fragment_onboarding.view.*

class OnboardingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val fragmentList = arrayListOf<Fragment>(
            ScreenOneFragment(),
            SecondScreenFragment(),
            ThirdScreenFragment()
        )

        val adapter = OnBoardingPagerAdapter(requireActivity().supportFragmentManager,
            fragmentList,
            lifecycle
            )


        val view = inflater.inflate(R.layout.fragment_onboarding, container, false)

        view.viewpager.adapter = adapter

        MainActivity.bottomNavBarVisibility(false)



        // Inflate the layout for this fragment
        return view
    }


}