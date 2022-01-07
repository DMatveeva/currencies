package com.dmatveeva.currencies

import com.dmatveeva.currencies.services.CurrencyConverter
import com.dmatveeva.currencies.services.CurrencyConverterImpl
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.math.BigDecimal

@RestController
class CurrencyController {

    @GetMapping("/convert")
    fun convert(@RequestParam from: String, @RequestParam to: String): String {
        val converter = CurrencyConverterImpl()
        return converter.convert(from, to)
    }
}