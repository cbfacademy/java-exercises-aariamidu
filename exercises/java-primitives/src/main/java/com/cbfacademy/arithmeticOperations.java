package com.cbfacademy;

public class arithmeticOperations {
    public static void main(String[] args) {
        double yearlySalaryJob1 = 45000.67;
        double yearlySalaryJob2 = 25000.75;
        double totalYearlySalary = yearlySalaryJob1 + yearlySalaryJob2;

        System.out.println(totalYearlySalary);

        double monthlySalary = (totalYearlySalary / 12);
        System.out.println(monthlySalary);

        double yearlySalary = monthlySalary * 12;
        System.out.println(yearlySalary);

        double salaryMinusBonus = monthlySalary - 150;
        System.out.println(salaryMinusBonus);

        int number1 = 12;
        int number2 = 12;

        System.out.println(number1++);
        // Doesnt recognise unary as syntax is wrong. ++ should come first before
        // calling variable still giving 12.
        System.out.println(++number2);
        // Recognises unary as syntax is correct. ++ came first before
        // calling variable giving 13.

    }
}
