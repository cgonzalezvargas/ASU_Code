package edu.asu.cse110.week7;

/*-------------------------------------------------------------
// CSE 110     : Class # 75326
// ASSIGNMENT  : Assignment #05
// AUTHOR      : Christian J. Gonzalez Vargas Student ID# 1218551828
// DESCRIPTION : Program that demonstrates the function of methods
// CONTACT     : cjgonz21@asu.edu & c.gonzalez@encetech.org
// FILENAME    : Assignment05.java
// TIME SPENT  : 180 Minutes
//-----------------------------------------------------------*/

//Import methods for use

public class Assignment05 {

    public static void main(String[] args) {

        // function calls for test methods below
        displayGreeting();
        displayText("Jesus is good");
        printTotal(0, 1, 3);
        int total = getTotal(1, 2, 3);
        System.out.println(total);
        double average = getAverage(1, 2, 3);
        System.out.println(average);
        average = averageLength("ab", "a", "abc");
        System.out.println(average);
        int shortest = lengthOfShortest("monday", "thursday");
        System.out.println(shortest);
        String stars = stringOfStars("abc");
        System.out.println(stars);
        stars = maxStringOfStars("september", "january");
        System.out.println(stars);
        stars = midStringOfStars("ab", "abc", "a");
        System.out.println(stars);
    }

    // method 1 displays greeting upon call
    static void displayGreeting()
    {
        System.out.println("Hello, and welcome!");
    }

    // method 2 displays string argument passed to it
    static void displayText(String text)
    {
        System.out.println(text);
    }

    // method 3 displays total of 3 int arguments
    static void printTotal(int a, int b, int c)
    {
        System.out.println(a + b + c);
    }

    // method 4 returns the sum of 3 int arguments
    static int getTotal(int a, int b, int c)
    {
        return a + b + c;
    }

    // method 5 returns the average of 3 arguments passed to it
    static double getAverage(int a, int b, int c)
    {
        return (a + b + c) / 3.0;
    }

    // method 6 displays the average length of strings passed to it
    static double averageLength(String a, String b, String c)
    {
        return (a.length() + b.length() + c.length()) / 3.0;
    }

    // method 7 will return the length of the shortest string passed to it
    static int lengthOfShortest(String a, String b)
    {
        if (a.length() < b.length())
        {
            return a.length();
        }
        else
        {
            return b.length();
        }
    }

    // method 8 returns the length of argument as string of stars
    static String stringOfStars(String a)
    {
        String output = "";
        for (int i = 0; i < a.length(); i++)
        {
            output = output + "*";
        }
        return output;
    }

    // method 9 return a string of asterisks for longest string
    static String maxStringOfStars(String a, String b)
    {
        int maxLength = a.length();
        if (b.length() > maxLength)
        {
            maxLength = b.length();
        }
        String output = "";
        for (int i = 0; i < maxLength; i++)
        {
            output = output + "*";
        }
        return output;
    }

    // method 10 return a string of asterisks
    static String midStringOfStars(String a, String b, String c)
    {
        int midLength = 0;
        if (a.length() > b.length())
        {
            if (b.length() > c.length())
                midLength = b.length();
            else midLength = Math.min(a.length(), c.length());
        }
        else
        {
            if (a.length() > c.length())
                midLength = a.length();
            else midLength = Math.min(b.length(), c.length());
        }
        String output = "";
        for (int i = 0; i < midLength; i++)
        {
            output = output + "*";
        }
        return output;
    }
}
