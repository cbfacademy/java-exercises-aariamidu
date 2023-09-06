package com.codingblackfemales;

import java.util.Arrays;

import java.util.Map;

public class BasicCurrencyConverter implements CurrencyConverter {
    public Map<String, Double> exchangeRates;

    public BasicCurrencyConverter(Currencies currencies) {
        this.exchangeRates = currencies.getAllExchangeRates();
    }

    public double convertCurrency(String sourceCurrencyCode, String destinationCurrencyCode, double amount) {
        double exchangeRate = getExchangeRate(sourceCurrencyCode, destinationCurrencyCode);
        return amount * exchangeRate;
    }

    public String[] getCurrencyCodes() {
        String[] currencyCodes = exchangeRates.keySet().toArray(String[]::new);
        return currencyCodes;
    }

    public double getExchangeRate(String sourceCurrencyCode, String destinationCurrencyCode) {

        if (destinationCurrencyCode == null) {
            throw new IllegalArgumentException("Invalid currency codes provided.");
        }
        if (sourceCurrencyCode == null) {
            throw new IllegalArgumentException("Invalid currency codes provided.");
        }
        if (exchangeRates == null) {
            throw new IllegalArgumentException("Invalid exchange rates provided.");
        }
        Double sourceExchangeRate = exchangeRates.get(sourceCurrencyCode);
        Double destinationExchangeRate = exchangeRates.get(destinationCurrencyCode);

        double convertedAmount = (destinationExchangeRate / sourceExchangeRate);

        return convertedAmount;

    }

    public static void main(String[] args) {
        // CurrenciesGBP class with the getAllExchangeRates() method
        CurrenciesGBP currenciesGBP = new CurrenciesGBP();
        BasicCurrencyConverter basicCurrencyConverter = new BasicCurrencyConverter(currenciesGBP);

        // Get available currency codes
        String[] currencyCodes = basicCurrencyConverter.getCurrencyCodes();
        System.out.println("Available currency codes: " + Arrays.toString(currencyCodes));

        // Source currency code, destination currency code and amount being converted
        String sourceCurrencyCode = "JPY";
        String destinationCurrencyCode = "EUR";
        Double amount = 200.0;

        // Convert currency
        double convertedAmount = basicCurrencyConverter.convertCurrency(sourceCurrencyCode, destinationCurrencyCode,
                amount);

        // Print the converted amount and destination currency
        System.out.println("The amount you will get in " + destinationCurrencyCode + " is " + convertedAmount);
    }
}
