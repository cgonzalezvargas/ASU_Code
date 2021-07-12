package edu.asu.cse110.week2;

/*---------------------------------------------------------------------------------------------------------------------
//AUTHOR: Christian J Gonzalez
//Filename:lab01.java
//Specification: Takes average of user input and outputs average of a variable
//For: CSE 110-LAB #1
//Time Spent: 180 Minutes
//-------------------------------------------------------------------------------------*/


import java.util.Scanner;
public class lab01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //declare variables
        int test1, test2, test3;
        final double PI = 3.14159;
        final int NUM_TESTS = 3;
        double test_average;
        double test_averagesim;



        System.out.print("Enter the score on the first test:"); //prompt #1
        test1 = in.nextInt(); //read in the next integer

        System.out.print("Enter the score on the second test:"); //prompt #2
        test2 = in.nextInt(); //read in the next integer

        System.out.print("Enter the score on the third test:"); //prompt #3
        test3 = in.nextInt(); //read in the next integer

        test_average = (test1 + test2 + test3) / (double) NUM_TESTS;
        test_averagesim = test_average;



        System.out.println("Based on the test scores:"  +test1 + "," + test2 + "&" + test3 + " " + "your average score is:" + test_averagesim);




    }
}
