package edu.asu.cse110.week3;

/*-------------------------------------------------------------
// AUTHOR: Christian J. Gonzalez Vargas Student ID# 1218551828
// CONTACT: cjgonz21@asu.edu & c.gonzalez@encetech.org
// FILENAME: Assignment01.java
// SPECIFICATION: Program that relies on the user input of 4 variables to compute output
// FOR: CSE 110 - Assignment #01
// TIME SPENT: 180 Minutes
//-----------------------------------------------------------*/

//Import external object Scanner
import java.util.Scanner;

//Declaring the public class used with matching filename
public class Assignment01
{
    //Declare the main method of the program

    public static void main(String[] args)
    {

        //Declare variables used in this class & method

        //Variable naming convention for user inputs are lowercase pizza followed by uppercase input
        int pizzaAmount;
        int pizzaSlices;
        int pizzaAdults;
        int pizzaChild;

        //Variables used for output values
        int totalPizza;
        int totalAdPizza;
        int totalChPizza;
        int childSlicesPer;
        int totalLeftOver;

        //Declare the use of Scanner that was previously imported

        Scanner scan = new Scanner(System.in);

        //*--------------------------------------------------------------------------------------
        //                              MAIN LOGIC OF THE PROGRAM HERE
        //                                              |
        //                                              v
        //--------------------------------------------------------------------------------------*/

        //Defined below is the statements used to gather user input

        System.out.println("Please enter the number of pizzas purchased:");
        pizzaAmount = scan.nextInt();

        System.out.println("Please enter the number of slices per pizza:");
        pizzaSlices = scan.nextInt();

        System.out.println("Please enter the number of adults present for the Pizza Party:");
        pizzaAdults = scan.nextInt();

        System.out.println("Please enter the number of children present for the Pizza Party:");
        pizzaChild = scan.nextInt();

        //From this part onwards this is the logic of the computation based on user input

        //Calculate the amount of slices total based on the amount of pizza * slice
        totalPizza = pizzaAmount * pizzaSlices;

        //Calculate the amount of slices for adults
        totalAdPizza = pizzaAdults * 2;

        //Calculate the amount of pizza slices available for kids
        totalChPizza = totalPizza - totalAdPizza;

        //Calculate the amount of slices per child
        childSlicesPer = totalChPizza/pizzaChild;

        /*Calculate the amount of pizza leftover by adding the amount of slices for adults by the product of
        //slices of pizza by the amount of children less the total of slices gets the amount leftover*/
        totalLeftOver = totalPizza - (totalAdPizza + (childSlicesPer * pizzaChild));

        //PROGRAM OUTPUT BELOW

        System.out.println("Total number of slices of pizza                   :" + " " + totalPizza);

        System.out.println("Total number of slices given to adults            :" + " " + totalAdPizza);

        System.out.println("Total number of slices available for children     :" + " " + totalChPizza);

        System.out.println("Number of slices each child will get              :" + " " + childSlicesPer);

        System.out.println("Number of slices left over                        :" + " " + totalLeftOver);
















    }

}
