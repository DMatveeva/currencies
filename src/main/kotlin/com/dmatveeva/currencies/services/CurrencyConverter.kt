package com.dmatveeva.currencies.services

import java.math.BigDecimal

interface CurrencyConverter{

    fun convert(from: String, to:String): String
}