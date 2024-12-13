package com.cbfacademy;

public class Car {
    String getMake;
    String getModel;
    int getYear;

    public Car(String Model, String Make, int Year) {
        this.getModel = Model;
        this.getMake = Make;
        this.getYear = Year;
    }

    public String getMake() {
        return this.getMake;
    }

    public String getModel() {
        return this.getModel;
    }

    public int getYear() {
        return this.getYear;
    }

    public static void main(String[] args) {
        Car volvoShop = new Car("Volvo", "V40", 2012);
        Car porscheShop = new Car("Porsche", "Panamera", 2009);
        Car audiShop = new Car("Audi", "A4", 2018);
        System.out.println("This store sells " + volvoShop.getModel);
        System.out.println("This store sells " + porscheShop.getModel);
        System.out.println("This store sells " + audiShop.getModel);
    }

}
