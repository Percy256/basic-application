package com.example.basicapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class CreateRoutines : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_routines)
    }

    fun Back(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun RouteToOther(view: View) {
        val intent = Intent(this, CreateNewRoutine::class.java)
        startActivity(intent)
    }

    fun AddEvent(view: View) {}
}