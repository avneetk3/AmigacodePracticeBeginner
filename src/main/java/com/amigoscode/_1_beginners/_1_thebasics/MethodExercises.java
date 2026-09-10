package com.amigoscode._1_beginners._1_thebasics;

import java.util.Scanner;

/**
 * Exercise: Methods
 *
 * Learn how to define and call methods in Java.
 * Methods allow you to organize code into reusable blocks, each performing a specific task.
 */
public class MethodExercises {

    // TODO: 1 - Create a method called greet that takes a String parameter 'name'
    // and prints "Hello, {name}!"
    // Hint: public static void greet(String name) { ... }
    public static void greet(String name)
    {
        System.out.println("Hello"+name);
    }


    // TODO: 2 - Create a method called add that takes two int parameters (a, b)
    // and returns their sum
    // Hint: public static int add(int a, int b) { ... }
    public static int sum(int a , int b)
    {
        return (a+b);
    }


    // TODO: 3 - Create a method called isEven that takes an int parameter 'number'
    // and returns true if the number is even, false otherwise
    // Hint: Use the modulus operator (%)
    public static boolean isEven (int num)
    {
        return num % 2 == 0;
    }


    // TODO: 4 - Create a method called max that takes two int parameters (a, b)
    // and returns the larger of the two
    // Hint: Use an if statement or the ternary operator
    public static int maxNum(int a, int b)
    {
        return (a>b)?a:b;
    }



    // TODO: 5 - Create a method called factorial that takes an int parameter 'n'
    // and returns n! (n factorial) using a loop
    // Hint: 5! = 5 * 4 * 3 * 2 * 1 = 120. Use a long return type for larger values.
    public static int fact(int num) {
        int factorial = 1;
        if (num == 0 || num == 1)
            return factorial;
        else {
            while (num >1)
            {
            factorial *= num;
            num--;
            }
            return factorial;
        }
    }




    // TODO: 6 - Create two overloaded methods called multiply:
    //   - One that takes 2 int parameters and returns their product
    //   - One that takes 3 int parameters and returns their product
    // Overloading means having multiple methods with the same name but different parameters.
    public static long multiply (int a , int b )
    {
        return (a*b);
    }

    public static long multiply (int a , int b, int c  )
    {
        return (a*b*c);
    }

    public static void main(String[] args) {

        // TODO: 7 - Call all the methods above and print their results
        // - Call greet with your name
        // - Call add with two numbers and print the result
        // - Call isEven with a number and print whether it is even
        // - Call max with two numbers and print the larger one
        // - Call factorial with 5 and print the result
        // - Call both multiply methods and print their results
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        greet(name);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c ;
        c = sum(a,b);
        System.out.printf("\n The sum of numbers %d, %d is %d", a,b,c);
        boolean ans =  isEven (a);
        System.out.printf("\n The is number %d even? %b", a, ans);
        c =maxNum( a,  b);
        System.out.printf("\n Max of  %d, %d is %d", a,b,c);
        c =fact(b);
        System.out.printf("\n Factorial of number  %d,  is %d", b,c);
        long d =multiply(a,b);
        System.out.printf("\n The product  of numbers %d, %d is %d", a,b,d);
        d = multiply(a,b,c);
        System.out.printf("\n The product  of numbers %d, %d is %d", a,b,d);








    }
}
