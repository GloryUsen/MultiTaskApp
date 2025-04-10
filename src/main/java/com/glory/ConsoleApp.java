package com.glory;

import java.util.Scanner;

public class ConsoleApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int preference;


        do {
            System.out.println("\n=== MENU === ");
            System.out.println("1. Greet a user ");
            System.out.println("2. Calculate an employee's salary with bonus ");
            System.out.println("3. Check a number if it is a prime number ");
            System.out.println("4. Exit ");
            System.out.print("Enter Your Preference (1-4): ");
            preference = scan.nextInt();
            scan.nextLine();

            switch (preference){
                case 1:
                    System.out.println("Enter your name ");
                    String name = scan.nextLine();
                    System.out.println("Hello " + name + "!");
                    break;

                case 2:
                    System.out.println("Enter your salary: ");
                    int salary = scan.nextInt();
                    scan.nextLine();

                    int bonus = (salary > 10000) ? 2000 : 1000;
                    salary += bonus;
                    System.out.println("Your total salary with bonus is: " + salary);
                    break;

                case 3:
                    System.out.println("Enter a number to check if it is a prime number ");
                    int number = scan.nextInt();
                    scan.nextLine();
                    boolean isPrime = true;
                    if (number <= 1){
                        isPrime = false;

                    } else {
                        for (int i = 2; i <= number / 2; i++){
                            if (number % i == 0){
                                isPrime = false;

                            }
                        }
                    }

                    if (isPrime){
                        System.out.println(number + " is a prime number ");
                    } else {
                        System.out.println(number + " is not a prime number ");
                    }
                    break;

                case 4:
                    System.out.println("Exiting program. Goodbye! ");
                    break;

                default:
                    System.out.println("Invalid Preference. Please enter 1-4. ");
            }
        } while (preference != 4);

    }
}
