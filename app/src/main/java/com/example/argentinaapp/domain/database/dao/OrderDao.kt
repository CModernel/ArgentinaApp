package com.example.argentinaapp.domain.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.RawQuery
import androidx.sqlite.db.SupportSQLiteQuery
import com.example.argentinaapp.domain.database.entities.OrderEntity
import java.time.LocalDate


/**
 * Created by Christian Modernel on 6/28/2023 1:37 AM.
 * Email: chrismmodernel@gmail.com
 */
@Dao
interface OrderDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(orders: List<OrderEntity>)

    @Query("SELECT * FROM Orders WHERE OrderId=:orderId")
    suspend fun getOrderByOrderId(
        orderId: Int
    ) : OrderEntity

    @Query("SELECT * FROM Orders WHERE Date=:date")
    suspend fun getAllOrdersByDate(
        date: LocalDate
    ) : List<OrderEntity>

    @RawQuery
    suspend fun getOrderByFilters(queryString: SupportSQLiteQuery): List<OrderEntity>

    @Query("Delete from Orders")
    suspend fun clearData()
}