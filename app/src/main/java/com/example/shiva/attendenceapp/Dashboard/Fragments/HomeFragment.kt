package com.example.shiva.attendenceapp.Dashboard.Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.shiva.attendenceapp.R
import kotlinx.android.synthetic.main.home_fragment.*

class HomeFragment:Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.home_fragment,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val sub = arguments!!.getString("date")
        name.text = arguments!!.getString("name")
        date.text = sub.substring(0,sub.indexOf("T"))
        days.text = arguments!!.getString("days")
        venue.text = arguments!!.getString("venue")
    }
}