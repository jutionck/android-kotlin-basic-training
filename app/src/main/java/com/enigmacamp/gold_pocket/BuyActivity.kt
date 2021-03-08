package com.enigmacamp.gold_pocket

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class BuyActivity : AppCompatActivity() {

    private val ACTIVITY_NAME = "BuyActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i(ACTIVITY_NAME, "OnCreate()")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buy)
    }

    fun handleBack(view: View) {
        finish()
        //onBackPressed()
    }

    override fun onStart() {
        super.onStart()
        Log.i(ACTIVITY_NAME, "OnStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.i(ACTIVITY_NAME, "OnResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.i(ACTIVITY_NAME, "OnPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.i(ACTIVITY_NAME, "OnStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(ACTIVITY_NAME, "OnDestroy()")
    }
}