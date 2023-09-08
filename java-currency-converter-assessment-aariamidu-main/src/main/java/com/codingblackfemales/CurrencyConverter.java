package com.codingblackfemales;

public interface CurrencyConverter {
    /*
     * This method accepts the source currency code, a destination currency code,
     * and an amount. It will return the converted amount (i.e. the value of the
     * destination currency once converted from the provided amount in the source
     * currency).
     */
    double convertCurrency(String sourceCurrencyCode, String destinationCurrencyCode, double amount);

    // This will return an array of available currency codes.
    String[] getCurrencyCodes();

    // This will return the exchange rate between the provided currencies.
    double getExchangeRate(String sourceCurrencyCode, String destinationCurrencyCode);
}