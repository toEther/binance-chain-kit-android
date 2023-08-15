package io.definenulls.binancechainkit.core

import io.definenulls.binancechainkit.models.Balance
import io.definenulls.binancechainkit.models.LatestBlock
import io.definenulls.binancechainkit.models.SyncState
import io.definenulls.binancechainkit.models.Transaction

interface IStorage {
    var latestBlock: LatestBlock?
    var syncState: SyncState?

    fun setBalances(balances: List<Balance>)
    fun getBalance(symbol: String): Balance?
    fun getAllBalances(): List<Balance>?
    fun removeBalances(balances: List<Balance>)

    fun addTransactions(transactions: List<Transaction>)
    fun getTransaction(hash: String): Transaction?
    fun getTransactions(
        symbol: String,
        fromAddress: String?,
        toAddress: String?,
        fromTransactionHash: String?,
        limit: Int?
    ): List<Transaction>
}
