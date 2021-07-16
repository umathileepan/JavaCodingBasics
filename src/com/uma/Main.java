package com.uma;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {
	    System.out.println("Hello World");

        int principal = (int) readNumber("Principal($1K-1M): ", 1_000, 1_000_000);
        float annualInterestRate = (float) readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) readNumber("Period (Years) : ", 1, 30);

        printMortgage(principal, annualInterestRate, years);
        printPaymentSchedule(principal, annualInterestRate, years);
    }

    private static void printMortgage(int principal, float annualInterestRate, byte years) {
        double mortgage = calculateMortgage(principal, annualInterestRate, years);
        String result = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("---------");
        System.out.print("Monthly Payments: " + result);
    }

    private static void printPaymentSchedule(int principal, float annualInterestRate, byte years) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for(short month = 1; month <= years * MONTHS_IN_YEAR; month++){
           double balance = calculateBalance(principal, annualInterestRate, years,month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    public static double readNumber(String  prompt, double min, double max){
         double value;
         while(true) {
             System.out.println(prompt);
             Scanner scanner = new Scanner(System.in);
             value = scanner.nextDouble();
             if(value >= min && value <= max)
                 break;
             System.out.println("Enter a value between " + min + " and " +  max);
         }
         return value;
     }

     public static double calculateBalance(int principal, float annualInterestRate, byte years, int noOfPaymentsMade){

         float monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
         short numberOfPayments = (short) (years * MONTHS_IN_YEAR);

         return principal * (Math.pow(1 + monthlyInterestRate, numberOfPayments) - Math.pow(1 + monthlyInterestRate, noOfPaymentsMade)) / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

     }

     public static double calculateMortgage(int principal, float annualInterestRate, byte years){

        float monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = (short) (years * MONTHS_IN_YEAR);
        return principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
    }
}
