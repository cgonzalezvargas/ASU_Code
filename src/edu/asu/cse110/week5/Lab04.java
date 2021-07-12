package edu.asu.cse110.week5;

/*-------------------------------------------------------------
// AUTHOR: Christian J. Gonzalez Vargas Student ID# 1218551828
// CONTACT: cjgonz21@asu.edu & c.gonzalez@encetech.org
// FILENAME: Lab4.java
// SPECIFICATION: Program that uses a while loop to calculate values
// FOR: CSE 110 - Lab#04
// TIME SPENT: 185 Minutes
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab04
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        //Declare main variables for computation
        int counter = 0;
        int menuCount = 0;

        //Variables used in submenus

        //Variables for submenu 1
        int numberM = 0;
        int numberMV = 0;
        int numberMS = 1;
        //Variables for submenu 2
        int numberF = 0;
        int numberFS = 1;
        int numberFV = 1;
        //Variables for submenu 3
        int numberL = 0;
        int numberLS = 1;
        int numberLV = 1;
        //Constants used in the program

        do
        {
            //Display the menu
            //displayMenu(); find another way to do this menu
            System.out.println("===Please choose one option from the following menu:===");
            System.out.println("1) Calculate the sum of integers from 1 to m");
            System.out.println("2) Calculate the factorial of a given number");
            System.out.println("3) Display the leftmost digit of a given number");
            System.out.println("4) Quit");

            menuCount = scan.nextInt();

            if (menuCount <= 0 || menuCount > 4)
            {
                System.out.println("[ERR] Please select a valid value from the menu [0,4]");
                menuCount = scan.nextInt();
                counter = menuCount;
            }
            else
            {
                counter = menuCount;
            }
            //Ask the user for one option
            switch (counter)
            {
                case 1 -> {
                    System.out.println("Enter an integer to evaluate:");
                    numberM = scan.nextInt();
                    for (numberMS = 1; numberMS <= numberM; numberMS++) {
                        numberMV = numberMV + numberMS;
                    }
                    System.out.println("The sum of 1 to" + " " + numberM + " " + "is" + " " + numberMV);
                }
                case 2 -> {
                    System.out.println("Enter an integer to evaluate factorial:");
                    numberF = scan.nextInt();
                    for (numberFS = 1; numberFS <= numberF; numberFS++) {
                        numberFV = numberFV * numberFS;
                    }
                    System.out.println("The factorial of" + " " + numberF + " is " + numberFV);
                }
                case 3 -> {
                    System.out.println("Enter a number to evaluate [Find the leftmost digit]");
                    numberL = scan.nextInt();
                    if (numberL > 0) {
                        numberLV = Math.abs(numberL);
                        numberLS = (int) Math.floor(numberLV / Math.pow(10, Math.floor(Math.log10(numberLV))));
                        System.out.println("The leftmost digit of" + " " + numberL + " is " + numberLS);
                    } else {
                        System.out.println("[ERR] This number can't be zero enter a non-zero integer:");
                    }
                }
                case 4 -> System.out.println("Goodbye and thank you for using this program.");
            }


        }
        while (counter > 0 && counter < 4);
    }
}
