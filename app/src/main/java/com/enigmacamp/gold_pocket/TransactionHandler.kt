package com.enigmacamp.gold_pocket

interface TransactionHandler {

    fun handleSell(stock: Int)
    fun handleBuy(stock: Int)
}