package com.example.argentinaapp.data.repositories

import android.util.Log
import com.example.argentinaapp.data.network.OrderApi
import com.example.argentinaapp.domain.database.dao.OrderDao
import com.example.argentinaapp.domain.database.entities.OrderEntity
import com.example.argentinaapp.utils._Utils
import java.time.LocalDate
import java.util.Calendar
import javax.inject.Inject


/**
 * Created by Christian Modernel on 6/28/2023 1:32 AM.
 * Email: chrismmodernel@gmail.com
 */
class OrderRepository @Inject constructor(
    private val orderApi: OrderApi,
    private val orderDao: OrderDao
) {

    // Returning dummy order
    suspend fun getOrderByOrderId(orderId: Int): OrderEntity? {
        /*
        return try{
            orderDao.getOrderByOrderId(orderId)
        } catch (ex: Exception) {
            ex.printStackTrace()
            Log.e("Error in getEscalaByFilters",ex.toString())
            null
        }
        */


        return OrderEntity(orderId, "Orden1", _Utils.getDate(2023, Calendar.JUNE, 28), 5000.0, 265.0, 475.0, 38.0, 21.2)
    }
}