package edu.asu.cse205.project1;

/*********************************************************************************************************
 * CLASS: Main (Main.java)
 *
 * DESCRIPTION
 * Main class for Project 1
 *
 * COURSE AND PROJECT INFORMATION
 * CSE205 Object Oriented Programming and Data Structures, Spring 2021
 * Project Number: project-number #2
 *
 * GROUP INFORMATION
 * AUTHOR 1: Christian J Gonzalez, cjgonz21, cjgonz21@asu.edu
 * AUTHOR 2: Timothy Cash, tjcash, tjcash@asu.edu
 ********************************************************************************************************/

import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;
// define the class
public class Main
{
    // define the main() method.
    public static void main(String[] args) throws FileNotFoundException
    {
        // create an object for the class Main
        Main mainObject = new Main();
        // call the run () method using the class object.
        mainObject.run();
    }
    // definition of the method run()
    private void run() throws FileNotFoundException
    {
        // declare string variables.
        final String UP = "RunsUp";
        final String DOWN = "RunsDown";

        //this line of code has to be made more efficient as well
        // create an array list and read the input file into the array list calling method inputFileToList()
        ArrayList<Integer> list = inFileToList("C:\\Users\\cgonz\\IdeaProjects\\group-KK-p1\\src\\p1-in.txt");

        // cDeclare and create an ArrayList of Integers named listRunsUpCount, listRunsDnCount & listRunsCount
        ArrayList<Integer> listRunsUpCount = new ArrayList<>();
        ArrayList<Integer> listRunsDnCount = new ArrayList<>();
        ArrayList<Integer> listRunsCount = new ArrayList<>();

        // call the findRuns() method by passing the list and UP and assign to the list ListRunsUpCount
        // call the findRuns() method by passing the list and DOWN and assign to the list ListRunsDnCount
        listRunsUpCount = findRuns(list, UP);
        listRunsDnCount = findRuns(list, DOWN);
        listRunsCount = merge(listRunsUpCount, listRunsDnCount);

        //have to make this line of code more efficient to reflect openinig location
        output("C:\\Users\\cgonz\\IdeaProjects\\group-KK-p1\\src\\p1-runs.txt", listRunsCount);
        //END of main()method
    }

    /**
     * This method creates an ArrayList object.
     */
    public static ArrayList<Integer> arrayListCreate(int pSize, int pInitValue)
    {
        //Create an Array List
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < pSize; i++)
        {
            list.add(pInitValue);
        }
        //return the ArrayList
        return list;
    }//END of the method

    /**
     * This method reads a file and puts integers into an ArrayList object.
     */
    public static ArrayList<Integer> inFileToList(String fileToParse) throws FileNotFoundException
    {
        //Create an Array list
        ArrayList<Integer> listOfIntegers = new ArrayList<>();
        File fileInput = new File(fileToParse);
        Scanner scan = new Scanner(fileInput);
        while (scan.hasNextInt())
        {
            listOfIntegers.add(scan.nextInt());
        }
        //return ListOfInegers
        scan.close();
        return listOfIntegers;
    }//END of the method

    /**
     * This method calculates runs up and runs down.
     */
    public static ArrayList<Integer> findRuns(ArrayList<Integer> pList, String pDir)
    {
        //Create an Array list
        ArrayList<Integer> listRunsCount = arrayListCreate(pList.size(), 0);
        int numIndexK;
        int i = 0;
        int k = 0;
        //Run While loop until correct size
        while (i < pList.size() - 1)
        {
            if (pDir.equals("RunsUp") && pList.get(i) <= pList.get(i + 1))
            {
                k++;
            } else if (pDir.equals("RunsDown") && pList.get(i) >= pList.get(i + 1))
            {
                k++;
            } else {
                if (k != 0)
                {
                    numIndexK = listRunsCount.get(k);
                    listRunsCount.set(k, numIndexK + 1);
                    k = 0;
                }//END if
            }//END if
            i++;
        }//END WHILE
        if (k != 0)
        {
            numIndexK = listRunsCount.get(k);
            listRunsCount.set(k, numIndexK + 1);
            k = 0;
        }
        //Return listRunsCount
        return listRunsCount;
    }//END method findRuns

    /**
     * This method merges the runs up and runs down arrays.
     */
    public static ArrayList<Integer> merge(ArrayList<Integer> pListRunsUpCount, ArrayList<Integer> pListRunsDnCount)
    {
        //Create an Array list
        ArrayList<Integer> upDownMerge = arrayListCreate(pListRunsUpCount.size(), 0);
        for (int i = 0; i < pListRunsUpCount.size() - 1; i++)
        {
            int sum = pListRunsUpCount.get(i) + pListRunsDnCount.get(i);
            upDownMerge.set(i, sum);
        }
        return upDownMerge;
    }//END of Method merge

    /**
     * This method creates an output file containing the runs data.
     */
    public static void output(String pFileName, ArrayList<Integer> pListRuns)
    {

        try
        {

            File outputFile = new File(pFileName);
            PrintWriter output = new PrintWriter(outputFile);
            int sumPListRuns = 0;
            for (int i = 0; i < pListRuns.size(); i++)
            {
                sumPListRuns += pListRuns.get(i);
            }
            output.println("runs_total, " + sumPListRuns + "\n");
            for (int k = 1; k < pListRuns.size(); k++)
            {
                output.println("runs_" + k + ", " + pListRuns.get(k));
            }
            output.close();
        } catch (FileNotFoundException x)
        {
            x.printStackTrace();
        }

    }//END Method output
}
