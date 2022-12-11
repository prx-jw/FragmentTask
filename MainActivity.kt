package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {
    lateinit var firstFragment: FirstFragment
    lateinit var secondFragment: SecondFragment


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        firstFragment = FirstFragment.newInstance()
        secondFragment = SecondFragment.newInstance()
    }

    fun swithToFirstFragment(){
        supportFragmentManager
                .beginTransaction()
                .replace(R.id.container,firstFragment)
                .commit()
    }
}