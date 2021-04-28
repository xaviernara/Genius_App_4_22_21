package com.example.genius.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.genius.R
import com.example.genius.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }


        supportActionBar?.hide()

        BottomNavigationView.OnNavigationItemSelectedListener {

            when(it.itemId){

                R.id.favorite_menu ->{

                    true
                }

                R.id.video_menu ->{

                    true
                }
                R.id.home_menu ->{

                    true
                }

                R.id.search_menu->{

                    true
                }


                else -> false
            }

        }

    }

    companion object{

        private lateinit var binding : ActivityMainBinding

        fun bottomNavBarVisibility(isVisible: Boolean){

            if (isVisible) binding.bottomNav.visibility = View.VISIBLE

            binding.bottomNav.visibility = View.GONE

        }
    }
}