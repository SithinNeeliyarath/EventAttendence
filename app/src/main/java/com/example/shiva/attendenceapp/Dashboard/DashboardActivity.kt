package com.example.shiva.attendenceapp.Dashboard

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.example.shiva.attendenceapp.Dashboard.Fragments.AddMemberFragment
import com.example.shiva.attendenceapp.Dashboard.Fragments.HomeFragment
import com.example.shiva.attendenceapp.R
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                val homeFragment = HomeFragment()
                replaceFragment(homeFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_add_member -> {
                val homeFragment = AddMemberFragment()
               // replaceFragment(addMember)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_scan_qr -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_member_list -> {
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        val homeFragment = HomeFragment()
        replaceFragment(homeFragment)

    }

    fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
                .replace(R.id.base_layout, fragment)
                .commit()
    }
}
