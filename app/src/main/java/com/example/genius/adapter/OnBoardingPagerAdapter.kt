package com.example.genius.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class OnBoardingPagerAdapter(fragmentManager: FragmentManager,fragmentList:ArrayList<Fragment>, lifecycle:Lifecycle) : FragmentStateAdapter(fragmentManager,lifecycle) {
    /**
     * Return the number of views available.
     */
   /* override fun getCount(): Int {
        return 5
    }

    *//**
     * Return the Fragment associated with a specified position.
     *//*
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
*/


    val fragList = fragmentList
    /**
     * Returns the total number of items in the data set held by the adapter.
     *
     * @return The total number of items in this adapter.
     */
    override fun getItemCount(): Int {
        return fragList.size
    }

    /**
     * Provide a new Fragment associated with the specified position.
     *
     *
     * The adapter will be responsible for the Fragment lifecycle:
     *
     *  * The Fragment will be used to display an item.
     *  * The Fragment will be destroyed when it gets too far from the viewport, and its state
     * will be saved. When the item is close to the viewport again, a new Fragment will be
     * requested, and a previously saved state will be used to initialize it.
     *
     * @see ViewPager2.setOffscreenPageLimit
     */
    override fun createFragment(position: Int): Fragment {
        return fragList[position]
    }

}