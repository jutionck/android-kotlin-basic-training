package com.enigmacamp.gold_pocket

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener, TransactionHandler {

    var balance: Int = 0

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
        transactionFragment = TransactionFragment(this)
        historyFragment = HistoryFragment()
    }

    override fun handleSell(stock: Int) {
        balance -= stock
        balanceFragment.updateBalance(balance)
    }

   override fun handleBuy(stock: Int) {
        balance += stock
        balanceFragment.updateBalance(balance)

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