package com.uma;

import com.uma.Generics.GenericList;
import com.uma.Generics.User;
import com.uma.Generics.Utils;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Hello World");

        var list = new GenericList<Integer>();
        list.add(5);
        list.add(10);
        int num1 = list.get(0);
        System.out.println(num1);

        var user1 = new User(50);
        var user2 = new User(20);
        if(user1.compareTo(user2) < 0)
            System.out.println("User1 < User2");
        else if(user1.compareTo(user2) == 0)
            System.out.println("User1 == User2");
        else
            System.out.println("User1 > User2");

        var max = Utils.max(23,4);
        System.out.println("Maximum between two numbers: " + max);

        var maxPoints = Utils.max(new User(56), new User(23));
        System.out.println(maxPoints);

        /* Calling multiple type parameter of Generic method*/
        Utils.print(1,60);

        NumbersCalculation numbersCalculation = new NumbersCalculation();
	    numbersCalculation.getOption();

         int principal = (int) Console.readNumber("Principal($1K-1M): ", 1_000, 1_000_000);
         float annualInterestRate = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
         byte years = (byte) Console.readNumber("Period (Years) : ", 1, 30);

         var calculator = new MortgageCalculator(principal,annualInterestRate,years);

         var report = new MortgageReport(calculator);
         report.printMortgage();
         report.printPaymentSchedule();

    }

}
