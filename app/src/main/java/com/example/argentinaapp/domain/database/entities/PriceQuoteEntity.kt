package com.example.argentinaapp.domain.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Christian Modernel on 7/10/2023 3:34 PM.
 * Email: chrismmodernel@gmail.com
 */
@Entity(tableName = "PriceQuote")
class PriceQuoteEntity (
    @PrimaryKey
    var primaryKey: Int = 1,

    @ColumnInfo(name = "OficialSell")
    var oficialSell: Double,

    @ColumnInfo(name = "OficialBuy")
    var oficialBuy: Double,

    @ColumnInfo(name = "BlueSell")
    var blueSell: Double,

    @ColumnInfo(name = "BlueBuy")
    var blueBuy: Double,

    @ColumnInfo(name = "LastUpdate")
    var lastUpdate: String = ""
)