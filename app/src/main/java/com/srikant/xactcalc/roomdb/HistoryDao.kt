package com.srikant.xactcalc.roomdb

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.srikant.xactcalc.model.History

@Dao
interface HistoryDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
 fun addHistory(history: History)

    @Delete
    fun deleteHistory(history: History)

    @Query("SELECT * FROM calculator_table ORDER BY id ASC")
    fun readAllData(): LiveData<List<History>>

}