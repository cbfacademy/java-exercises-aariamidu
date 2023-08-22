package com.cbfacademy;

public class Store {
    // INSTANCE FIELDS
    // Add two new instance fields for Store for inventoryCount of type int and
    // inventoryPrice of type double.

    String productType;
    int inventoryCount;
    double inventoryPrice;

    // CONSTRUCTOR METHOD
    // Update the Store constructor method with the new parameters.
    // The parameters should be product, count, and price, in that order also known
    // as constructor signatures. A signature is made up of the constructor’s name
    // and a list of its parameters.
    // You must use that order and include the types for each parameter. For
    // example, product is of type String because that value is assigned to the
    // instance field String productType.
    // In the body of the Store constructor, assign the parameter values to the
    // appropriate instance fields.
    public Store(String product, int count, double price) {
        productType = product;
        inventoryCount = count;
        inventoryPrice = price;
    }

    // MAIN METHOD
    // Inside main(), create an instance of Store called cookieShop.
    // cookieShop has "cookies" as the product.
    // cookieShop has 12 cookies to sell and each cookie costs 3.75.
    // . allows us to access the variables and methods of an object or a Class e.g.
    // cookieShop.productType in the variable Store

    public static void main(String[] args) {
        Store cookieShop = new Store("cookies", 12, 3.75);
        System.out.println("The store sells " + cookieShop.productType + "." + " " + "They only have" + " "
                + cookieShop.inventoryCount + " " + "which they sell for" + " £" + cookieShop.inventoryPrice + ".");

    }
}
