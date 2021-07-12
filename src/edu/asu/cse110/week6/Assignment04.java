package edu.asu.cse110.week6;

/*-------------------------------------------------------------
// CSE 110     : Class # 75326
// ASSIGNMENT  : Assignment #04
// AUTHOR      : Christian J. Gonzalez Vargas Student ID# 1218551828
// DESCRIPTION : Program that creates random numbers and compares to input
// CONTACT     : cjgonz21@asu.edu & c.gonzalez@encetech.org
// FILENAME    : Assignment04.java
// TIME SPENT  : 180 Minutes
//-----------------------------------------------------------*/

//Import methods for use

import java.util.Scanner;
import java.util.Random;

public class Assignment04
{
    public static void main(String[] args)
    {
        //Public variables for program use
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        //Main variables
        String numSecret = "";

        //Variables for use with program output

        int inNum;
        int ouNum;

        //Counters for the program

        int i = 1;

        int e; //for loop

        int o; //for loop

        int x; //for counter to set up secret number

        int tryCounter = 0;

        int guessedCounter = 0;

        int victoryCounter = 0;


        //Decision variables
        boolean yes = true;
        boolean no = false;
        String inAnswer;

        //Primary Loop structure after this comment

        do
        {
            numSecret = "";
            System.out.println("----------MASTERMIND----------");
            System.out.println("Guess the 4 digit number!");

            //Set the initial game parameters
            for (x = 0; x < 4; x++)
            {
                numSecret+= (generator.nextInt(9-0)+1);
            }
            do
            {
                System.out.print("Guess " + i +": ");
                //Delete comment to track problems with num generator System.out.println(numSecret);
                guessedCounter = 0;
                inAnswer = scan.nextLine();

                for (o = 0; o < inAnswer.length(); o++)
                {
                    if (inAnswer.charAt(o) == numSecret.charAt(o))
                    {
                        guessedCounter++;
                    }

                }
                System.out.println("You matched " + guessedCounter);
                i++;
                tryCounter++;
                //Calculates the guessed matches

            }
            while(guessedCounter<4);
            //
            System.out.println("Congratulations! You guessed the right number in " + tryCounter + " guesses.");
            System.out.println("Would you like to play again (yes/no)?");
            inAnswer = scan.nextLine();
            if(inAnswer.equals("yes"))
            {
                victoryCounter = 0;
                tryCounter = 0;
                i = 1;
            }
            else
            {
                victoryCounter = 1;
                scan.close();
            }

        }
        while(victoryCounter<1);
    }
}
