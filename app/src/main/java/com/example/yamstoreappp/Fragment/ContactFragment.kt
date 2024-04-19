package com.example.yamstoreappp.Fragment

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.yamstoreappp.MainActivity
import com.example.yamstoreappp.R

class ContactFragment : AppCompatActivity() {
    private lateinit var btn_faq: Button
    private lateinit var btn_gohome:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_contact_fragment)
        // Initialize buttons
        btn_faq = findViewById<Button>(R.id.btn_faq)
        btn_gohome = findViewById<Button>(R.id.btn_gohome)

        // Set click listeners
        btn_faq.setOnClickListener {
            val i = Intent(this@ContactFragment, FaqFragment::class.java)
            startActivity(i)
        }
        btn_gohome.setOnClickListener {
            val i = Intent(this@ContactFragment, MainActivity::class.java)
            startActivity(i)
        }
    }
}
