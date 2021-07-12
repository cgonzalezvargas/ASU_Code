package edu.asu.cse110.week6;

/*-------------------------------------------------------------
// AUTHOR: Christian J. Gonzalez Vargas Student ID# 1218551828
// CONTACT: cjgonz21@asu.edu & c.gonzalez@encetech.org
// FILENAME: Lab5.java
// SPECIFICATION: Program that outputs unicode symbols based on user input
// FOR: CSE 110 - Lab#05
// TIME SPENT: 190 Minutes
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab05
{
    public static void main(String [] args)
    {
        final char SIDE_SYMB ='-';
        final char MID_SYMB = '*';
        Scanner scan = new Scanner(System.in);
        String inputStr = "";
        char choice = ' ';
        int numSymbols = -1, sideWidth = -1, midWidth =-1;

        do
        {
            displayMenu();
            inputStr = scan.nextLine();
            if (inputStr.length() > 0)
            {
                choice = inputStr.charAt(0);
            }
            else
            {
                choice = ' ';
            }
            switch (choice)
            {
                case 'r':
                    System.out.println("Width of the sides?");
                    sideWidth = scan.nextInt();
                    System.out.println("Width of the middle?");
                    midWidth = scan.nextInt();
                    scan.nextLine();  // Flush junk newline symbols

                    System.out.println();
                    System.out.println(buildRow(
                            SIDE_SYMB, sideWidth, MID_SYMB, midWidth
                    ));
                    break;

                case 'p':
                    System.out.println("Number of symbols on the lowest layer?");
                    numSymbols = scan.nextInt();
                    scan.nextLine();  // Flush junk newline symbols

                    System.out.println();
                    System.out.println(buildPyramid(SIDE_SYMB, MID_SYMB, numSymbols));

                    break;

                case 'd':
                    System.out.println("Number of symbols on the middle layer?");
                    numSymbols = scan.nextInt();
                    scan.nextLine();  // Flush junk newline symbols

                    System.out.println();
                    System.out.println(buildDiamond('*',' ', numSymbols));

                    break;

                case 'q':
                    System.out.println("Bye");

                    break;

                default:
                    System.out.println("Please choose a valid option from the menu.");

                    break;


            }
            System.out.println();


        }
        while (choice !='q');
        scan.close();
        /**
         * Build a row of symbols (pattern) with the given parameters.
         *
         * For example, -----*****----- can be built by the parameters
         *
         * sideWidth = 5, midWidth = 5, sideSymb = '-', midSymb = '*'
         *
         * @param sideSymb  A char to be repeated on both sides
         * @param sideWidth Number of symbols on each side
         * @param midSymb   A char to be repeated in the middle
         * @param midWidth  Number of symbols in the middle
         * @return          A String of a row of the designed pattern
         */

    }
    private static String buildRow(
            char sideSymb, int sideWidth, char midSymb, int midWidth)
    {
        String result = "";
        for (int i = 0; i < sideWidth; i++)
        {
            result += sideSymb;
        }
        for (int i = 0; i < midWidth; i++)
        {
            result += midSymb;
        }
        for (int i = 0; i < sideWidth; i++)
        {
            result += sideSymb;
        }

        return result;
    } //End of buildRow

    /**
     * Build a pyramid pattern with the given parameters.
     *
     * For example, the following pattern
     *
     *  -----*-----
     *  ----***----
     *  ---*****---
     *  --*******--
     *  -*********-
     *  ***********
     *
     * can be built by sideSymb = '-', midSymb = '*', numSymbols = 11
     *
     * When ptnHeight is not an odd integer, replace it by the closest
     * even integer below. For example, if numSymbols is 10, use 9 instead.
     *
     * When ptnHeight is 0, return an empty String.
     *
     * @param sideSymb   A char to be repeated on both sides
     * @param midSymb    A char to be repeated in the middle
     * @param numSymbols The number of symbols on the lowest layer
     * @return            A String of the pyramid pattern.
     */

    private static String buildPyramid(
            char sideSymb, char midSymb, int numSymbols)
    {
        String result = "";

        int totalSymbOneRow = numSymbols;

        for (int numStars =1; numStars <= numSymbols; numStars += 2)
        {
            int numDashed = (totalSymbOneRow - numStars) / 2;
            String row = buildRow(sideSymb, numDashed, midSymb, numStars);
            result += row + "\n";
        }
        return result;
    }

    /**
     * Build a diamond pattern. The parameters are the same
     * as {@link #buildPyramid(char, char, int)}.
     *
     * @param  sideSymb  A char to be repeated on both sides
     * @param  midSymb   A char to be repeated in the middle
     * @param  numSymbols The height of a pyramid
     * @return           A String of the inverted diamond pattern.
     */

    private static String buildDiamond(
            char sideSymb, char midSymb, int numSymbols)
    {
        String result = "";
        int totalSymbOneRow = numSymbols;

        for (int numStars = 1; numStars <= numSymbols; numStars += 2)
        {
            int numDashed = (totalSymbOneRow - numStars) / 2;
            String row = buildRow(sideSymb, numDashed, midSymb, numStars);
            result += row + "\n";
        }
        for (int numStars = numSymbols; numStars >= 0; numStars -= 2)
        {
            int numDashed = (totalSymbOneRow - numStars) / 2;
            String row = buildRow(sideSymb, numDashed, midSymb, numStars);
            result += row + "\n";
        }
        return result;

    }

    /**
     * Display the menu
     */
    private static void displayMenu()
    {
        System.out.println("Please choose one pattern from the list:");
        System.out.println("r) Row");
        System.out.println("p) Pyramid");
        System.out.println("d) Shallow diamond");
        System.out.println("q) Quit");

    }
    //End displayMenu method


} //End of Public Class Lab5
