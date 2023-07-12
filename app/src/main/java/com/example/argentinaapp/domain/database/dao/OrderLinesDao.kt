package com.example.argentinaapp.domain.database.dao

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.RawQuery
import androidx.sqlite.db.SupportSQLiteQuery
import com.example.argentinaapp.domain.database.entities.OrderLinesEntity

/**
 * Created by Christian Modernel on 7/10/2023 10:50 AM.
 * Email: chrismmodernel@gmail.com
 */
interface OrderLinesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(ordersLines: List<OrderLinesEntity>)

    @Query("SELECT * FROM OrderLines WHERE OrderId=:orderId")
    suspend fun getOrderLinesByOrderId(
        orderId: Int
    ) : List<OrderLinesEntity?>

    @Query("SELECT * FROM OrderLines WHERE OrderId=:orderId AND Line=:line")
    suspend fun getAllOrderLinesByOrderIdAndLine(
        orderId: Int,
        line: Int
    ) : OrderLinesEntity?

    @RawQuery
    suspend fun getOrderLinesByFilters(queryString: SupportSQLiteQuery): List<OrderLinesEntity>

    @Query("Delete from Orders")
    suspend fun clearData()
}