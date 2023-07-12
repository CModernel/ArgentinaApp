package com.example.argentinaapp.data.repositories

import android.util.Log
import com.example.argentinaapp.data.network.OrderApi
import com.example.argentinaapp.data.network.OrderLinesApi
import com.example.argentinaapp.domain.database.dao.OrderDao
import com.example.argentinaapp.domain.database.dao.OrderLinesDao
import com.example.argentinaapp.domain.database.entities.OrderEntity
import com.example.argentinaapp.domain.database.entities.OrderLinesEntity
import com.example.argentinaapp.utils._Utils
import java.util.Calendar
import javax.inject.Inject


/**
 * Created by Christian Modernel on 7/10/2023 12:15 AM.
 * Email: chrismmodernel@gmail.com
 */
class OrderLinesRepository @Inject constructor(
    private val orderLinesApi: OrderLinesApi,
    private val orderLinesDao: OrderLinesDao,
){
    // Returning dummy order
    suspend fun getAllOrderLinesByOrderId(orderId: Int): List<OrderLinesEntity?>? {
        /*return try{
            orderLinesDao.getOrderLinesByOrderId(orderId)
        } catch (ex: Exception) {
            ex.printStackTrace()
            Log.e("Error in getEscalaByFilters",ex.toString())
            null
        }*/

        return listOf(
            getOrderLineByOrderIdAndLine(orderId,1, 265.0),
            getOrderLineByOrderIdAndLine(orderId,2, 2900.0),
            getOrderLineByOrderIdAndLine(orderId,3, 5000.0),
            getOrderLineByOrderIdAndLine(orderId,4, 900.0)
        )
    }


    // Returning dummy order
    suspend fun getOrderLineByOrderIdAndLine(orderId: Int, line: Int): OrderLinesEntity? {
        /*
        return try{
            orderLinesDao.getAllOrderLinesByOrderIdAndLine(orderId, line)
        } catch (ex: Exception) {
            ex.printStackTrace()
            Log.e("Error in getEscalaByFilters",ex.toString())
            null
        }
        */

        return OrderLinesEntity(orderId, line, "Articulo1",265.0)
    }

    // Returning dummy order
    suspend fun getOrderLineByOrderIdAndLine(orderId: Int, line: Int, cost: Double): OrderLinesEntity? {
        /*
        return try{
            orderLinesDao.getAllOrderLinesByOrderIdAndLine(orderId, line)
        } catch (ex: Exception) {
            ex.printStackTrace()
            Log.e("Error in getEscalaByFilters",ex.toString())
            null
        }
        */

        return OrderLinesEntity(orderId, line, "Articulo $line",cost)
    }
}
