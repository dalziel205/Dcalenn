package com.example.dcalen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var addTaskButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addTaskButton = findViewById(R.id.addtask)
        addTaskButton.setOnClickListener {
            val intent = Intent(this, AddTaskActi::class.java)
            startActivity(intent)
        }
    }
}
