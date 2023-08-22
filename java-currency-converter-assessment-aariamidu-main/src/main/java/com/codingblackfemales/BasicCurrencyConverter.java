package com.codingblackfemales;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class BasicCurrencyConverter implements CurrencyConverter {
    public Map<String, Double> exchangeRates;

    public BasicCurrencyConverter(HashMap<String, Double> exchangeRates) {
        this.exchangeRates = exchangeRates;
    }

    public double convertCurrency(String sourceCurrencyCode, String destinationCurrencyCode, double amount) {
        double exchangeRate = getExchangeRate(sourceCurrencyCode, destinationCurrencyCode);
        return amount * exchangeRate;
    }

    public String[] getCurrencyCodes() {
        Set<String> currencyCodes = new HashSet<>();
        for (String exchangeRateKey : exchangeRates.keySet()) {
            String[] currencies = exchangeRateKey.split(":");
            if (currencies.length >= 2) {
                currencyCodes.add(currencies[0]);
                currencyCodes.add(currencies[1]);
            } else {
                currencyCodes.add(exchangeRateKey);
            }
        }
        return currencyCodes.toArray(new String[0]);
    }

    public double getExchangeRate(String sourceCurrencyCode, String destinationCurrencyCode) {
        String exchangeRateKey = sourceCurrencyCode + ":" + destinationCurrencyCode;
        Double exchangeRate = exchangeRates.get(exchangeRateKey);
        if (exchangeRate == null) {
            System.out.println(
                    "Exchange rate not found for " + exchangeRateKey + ". Using default exchange rate 1.0 in GBP");
            return 1.0; // Return default exchange rate
        }
        if (exchangeRate <= 0.0) {
            throw new IllegalArgumentException("This is an invalid exchange rate for " + exchangeRateKey + ": " + exchangeRate);
        }
        return exchangeRate;
    }

    public static void main(String[] args) {
        //CurrenciesGBP class with the getAllExchangeRates() method
        CurrenciesGBP currenciesGBP = new CurrenciesGBP();
        HashMap<String, Double> exchangeRates = currenciesGBP.getAllExchangeRates();
        BasicCurrencyConverter basicCurrencyConverter = new BasicCurrencyConverter(exchangeRates);

        // Get available currency codes
        String[] currencyCodes = basicCurrencyConverter.getCurrencyCodes();
        System.out.println("Available currency codes: " + Arrays.toString(currencyCodes));

        // Source currency code, destination currency code and amount being converted
        String sourceCurrencyCode = "GBP";
        String destinationCurrencyCode = "EUR";
        double amount = 200.0;

        // Convert currency
        double convertedAmount = basicCurrencyConverter.convertCurrency(sourceCurrencyCode, destinationCurrencyCode,
                amount);

        // Print the converted amount and destination currency
        System.out.println("The amount you will get in " + destinationCurrencyCode + " is " + convertedAmount);
    }
}
