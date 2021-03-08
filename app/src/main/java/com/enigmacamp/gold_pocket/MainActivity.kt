package com.enigmacamp.gold_pocket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        incrementButton.setOnClickListener(this)
        decrementButton.setOnClickListener(this)
        resetButton.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v) {
            incrementButton -> {
                counter++
            }
            decrementButton -> {
                counter--
            }
            resetButton -> {
                counter = 0
            }
        }
        resultText.text = counter.toString()
    }
}