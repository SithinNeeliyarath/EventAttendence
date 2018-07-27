package com.example.shiva.attendenceapp.Event

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.shiva.attendenceapp.Dashboard.DashboardActivity
import com.example.shiva.attendenceapp.R
import kotlinx.android.synthetic.main.event_row.view.*
import org.jetbrains.anko.intentFor

class EventAdapter(val events: ArrayList<Event>) : RecyclerView.Adapter<EventAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.event_row, parent, false)
        return ViewHolder(layout)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(events.get(position))
    }

    override fun getItemCount(): Int {
        return events.size
    }

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        fun bind(event: Event) {
            view.name.text = event.name
            view.venu.text = event.venue
            view.date.text = event.date.substring(0, event.date.indexOf("T"))

            view.row.setOnClickListener() {
                val context = view.context
                context.startActivity(context.intentFor<DashboardActivity>
                ("name" to event.name,
                        "days" to event.days,
                        "date" to event.date,
                        "venue" to event.venue))
            }
        }

    }
}