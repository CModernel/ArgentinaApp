package com.example.argentinaapp.data.repositories

import com.example.argentinaapp.data.network.PriceQuoteApi
import com.example.argentinaapp.domain.database.dao.PriceQuoteDao
import com.example.argentinaapp.domain.database.entities.PriceQuoteEntity


/**
 * Created by Christian Modernel on 7/10/2023 3:02 PM.
 * Email: chrismmodernel@gmail.com
 */
class PriceQuoteRepository(
    private val quoteApi: PriceQuoteApi,
    private val quoteDao: PriceQuoteDao
){

    // Returning dummy price quote
    suspend fun getLatestPriceQuote(): PriceQuoteEntity? {
        /*return try{
            quoteDao.getLatestPriceQuote()
        } catch (ex: Exception) {
            ex.printStackTrace()
            Log.e("Error in getLatestPriceQuote",ex.toString())
            null
        }*/

        return PriceQuoteEntity(1, 276.0, 266.0, 495.0, 490.0, "2023-07-10T15:15:23.118702-03:00")
    }
}