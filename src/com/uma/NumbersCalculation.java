package com.uma;


import java.util.Scanner;

public class NumbersCalculation {
    int num1;
    int num2;
    int sum;
    String answer;

    Scanner scanner = new Scanner(System.in);

    public NumbersCalculation(){
        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        answer = null;
    }

    public void getTwoNumbers(){
        System.out.print("Please enter a first number:");
        num1 = scanner.nextInt();
        System.out.print("Please enter a second number:");
        num2 = scanner.nextInt();
    }

    public void getOption(){
        do{
                System.out.println("Please choose the following option to calculate your numbers:");
                System.out.println("*************************************************************");
                System.out.println("1 for Add");
                System.out.println("2 for Subtract");
                System.out.println("3 for Multiply");
                System.out.println("4 for Division");
                System.out.println("5 for Exit Calculation");
                System.out.println("==============================================================");
                System.out.print("Enter your choice:");
                int calculateOption = scanner.nextInt();
            switch (calculateOption) {
                case 1 -> {
                    getTwoNumbers();
                    addTwoNumbers();
                }
                case 2 -> {
                    getTwoNumbers();
                    subtractNumber();
                }
                case 3 -> {
                    getTwoNumbers();
                    multiplyNumbers();
                }
                case 4 -> {
                    getTwoNumbers();
                    divisionNumbers();
                }
                default -> System.out.println("Wrong choice");
            }
            System.out.println("Do you want to continue calculation? " + "Y/N: ");
            answer = scanner.next();
        }while(answer.equals("Y") || answer.equals("y"));
    }

    public void addTwoNumbers() {
        sum = num1 + num2;
        System.out.println("The sum of the two number is:" + sum);
    }

    public void subtractNumber(){
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
        sum = num1 * num2;
        System.out.println("The multiplication of the two numbers is:" + sum);
    }

    public void divisionNumbers(){
        if(num1 > num2) {
            sum = num1 / num2;
            System.out.println("The division of the two numbers is:" + sum);
        }
        else
            System.out.println("Please enter the first number greater than the second number");
    }

}
