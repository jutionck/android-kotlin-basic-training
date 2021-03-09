package com.enigmacamp.gold_pocket

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import com.enigmacamp.gold_pocket.viewmodel.PocketViewModel
import kotlinx.android.synthetic.main.fragment_balance.*
import kotlinx.android.synthetic.main.fragment_transaction.*

class TransactionFragment : Fragment(), View.OnClickListener {

    lateinit var pocketViewModel: PocketViewModel

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
        pocketViewModel = ViewModelProviders.of(requireActivity()).get(PocketViewModel::class.java)
    }

    override fun onClick(v: View?) {
        when(v) {
            sellButton -> {
                pocketViewModel.handleDecrement(textInputGram.text.toString().toInt())
            }

            buyButton -> {
                pocketViewModel.handleIncrement(textInputGram.text.toString().toInt())
            }
        }
    }
}