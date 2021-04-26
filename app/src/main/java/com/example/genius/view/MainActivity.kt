package com.example.genius.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.genius.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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
}