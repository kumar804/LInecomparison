package com.manish;

import java.util.Scanner;

public class LIneComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to LineComparison");
        //Taking user input for line UC1
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of frist line");
        System.out.println("Enter value of x1:-");
        int x1= sc.nextInt();
        System.out.println("Enter value of y1:-");
        int y1= sc.nextInt();
        System.out.println("Enter value of x2:-");
        int x2= sc.nextInt();
        System.out.println("Enter value of y2:-");
        int y2= sc.nextInt();

        System.out.println("Enter the value for second line");
        System.out.println("Enter value of m1:-");
        double m1= sc.nextInt();
        System.out.println("Enter value of n1:-");
        double n1= sc.nextInt();
        System.out.println("Enter value of m2:-");
        double m2= sc.nextInt();
        System.out.println("Enter value of n2:-");
        double n2= sc.nextInt();


        double length1 = Math.sqrt((Math.pow((x2-x1),2)) + (Math.pow((y2-y1),2)));
        System.out.println("The Length of Line 1 is:-" + length1);

        double length2 = Math.sqrt((Math.pow((m2-m1),2)) + (Math.pow((n2-n1),2)));
        System.out.println("The Length of Line 2 is:-" + length2);

        if (length2 == length1)
            System.out.println("The 2 Lines are Equal!!");
        else
            System.out.println("The 2 Lines are Not Equal!!");


    }
    }



