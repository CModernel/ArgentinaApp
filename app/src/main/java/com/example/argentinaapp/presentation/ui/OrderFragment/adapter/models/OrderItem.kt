package com.example.argentinaapp.presentation.ui.OrderFragment.adapter.models

import com.example.argentinaapp.domain.database.entities.OrderEntity
import com.example.argentinaapp.domain.database.entities.OrderLinesEntity

/**
 * Created by Christian Modernel on 6/27/2023 10:46 PM.
 * Email: chrismmodernel@gmail.com
 */
data class OrderItem(
    var order: OrderEntity,
    var lines: List<OrderLinesEntity>
    )
