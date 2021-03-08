package com.enigmacamp.gold_pocket

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buyProduct.setOnClickListener(this)
        sellProduct.setOnClickListener(this)
        historyProduct.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v) {
            buyProduct -> {
                val intent = Intent(this, BuyActivity::class.java)
                startActivity(intent)
            }
            sellProduct -> {}
            historyProduct -> {}
        }
    }
}