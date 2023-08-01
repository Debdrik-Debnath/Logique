package com.example.logique

import android.view.View
import android.view.ViewGroup
import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView
import com.example.logique.R

class TaskAdapter(private val tasks: List<TaskItem>) :
    RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {

    class TaskViewHolder(val view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.fragment_dashboard, parent, false)
        return TaskViewHolder(view)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        val task = tasks[position]
        holder.view.findViewById<TextView>(R.id.phoneNo).text = task.phoneNumber
        holder.view.findViewById<TextView>(R.id.task).text = task.task
        holder.view.findViewById<TextView>(R.id.details).text = task.details
    }

    override fun getItemCount() = tasks.size
}
