package com.example.argentinaapp.presentation.ui.OrderFragment.viewmodel

import androidx.lifecycle.ViewModel
import com.example.argentinaapp.domain.use_cases.orderLines.GetAllLinesPerOrderByDateUseCase
import com.example.argentinaapp.domain.use_cases.prices.GetQuotesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FragmentOrderViewModel @Inject constructor(
    private val getAllProductsPerOrderByDateUseCase : GetAllLinesPerOrderByDateUseCase,
    private val getQuotesUseCase: GetQuotesUseCase
): ViewModel() {

    //val products = MutableLiveData<List<ProductItem>> = MutableLiveData()

}