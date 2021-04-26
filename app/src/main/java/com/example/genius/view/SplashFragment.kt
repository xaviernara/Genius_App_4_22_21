package com.example.genius.view

import android.content.Context
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.postDelayed
import androidx.navigation.fragment.findNavController
import com.example.genius.R
import kotlinx.coroutines.CoroutineScope

class SplashFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        Handler().postDelayed({
//            if(onBoardingFinished()){
//                findNavController().navigate(R.id.action_splashFragment_to_homeFragment)
//            }
//            //val actions = SplashFragmentDirections.actionSplashFragmentToOnboardingFragment()
            findNavController().navigate(R.id.action_splashFragment_to_onboardingFragment)
        },3000)


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    //shared preferences when the user has finished viewing the on boarding and has clicked the finished button
    //and it will return a bool so the user will be sent to the home screen
    private fun onBoardingFinished():Boolean{

        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        return sharedPref.getBoolean("Finished", false)
    }

}