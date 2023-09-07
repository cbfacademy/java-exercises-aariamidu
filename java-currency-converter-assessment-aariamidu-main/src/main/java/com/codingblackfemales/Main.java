package com.codingblackfemales;

import java.util.Arrays;

public class Main {
   public static void main(String[] args) {
        // CurrenciesGBP class with the getAllExchangeRates() method
        CurrenciesGBP currenciesGBP = new CurrenciesGBP();
        BasicCurrencyConverter basicCurrencyConverter = new BasicCurrencyConverter(currenciesGBP);

        // Get available currency codes
        String[] currencyCodes = basicCurrencyConverter.getCurrencyCodes();
        System.out.println("Available currency codes: " + Arrays.toString(currencyCodes));

        // Source currency code, destination currency code and amount being converted
        String sourceCurrencyCode = "GBP";
        String destinationCurrencyCode = "EUR";
        Double amount = 200.00;
       

        // Convert currency
        double convertedAmount = basicCurrencyConverter.convertCurrency(sourceCurrencyCode, destinationCurrencyCode,
                amount);
        

        // Print the converted amount and destination currency
        System.out.println("The amount you will get in " + destinationCurrencyCode + " is " + convertedAmount);
    }
}
//how to format amount