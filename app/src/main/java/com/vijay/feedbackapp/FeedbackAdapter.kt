package com.vijay.feedbackapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FeedbackAdapter(val feedbackList : ArrayList<FeedbackModel>):RecyclerView.Adapter<FeedbackAdapter.FeedbackViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeedbackViewHolder {
        val inflater = LayoutInflater.from(parent.context)
            .inflate(R.layout.feedback_list_item, parent, false)
        return FeedbackViewHolder(inflater)
    }

    override fun getItemCount(): Int {
       return feedbackList.size
    }

    override fun onBindViewHolder(holder: FeedbackViewHolder, position: Int) {
        holder.question.text = feedbackList[position].id.toString()+"."+feedbackList[position].question
    }


    class FeedbackViewHolder(view:View) : RecyclerView.ViewHolder(view){

        val question : TextView= view.findViewById<TextView>(R.id.text_question)


    }

}