package com.enigmacamp.gold_pocket.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PocketViewModel: ViewModel() {

    var balance: MutableLiveData<Int> = MutableLiveData(0)

    fun handleIncrement(increment: Int) {
        balance.postValue(balance.value?.plus(increment))
    }

    fun handleDecrement(decrement: Int) {
        balance.postValue(balance.value?.plus(decrement))
    }
}