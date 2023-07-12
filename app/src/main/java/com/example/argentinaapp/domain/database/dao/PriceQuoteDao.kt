package com.example.argentinaapp.domain.database.dao

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.argentinaapp.domain.database.entities.PriceQuoteEntity


/**
 * Created by Christian Modernel on 7/10/2023 5:30 PM.
 * Email: chrismmodernel@gmail.com
 */
interface PriceQuoteDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(priceQuote: PriceQuoteEntity)

    @Query("SELECT * FROM PriceQuote Order By LastUpdate DESC LIMIT 1")
    suspend fun getLatestPriceQuote(): PriceQuoteEntity?

    @Query("DELETE FROM PriceQuote")
    suspend fun clearData()
}