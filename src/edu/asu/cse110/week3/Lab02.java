package edu.asu.cse110.week3;

/*-------------------------------------------------------------
// AUTHOR: Christian J. Gonzalez Vargas Student ID# 1218551828
// FILENAME: Lab2.java
// SPECIFICATION: Manipulation and concatenation of strings
// FOR: CSE 110 - Lab #2
// TIME SPENT: 120 Minutes
//-----------------------------------------------------------*/

//import utilities outside of the public class

import java.util.Scanner;

//class name has to match the filename
public class Lab02
{
    //define the main method of the program
    public static void main(String[] args)
    {

        //declare used variables and types

        String firstName = " ";
        String lastName = " ";
        String fullName = " ";

        //Initialize the string comparison variables

        String title1 = " ";
        String title2 = " ";


        int nameLength = 0;

        Scanner scan = new Scanner(System.in);

        //Use Scanner to ask the user for first name input

        System.out.print("Please enter your first name:");
        firstName = scan.nextLine();

        //Use Scanner to ask the user for last name input

        System.out.print("Please enter your last name:");
        lastName = scan.nextLine();

        //Combines the user input to the needed output
        fullName = firstName + " " + lastName;

        //Calculates the length of the combined strings
        nameLength = fullName.length();

        //Prints the combined input as uppercase output
        System.out.print("Your full name (in capitals):" + " ");
        System.out.printf(fullName.toUpperCase());

        //Space between statements

        System.out.println("\n Length of your full name:" + nameLength);

        //Compare strings

        title1 = firstName;
        title2 = lastName;
        //Function to compare the input between firstName & lastName

        if (title1 == title2 ) {

            System.out.println("String comparison using \"==\" sign works");
        }
        else {

            System.out.println("String comparison using \"==\" sign does NOT work");
        }
        if ( title1.equals(title2)) {

            System.out.println("String comparison using \"equals\" method works");
        }
        else {

            System.out.println("String comparison using \"equals\" method does NOT work");
        }
    }



    //Add firstName to lastName variables using "+" sign and space
    //Store the result in fullName variable

    //Convert fullName variable to upper case

    //Find the length of fullName and store it

    //Print fullName, it should be in upper case

    //Print nameLength, this should be number of characters

    //Define two string variables, title1 and title2

    //Compare the two strings and print which one of the two ways work
}
