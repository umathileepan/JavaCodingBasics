package com.uma;


import java.util.Scanner;

public class NumbersCalculation {
    int num1;
    int num2;
    int sum;

    Scanner scanner = new Scanner(System.in);

    public NumbersCalculation(){
        int num1 = 0;
        int num2 = 0;
        int sum = 0;
    }

    public void addTwoNumbers() {
        System.out.print("Please enter a first number:");
        num1 = scanner.nextInt();
        System.out.print("Please enter a second number:");
        num2 = scanner.nextInt();
        sum = num1 + num2;
        System.out.println("The sum of the two number is:" + sum);
    }

    public void subtractNumber(){
        System.out.print("Please enter a first number:");
        num1 = scanner.nextInt();
        System.out.print("Please enter a second number:");
        num2 = scanner.nextInt();
        if(num1>num2) {
            sum = num1 - num2;
            System.out.println("The difference of the two number is:" + sum);
        }
        else{
            sum = num2 - num1;
            System.out.println("The difference of the two number is:" + sum);
        }
    }

    public void multiplyNumbers(){
        System.out.print("Please enter a first number:");
        num1 = scanner.nextInt();
        System.out.print("Please enter a second number:");
        num2 = scanner.nextInt();
        sum = num1 * num2;
        System.out.println("The multiplication of the two numbers is:" + sum);
    }

    public void divisionNumbers(){
        System.out.print("Please enter a first number:");
        num1 = scanner.nextInt();
        System.out.print("Please enter a second number:");
        num2 = scanner.nextInt();
        if(num1 > num2) {
            sum = num1 / num2;
            System.out.println("The division of the two numbers is:" + sum);
        }
        else
            System.out.println("Please enter the first number greater than the second number");
    }

}
