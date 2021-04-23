package com.example.genius.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.genius.view.OnboardingObjectFragment

class OnBoardingPagerAdapter(fragmentManager: FragmentManager) : FragmentStatePagerAdapter(fragmentManager) {
    /**
     * Return the number of views available.
     */
    override fun getCount(): Int {
        return 5
    }

    /**
     * Return the Fragment associated with a specified position.
     */
    override fun getItem(position: Int): Fragment {
        val fragment = OnboardingObjectFragment()
        fragment.arguments = Bundle().apply{
            putInt("Object", position+1)
        }

        return fragment
    }

    override fun getPageTitle(position: Int): CharSequence {
       // return super.getPageTitle(position)
        return "Object "+ position+1
    }

}