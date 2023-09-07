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
        String destinationCurrencyCode = "JPY";
        Double amount = 200.00;
       

        // Convert currency
        double convertedAmount = basicCurrencyConverter.convertCurrency(sourceCurrencyCode, destinationCurrencyCode,
                amount);
        
        String formattedAmount = String.format("%.2f", convertedAmount);
        
        String destinationCurrencySymbol = "";
        if ("USD".equals(destinationCurrencyCode)) {
            destinationCurrencySymbol = "$";
        } if ("GBP".equals(destinationCurrencyCode)) {
            destinationCurrencySymbol = "£";
        } if ("JPY".equals(destinationCurrencyCode)) {
            destinationCurrencySymbol = " ¥";
        } else if ("EUR".equals(destinationCurrencyCode)) {
            destinationCurrencySymbol = "€";
        }

        // Print the formatted amount and destination currency
        System.out.println("The amount you will get in " + destinationCurrencyCode + " is " + destinationCurrencySymbol + formattedAmount);
   }
}