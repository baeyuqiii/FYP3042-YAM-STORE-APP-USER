package com.example.yamstoreappp.Fragment

import ExAdapter
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ExpandableListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.yamstoreappp.MainActivity
import com.example.yamstoreappp.R

class FaqFragment : AppCompatActivity() {
    private lateinit var btn_gohome2: Button
    private lateinit var expandableListView: ExpandableListView
    private lateinit var adapter: ExAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_faq_fragment)
        // Initialize buttons
        btn_gohome2 = findViewById<Button>(R.id.btn_gohome2)

        // Set click listeners
        btn_gohome2.setOnClickListener {
            val i = Intent(this@FaqFragment, MainActivity::class.java)
            startActivity(i)
        }
        expandableListView = findViewById(R.id.expandableListView)

        val listData = HashMap<String, List<String>>()
        val questions = mutableListOf<String>()
        val answers = mutableListOf<String>()

        // Add questions and answers
        questions.add("What are the operating days of Yam Tomyam Taman Bukit Angkasa?")
        questions.add("Does Yam Tomyam Taman Bukit Angkasa provide Wireless Internet (WiFi) service?")
        questions.add("To make a booking at Yam Tomyam Taman Bukit Angkasa, please contact this number [011-1150 1092].")
        questions.add("Payment for food orders can be done either by going to the counter or using QR code payment.")
        questions.add("Can I track my order status through the Yam Store App?")
        questions.add("Is the menu in the Yam Store app the same as the menu at Yam Tomyam Taman Bukit Angkasa?")

        answers.add("Yam Tomyam Taman Bukit Angkasa is open on Sundays to Saturdays from 8:00 AM to 11:30 PM.")
        answers.add("Yes, Yam Tomyam Taman Bukit Angkasa has WiFi available at this location.")
        answers.add("To make a booking at Yam Tomyam Taman Bukit Angkasa, please contact this number [011-1150 1092].")
        answers.add("Payment for food orders can be done either by going to the counter or using QR code payment.")
        answers.add("Yes, Yam Store App provides real-time order tracking to keep you updated on the status of your food order.")
        answers.add("Yes, the menu in the Yam Store app matches the menu at Yam Tomyam Taman Bukit Angkasa.")

        listData[questions[0]] = listOf(answers[0])
        listData[questions[1]] = listOf(answers[1])
        listData[questions[2]] = listOf(answers[2])
        listData[questions[3]] = listOf(answers[3])
        listData[questions[4]] = listOf(answers[4])
        listData[questions[5]] = listOf(answers[5])

        adapter = ExAdapter(this, questions, listData)
        expandableListView.setAdapter(adapter)

        expandableListView.setOnChildClickListener { _, _, groupPosition, childPosition, _ ->
            Toast.makeText(
                applicationContext,
                questions[groupPosition] + " : " + listData[questions[groupPosition]]?.get(childPosition),
                Toast.LENGTH_SHORT
            ).show()
            false
        }
    }
}
