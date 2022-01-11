package com.dmatveeva.currencies.services

import java.math.BigDecimal
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse


class CurrencyConverterImpl : CurrencyConverter {

    override fun convert(from: String, to: String): String {
       /* val client = HttpClient.newBuilder().build();
        val request = HttpRequest.newBuilder()
            .uri(URI.create("https://cdn.jsdelivr.net/gh/fawazahmed0/currency-api@1/latest/currencies/$from/$to.json"))
            .uri(URI.create("https://cdn.jsdelivr.net/gh/fawazahmed0/currency-api@1/latest/currencies/$from/$to.json"))
            .build();

        val response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();*/
        return  "HEllo v6.!"
    }
}