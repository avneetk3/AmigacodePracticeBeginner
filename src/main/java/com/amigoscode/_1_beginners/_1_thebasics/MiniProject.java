package com.amigoscode._1_beginners._1_thebasics;

import java.util.Scanner;

/**
 * Mini Project: Simple Calculator
 *
 * Put together everything you have learned so far to build a simple calculator.
 * The calculator should display a menu, read the user's choice and two numbers,
 * perform the chosen operation, and print the result.
 */
public class MiniProject {

    public static void main(String[] args) {

        // TODO: 1 - Create a Scanner for user input
        Scanner sc = new Scanner(System.in);


        // TODO: 2 - Display a menu with the following options:
        // Print:
        //   "=== Simple Calculator ==="
        //   "1. Add"
        //   "2. Subtract"
        //   "3. Multiply"
        //   "4. Divide"
        //   "Choose an operation (1-4): "
        System.out.println("=== Simple Calculator ===" + "\n 1. Add\"\n" + "2. Subtract \n" +"3. Multiply \n" +
                "   4. Divide \n" +"Choose an operation (1-4): ");

        // TODO: 3 - Read the user's choice into an int variable
        int choice ;
        System.out.println("Enter number 1");
        int num1 = sc.nextInt();

        System.out.println("Enter number 2");
        int num2 = sc.nextInt();

        System.out.println("Enter your choice");
        choice = sc.nextInt();

        switch (choice){
        case 1: case 2:  case 3:  case 4:  break;
        default : System.out.println("Wrong choice ");
        break;
        }
        int answer = switch(choice) {
            case 1 -> num1 + num2;
            case 2 -> num1 - num2;
            case 3 -> num1 * num2;
            case 4 -> {
                if (num2 ==0){
                    throw new ArithmeticException ("Cannot divide by zero");
                }
                yield num1 / num2;
            }

            default -> throw new IllegalStateException("Unexpected value: " + choice);
        };
        System.out.println("The result is "+answer);

        // TODO: 4 - Prompt and read two double numbers from the user
        // Print "Enter first number: " and read it.
        // Print "Enter second number: " and read it.


        // TODO: 5 - Use a switch statement to perform the chosen operation and print the result
        // Case 1: Print "Result: " + (num1 + num2)
        // Case 2: Print "Result: " + (num1 - num2)
        // Case 3: Print "Result: " + (num1 * num2)
        // Case 4: Perform division (but handle division by zero first - see TODO 6)
        // Default: Print "Invalid choice"


        // TODO: 6 - Inside case 4, handle division by zero with an if statement
        // If the second number is 0, print "Error: Cannot divide by zero"
        // Otherwise, print the result of the division

    }
}
