package com.uma;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Hello World");
	    long viewCount = 3_123_456_789L;

	    final byte MONTHS_IN_YEAR = 12;
	    final byte PERCENT = 100;

	    Scanner scanner = new Scanner(System.in);
        int principal;
        float annualInterestRate;
        float monthlyInterestRate;
        byte years;
        int numberOfPayments;

        while(true) {
            System.out.print("Principal($1K-1M): ");
            principal = scanner.nextInt();
            if(principal >= 1000 && principal <= 1_000_000 ) {
                break;
            }
            else{
                System.out.println("Enter a number between 1_000 and 1_000_000");
            }

        }

        while(true) {
            System.out.print("Annual Interest Rate: ");
            annualInterestRate = scanner.nextFloat();
            if(annualInterestRate >= 1 && annualInterestRate <= 30) {
                monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            else {
                System.out.println("Enter a value greater than 0 and less than or equal 30.");

            }
        }

        while(true) {
            System.out.print("Period (Years) : ");
            years = scanner.nextByte();
            if(years >= 1 && years <= 30) {
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            else{
                System.out.println("Enter a value between 1 and 30");
            }
        }

        double mortgage = principal*(monthlyInterestRate*Math.pow(1+monthlyInterestRate,numberOfPayments)/Math.pow(1+monthlyInterestRate,numberOfPayments)-1);
        String result = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Mortgage: " + result);

    }
}
