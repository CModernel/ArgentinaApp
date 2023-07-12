package com.example.argentinaapp.domain.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity

/**
 * Created by Christian Modernel on 6/28/2023 12:00 AM.
 * Email: chrismmodernel@gmail.com
 */
@Entity(tableName = "Orders", primaryKeys = ["orderId"])
data class OrderEntity(
    @ColumnInfo(name = "OrderId")
    var orderId: Int,

    @ColumnInfo(name = "Name")
    var name: String = "",

    @ColumnInfo(name = "Date")
    var date: Long,

    @ColumnInfo(name = "Total")
    var total: Double = 0.0,

    @ColumnInfo(name = "OficialUSD")
    var oficialUSD: Double = 0.0,

    @ColumnInfo(name = "BlueUSD")
    var blueUSD: Double = 0.0,

    @ColumnInfo(name = "OficialToLocalCurrency")
    var oficialToLocalCurrency: Double = 0.0,

    @ColumnInfo(name = "BlueToLocalCurrency")
    var blueToLocalCurrency: Double = 0.0
)
