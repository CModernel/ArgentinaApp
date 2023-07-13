package com.example.argentinaapp.domain.use_cases.prices

import com.example.argentinaapp.data.repositories.OrderLinesRepository
import javax.inject.Inject

/**
 * Created by Christian Modernel on 7/10/2023 3:00 PM.
 * Email: chrismmodernel@gmail.com
 */
class GetQuotesUseCase @Inject constructor(private val orderLinesRepository: OrderLinesRepository){

    suspend operator fun invoke(orderId: Int) = orderLinesRepository.getAllOrderLinesByOrderId(orderId)
}