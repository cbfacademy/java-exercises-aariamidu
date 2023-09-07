package com.codingblackfemales;

import java.util.Map;

public class BasicCurrencyConverter implements CurrencyConverter {
    public Map<String, Double> exchangeRates;

    public BasicCurrencyConverter(Currencies currencies) {
        this.exchangeRates = currencies.getAllExchangeRates();
    }

    public double convertCurrency(String sourceCurrencyCode, String destinationCurrencyCode, double amount) {
        double exchangeRate = getExchangeRate(sourceCurrencyCode, destinationCurrencyCode); 
        if (amount<=0){
            System.out.println("Please change the amount");
            return 0;
        }
        return amount * exchangeRate;
    }

    public String[] getCurrencyCodes() {
        String[] currencyCodes = exchangeRates.keySet().toArray(String[]::new);
        return currencyCodes;
    }

    public double getExchangeRate(String sourceCurrencyCode, String destinationCurrencyCode) {
         if (sourceCurrencyCode == null || sourceCurrencyCode.isEmpty()) {
            System.out.println("This is an invalid currency code please provide another one from the list above.");
            return 0;
        }
        if (destinationCurrencyCode == null || destinationCurrencyCode.isEmpty()) {
            System.out.println("This is an invalid currency code please provide another one from the list above.");
            return 0;
        }
       
       
        Double sourceExchangeRate = exchangeRates.get(sourceCurrencyCode);
        Double destinationExchangeRate = exchangeRates.get(destinationCurrencyCode);
        if (sourceExchangeRate == null) {
            System.out.println("This exchange rate has not been found for source currency: " + sourceCurrencyCode);
            return 0;
        }
        if (destinationExchangeRate == null) {
            System.out.println("This exchange rate has not been found for destination currency: " + destinationCurrencyCode);
            return 0;
        }
        
        double convertedAmount = (destinationExchangeRate / sourceExchangeRate);
        
        return convertedAmount;

    }

   
}
