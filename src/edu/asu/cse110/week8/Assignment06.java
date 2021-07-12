package edu.asu.cse110.week8;

/*-------------------------------------------------------------
// CSE 110     : Class # 75326
// ASSIGNMENT  : Assignment #06
// AUTHOR      : Christian J. Gonzalez Vargas Student ID# 1218551828
// DESCRIPTION : Program that uses methods to modify array and array values
// CONTACT     : cjgonz21@asu.edu & c.gonzalez@encetech.org
// FILENAME    : Assignment06.java
// TIME SPENT  : 240 Minutes
//-----------------------------------------------------------*/

//Import methods for use
//These were here for old ways to test these methods
import java.util.Scanner;


public class Assignment06
{

    //method 1 takes two arguments from arrays and prints them
    public static void printArray(int[] a,String s)
    {
        for(int i = 0 ;i < a.length; i++)
        {
            if(i != a.length-1)
            {
                System.out.print(a[i]+s);
            }
            else
            {
                System.out.print(a[i]);
            }
        }
    }

    //method 2 takes array of int as argument and returns value of the first element
    public static int getFirst(int[] a)
    {
        return a[0];
    }

    //method 3 takes array of int as argument and returns the last element value
    public static int getLast(int[] a)
    {
        return a[a.length-1];
    }

    //method 4 takes an array of int as argument and returns a new array without the first element in argument
    public static int[] getAllButFirst(int[] a)
    {
        int[] ret = new int[a.length-1];
        for(int i = 1; i < a.length; i++)
        {
            ret[i-1] = a[i];
        }
        return ret;
    }

    //method 5 takes array of int as argument and returns the index of the least value
    public static int getIndexOfMin(int[] a)
    {
        int min = a[0];
        int ind = 0;
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] < min)
            {
                min = a[i];
                ind = i;
            }
        }
        return ind;
    }

    //method 6 takes array of int as argument and returns the index of largest value
    public static int getIndexOfMax(int[] a)
    {
        int max = a[0];
        int ind = 0;
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] > max)
            {
                max = a[i];
                ind = i;
            }
        }
        return ind;
    }

    //method 7 takes 3 arguments, array of int, int indexes 2nd and 3rd will swap values at the given index
    public static int[] swapByIndex(int[] a, int m, int n)
    {
        int temp = a[m];
        a[m] = a[n];
        a[n] = temp;
        return a;

    }

    //method 8 takes two arguments, one array of int and int index will return all values except value of index arg
    public static int[] removeAtIndex(int[] a, int m)
    {
        int[] ret = new int[a.length-1];
        int ind = 0;
        for(int i = 0; i < a.length; i++)
        {

            if(i != m)
            {
                ret[ind] = a[i];
                ind++;
            }
            else
            {
            }
        }
        return ret;
    }

    //method 9 takes 3 arguments, array of int, int index, int value returns new array with new value of arg
    public static int[] insertAtIndex(int[] a,int m,int n)
    {
        int[] ret = new int[a.length+1];
        for(int i = 0; i < a.length+1; i++)
        {
            if(i < m)
            {
                ret[i] = a[i];
            }
            else if(i==m)
            {
                ret[i] = n;
            }
            else if(i > m)
            {
                ret[i] = a[i-1];
            }

        }
        return ret;
    }

    //method 10 takes array of int as arg will return boolean value true if elements are sorted via ascending else false
    public static boolean isSorted(int[] a)
    {
        for(int i = 0; i < a.length-1; i++)
        {
            if(a[i] > a[i+1])
            {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args)
    {
        int[] a = new int[]{1,2,3,4};

        System.out.println("Print array");
        printArray(a," - ");

        System.out.println("\n\nGet First");
        System.out.println(getFirst(a));

        System.out.println("\nGet Last");
        System.out.println(getLast(a));

        System.out.println("\nGet all but not first");
        System.out.println(getAllButFirst(a)[0]);

        System.out.println("\nGet index of minimum");
        System.out.println(getIndexOfMin(a));

        System.out.println("\nGet index of maximum");
        System.out.println(getIndexOfMax(a));

        System.out.println("\nSwap Index");
        int ret[] = swapByIndex(a, 1, 2);
        for( int i: ret)
        {
            System.out.println(i);
        }

        System.out.println("\nRemove at index");
        ret=removeAtIndex(a, 1);
        for( int i: ret)
        {
            System.out.println(i);
        }

        System.out.println("\nInsert at Index");
        ret=insertAtIndex(a, 1,77);
        for( int i: ret)
        {
            System.out.println(i);
        }

        System.out.println("\nIs Sorted");
        System.out.println(isSorted(a));
    }



}
