package edu.asu.cse110.week4;

/*-------------------------------------------------------------
// AUTHOR: Christian J. Gonzalez Vargas Student ID# 1218551828
// CONTACT: cjgonz21@asu.edu & c.gonzalez@encetech.org
// FILENAME: Lab3.java
// SPECIFICATION: Program that uses a while loop to calculate values
// FOR: CSE 110 - Lab#03
// TIME SPENT: 185 Minutes
//-----------------------------------------------------------*/

//import java utilities before class and main method
import java.util.Scanner;

//Define public class for this laboratory with matching filename

public class Lab03
{
    public static void main(String[] args)
    {
        //Declare the usage of scanner for the lab
        Scanner scan = new Scanner(System.in);

        //Declare three variables for HW, midterm and final exam grades
        int gradeHW = 0;
        int gradeMT = 0;
        int gradeFE = 0;


        //Declare a loop control variable i
        int i = 0;

        while(i < 4)
        {
            if (i == 0)
            {
                //Ask the user for homework grade input
                System.out.println("Enter your HOMEWORK grade:");
                gradeHW = scan.nextInt();

                //Input validation
                if (gradeHW < 0 || gradeHW > 100)
                {
                    System.out.println("[ERR] Invalid input. A Homework grade should be between [0,100]");
                }
                else
                {
                    //Update the loop variable
                    i++;

                }
            }
            else if (i == 1)
            {
                //Ask the user for midterm grade input
                System.out.println("Enter your MIDTERM EXAM grade:");
                gradeMT = scan.nextInt();

                //Input validation
                if (gradeMT < 0 || gradeMT > 100)
                {
                    System.out.println("[ERR] Invalid input. A midterm exam grade should be between [0,100]");

                }
                else
                {
                    //Update the loop variable
                    i++;

                }
            }
            else if (i == 2)
            {
                //Ask the user for final exam grade input
                System.out.println("Enter your FINAL EXAM grade:");
                gradeFE = scan.nextInt();

                //Input validation
                if(gradeFE < 0 || gradeFE > 200)
                {
                    System.out.println("[ERR] Invalid input. A final exam grade should be between [0,200]");
                }
                else
                {
                    //Update the loop variable
                    i++;
                }
            }
            else
            {
                //Calculations below
                double gradeFIN = gradeFE;
                double gradeMID = gradeMT;
                double gradeHOW = gradeHW;

                double weighted_total;

                weighted_total = (gradeFIN/200) * 50 + (gradeMID * .25) + (gradeHOW * .25);

                if (weighted_total >= 50)
                {
                    System.out.println("[INFO] Student's weighted total is" + " " + weighted_total);
                    System.out.println("[INFO] Student PASSED the class");
                    i++;
                }
                else
                {
                    System.out.println("[INFO] Student's weighted total is" + " " + weighted_total);
                    System.out.println("[INFO] Student FAILED the class");
                    i++;
                    scan.close();
                }

            }
        }
    }

}
