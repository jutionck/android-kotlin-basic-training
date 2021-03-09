package com.enigmacamp.gold_pocket

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_balance.*
import kotlinx.android.synthetic.main.fragment_transaction.*

class TransactionFragment(var transactionHandler: TransactionHandler? = null) : Fragment(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_transaction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sellButton.setOnClickListener(this)
        buyButton.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v) {
            sellButton -> {
                transactionHandler?.handleSell(textInputGram.text.toString().toInt())
            }

            buyButton -> {
                transactionHandler?.handleBuy(textInputGram.text.toString().toInt())
            }
        }
    }

}