package com.example.iself

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.example.iself.reference.ReferenceActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(findViewById(R.id.home_toolbar))

        findViewById<CardView>(R.id.cd_plan).setOnClickListener {
            val intent = Intent(this, PlanYourDayActivity::class.java)
            startActivity(intent)
        }

        findViewById<CardView>(R.id.cd_reference).setOnClickListener {
            val intent = Intent(this, ReferenceActivity::class.java)
            startActivity(intent)
        }

        findViewById<CardView>(R.id.cd_quotes).setOnClickListener {
            val intent = Intent(this, QuoteActivity::class.java)
            startActivity(intent)
        }

        findViewById<CardView>(R.id.cd_analyze).setOnClickListener {
            val intent = Intent(this, AnalyzeActivity::class.java)
            startActivity(intent)
        }

        findViewById<CardView>(R.id.cd_progress).setOnClickListener {
            val intent = Intent(this, ProgressActivity::class.java)
            startActivity(intent)
        }

        findViewById<CardView>(R.id.cd_done_so_far).setOnClickListener {
            val intent = Intent(this, DoneSoFarActivity::class.java)
            startActivity(intent)
        }
    }
}