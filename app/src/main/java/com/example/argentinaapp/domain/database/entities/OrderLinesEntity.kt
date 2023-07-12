package com.example.argentinaapp.domain.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity

/**
 * Created by Christian Modernel on 6/28/2023 12:03 AM.
 * Email: chrismmodernel@gmail.com
 */
@Entity(tableName = "OrderLines", primaryKeys = ["OrderId", "Line"])
data class OrderLinesEntity(
    @ColumnInfo(name = "OrderId")
    var orderId: Int,

    @ColumnInfo(name = "Line")
    var line: Int,

    @ColumnInfo(name = "Name")
    var name: String = "",

    @ColumnInfo(name = "Cost")
    var cost: Double = 0.0
)
