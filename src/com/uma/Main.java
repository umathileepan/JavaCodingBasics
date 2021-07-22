package com.uma;

//import com.uma.Generics.GenericList;
//import com.uma.Generics.List;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Hello World");

	    NumbersCalculation numbersCalculation = new NumbersCalculation();
	    numbersCalculation.getOption();

        /*var list = new GenericList<Integer>();
        list.add(5);
        list.add(10);*/

         int principal = (int) Console.readNumber("Principal($1K-1M): ", 1_000, 1_000_000);
         float annualInterestRate = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
         byte years = (byte) Console.readNumber("Period (Years) : ", 1, 30);

         var calculator = new MortgageCalculator(principal,annualInterestRate,years);

         var report = new MortgageReport(calculator);
         report.printMortgage();
         report.printPaymentSchedule();

    }

}
