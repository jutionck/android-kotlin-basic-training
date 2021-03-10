package com.enigmacamp.gold_pocket.ui.balance

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.enigmacamp.gold_pocket.R
import com.enigmacamp.gold_pocket.viewmodel.PocketViewModel
import kotlinx.android.synthetic.main.fragment_balance.*

class BalanceFragment : Fragment() {

    lateinit var pocketViewModel: PocketViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        pocketViewModel = ViewModelProviders.of(requireActivity()).get(PocketViewModel::class.java)
        return inflater.inflate(R.layout.fragment_balance, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("BALANCE FRAGMENT", activity.toString())
        val balanceObserver: Observer<Int> = Observer {
            balanceTextView.text = it.toString()
        }

        pocketViewModel.balance.observe(viewLifecycleOwner, balanceObserver)
    }

//    fun updateBalance(balance: Int) {
//        this.balance = balance
//        balanceTextView?.text = this.balance.toString()
//    }

}