package edu.asu.cse110.week7;

/*-------------------------------------------------------------
// AUTHOR: Christian J. Gonzalez Vargas Student ID# 1218551828
// CONTACT: cjgonz21@asu.edu & c.gonzalez@encetech.org
// FILENAME: Lab6.java
// SPECIFICATION: Program that uses arrays to store information
// FOR: CSE 110 - Lab#06
// TIME SPENT: 190 Minutes
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab06
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in).useDelimiter("\\s");
        int i = 0; //counter
        int counterVar = 1;
        int answerVar1 = 0;
        double answerVar2 = 0;
        int numStudents = -1;
        int[] studentGroups = null; //arrays are objects
        double [] studentGrades = null;
        int numGroups = -1; // Part 2

        System.out.println("How many students do you have?");
        numStudents = scan.nextInt();


        studentGroups =  new int[numStudents];
        studentGrades = new double[numStudents];

        for (i = 0; i < numStudents; i++)
        {
            System.out.println("[Group #] and [Grade] for Entry " + counterVar);
            answerVar1 = scan.nextInt();
            answerVar2 = scan.nextInt();

            studentGroups[i] = answerVar1;
            studentGrades[i] = answerVar2;

            counterVar++;

        }
        System.out.println("====List of student Records====");
        for (i = 0; i < numStudents; i++)
        {
            System.out.println("Group " + studentGroups[i] + " - " + studentGrades[i] + " Points");
        }
        scan.close();









    }
}
