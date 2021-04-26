package com.example.genius.view.onboarding.screens

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.genius.R
import kotlinx.android.synthetic.main.fragment_third_screen.view.*


class ThirdScreenFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        val view = inflater.inflate(R.layout.fragment_third_screen, container, false)
        view.finish_button.setOnClickListener{
            findNavController().navigate(R.id.action_onboardingFragment_to_homeFragment)
            onBoardingFinished()
        }



        return view
    }

    //shared preferences when the user has finished viewing the on boarding and has clicked the finished button
    private fun onBoardingFinished(){
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean("Finished",true)
        editor.apply()

    }




}