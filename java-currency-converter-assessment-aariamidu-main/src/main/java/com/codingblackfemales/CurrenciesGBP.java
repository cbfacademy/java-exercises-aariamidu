package com.codingblackfemales;

import java.util.HashMap;

public class CurrenciesGBP implements Currencies {
    private HashMap<String, Double> exchangeRates;

    public CurrenciesGBP() {
        this.exchangeRates = new HashMap<String, Double>() {
            {
                put("GBP", 1.0); // Exchange rate for GBP to GBP (1.0)
                put("EUR", 1.16); // Exchange rate for GBP to EUR
                put("USD", 1.31); // Exchange rate for GBP to USD
                put("JPY", 181.78); // Exchange rate for GBP to JPY
            }
        };
    }

    public HashMap<String, Double> getAllExchangeRates() {
        return this.exchangeRates;
    }
}
