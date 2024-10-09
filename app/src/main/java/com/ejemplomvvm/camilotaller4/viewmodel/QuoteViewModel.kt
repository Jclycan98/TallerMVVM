package com.ejemplomvvm.camilotaller4.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ejemplomvvm.camilotaller4.model.QuoteModel
import com.ejemplomvvm.camilotaller4.model.QuoteProvider

class QuoteViewModel: ViewModel() {
    val quoteModel= MutableLiveData<QuoteModel>()

    fun randomQuote(){
        val currentQuote = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }

}