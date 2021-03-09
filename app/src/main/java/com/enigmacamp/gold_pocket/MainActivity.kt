package com.enigmacamp.gold_pocket

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import com.enigmacamp.gold_pocket.viewmodel.PocketViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var balanceFragment: BalanceFragment
    lateinit var transactionFragment: TransactionFragment
    lateinit var historyFragment: HistoryFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        balanceButton.setOnClickListener(this)
        transactionButton.setOnClickListener(this)
        historyButton.setOnClickListener(this)
        balanceFragment = BalanceFragment()
        transactionFragment = TransactionFragment()
        historyFragment = HistoryFragment()
    }

    override fun onClick(v: View?) {
        when(v) {
            balanceButton -> {
                switchFragment(balanceFragment)
            }
            transactionButton -> {
                switchFragment(transactionFragment)
            }
            historyButton -> {
                startActivity(Intent(this, SplitScreenActivity::class.java))
            }
        }
    }

    private fun switchFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, fragment).commit()
    }
}