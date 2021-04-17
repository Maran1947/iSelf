package com.example.iself.reference

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentContainerView
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.iself.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ReferenceActivity : AppCompatActivity() {

    private lateinit var addFab: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reference)

        addFab = findViewById(R.id.add_fab)
        addFab.setOnClickListener {

        }
    }
}