package com.srikant.xactcalc.repo

import androidx.lifecycle.LiveData
import com.srikant.xactcalc.model.History
import com.srikant.xactcalc.roomdb.HistoryDao


class CalculatorRepository(private val historyDao: HistoryDao) {

    val readAllData: LiveData<List<History>> = historyDao.readAllData()

    fun addHistory(history: History){
        historyDao.addHistory(history)
    }

    fun deleteHistory(history: History){
        historyDao.deleteHistory(history)
    }
}