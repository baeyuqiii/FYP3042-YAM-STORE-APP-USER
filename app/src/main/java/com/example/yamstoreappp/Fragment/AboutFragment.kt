package com.example.yamstoreappp.Fragment

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.yamstoreappp.R

class AboutFragment : AppCompatActivity() {
    private lateinit var btn_contact: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_about_fragment)
        // Initialize buttons
        btn_contact = findViewById<Button>(R.id.btn_contact)
        fun navigateToAboutFragment() {
            val intent = Intent(this, AboutFragment::class.java)
            startActivity(intent)
        }

        // Set click listeners
        btn_contact.setOnClickListener {
            val i = Intent(this@AboutFragment, ContactFragment::class.java)
            startActivity(i)
        }
        }
    }
