package com.example.argentinaapp.domain.use_cases.orderLines

import com.example.argentinaapp.data.repositories.OrderLinesRepository
import javax.inject.Inject

/**
 * Created by Christian Modernel on 6/28/2023 1:24 AM.
 * Email: chrismmodernel@gmail.com
 */
class GetAllLinesPerOrderByDateUseCase @Inject constructor(private val orderLinesRepository: OrderLinesRepository){

    suspend operator fun invoke(orderId: Int) = orderLinesRepository.getAllOrderLinesByOrderId(orderId)
}