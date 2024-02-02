package com.vijay.feedbackapp

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.google.firebase.firestore.FirebaseFirestore

class FeedBackScreen : AppCompatActivity() {

    lateinit var rv : RecyclerView
    lateinit var adapter : FeedbackAdapter
    lateinit var marqueeText :TextView
    lateinit var btn:Button


    var feedbacks:ArrayList<FeedbackModel> = arrayListOf(
        FeedbackModel(1,"Knowledge",0),
        FeedbackModel(2,"Communication ability",0),
        FeedbackModel(3,"Manage the class",0),
        FeedbackModel(4,"Caring slow learners",0),
        FeedbackModel(5,"Assignment methods",0),
        FeedbackModel(6,"Commitment in evaluation",0),
        FeedbackModel(7,"Time manage",0),
        FeedbackModel(8,"Interpersonal relationshi[p",0),
        FeedbackModel(9,"Approchability",0),
        FeedbackModel(10,"Punctuality",0)
    )
 //private   val firestore = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feed_back_screen)

        val marqueeTextView: TextView = findViewById(R.id.marqueeText)
        marqueeTextView.isSelected = true
        rv = findViewById(R.id.rv)
        adapter = FeedbackAdapter(feedbacks)
        rv.adapter = adapter

        btn = findViewById(R.id.btnSubmit)

//        btn.setOnClickListener {
//            addUserToFirestore(feedbacks)
//        }
//




    }
//    private fun addUserToFirestore(user: ArrayList<FeedbackModel>) {
//        // Reference to the "users" collection
//        val usersCollection = firestore.collection("users")
//
//        user.forEach {
//            usersCollection.add(it)
//                .addOnSuccessListener { documentReference ->
//
//                    Toast.makeText(this, "Thankyou for your feedback", Toast.LENGTH_SHORT)
//                    // Document added successfully
//                    //Log.d(TAG, "DocumentSnapshot added with ID: ${documentReference.id}")
//                }
//                .addOnFailureListener { e ->
//                     // Error adding document
//                    // Log.e(TAG, "Error adding document", e)
//                    Toast.makeText(this, "Error Occured", Toast.LENGTH_SHORT)
//                }
//        }
//    }
////    private fun saveUserData() {
////      val user = feedbacks
////        addUserToFirestore(user)
////    }
//
//    companion object {
//        private const val TAG = "YourActivity"
//    }
}