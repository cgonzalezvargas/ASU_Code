package edu.asu.cse110.week11;

/*-------------------------------------------------------------
// AUTHOR: Christian J. Gonzalez Vargas Student ID# 1218551828
// CONTACT: cjgonz21@asu.edu & c.gonzalez@encetech.org
// FILENAME: Lab7.java
// SPECIFICATION: Program that test variable scope
// FOR: CSE 110 - Lab#08
// TIME SPENT: 190 Minutes
//-----------------------------------------------------------*/

public class Student
{

    private String firstName, lastName, sFullName, sAsuID;

    private double sGrade;

    private int numOfUpdates, numOfAccessed;

    //Default Constructor

    public Student()

    {
        sGrade = -1;

        numOfAccessed = 0; // initialize values

        numOfUpdates = 0;
    }




    //Overloaded Constructor

    public Student(String sFullName, String sAsuID, double sGrade)

    {

        this.sFullName = sFullName;

        this.sAsuID = sAsuID;

        this.sGrade = sGrade;

    }

    public String toString()

    {

        return "[Name: " + sFullName + ", ASUID: " + sAsuID + ", Grade: " + String.format("%.2f",sGrade) +"]";

    }

    public String getFirstName()

    {
        numOfAccessed++;
        return firstName;

    }

    public void setFirstName(String firstName)

    {
        numOfUpdates++;
        this.firstName = firstName;

    }

    public String getLastName()

    {
        numOfAccessed++;
        return lastName;

    }

    public void setLastName(String lastName)

    {

        numOfUpdates++;
        this.lastName = lastName;

    }

    public String getFullname()

    {
        numOfAccessed++;

        return sFullName;

    }

    public void setName(String sFullName)

    {
        numOfUpdates++;
        this.sFullName = sFullName;

    }

    public String getAsuID()

    {
        setNumOfAccessed(numOfAccessed++);

        return sAsuID;

    }

    public void setId(String sAsuID)

    {
        numOfUpdates++;
        this.sAsuID = sAsuID;

    }

    public double getGrade()

    {
        numOfAccessed++;

        return sGrade;

    }

    public void setGrade(double sGrade)

    {
        numOfUpdates++;
        this.sGrade = sGrade;

    }

    public int getNumOfUpdates()

    {
        numOfAccessed++;

        return numOfUpdates;

    }

    public void setNumOfUpdates(int numOfUpdates)

    {

        this.numOfUpdates = numOfUpdates;

    }

    public int getNumOfAccessed()

    {
        numOfAccessed++;

        return numOfAccessed;

    }

    public void setNumOfAccessed(int numOfAccessed)

    {
        numOfAccessed++;

        this.numOfAccessed = numOfAccessed;

    }

    public boolean equals(Student other)

    {

        if (other.sAsuID == this.sAsuID)

        {

            return true;

        }

        else if (other.sFullName.equalsIgnoreCase(this.sFullName))

        {

            return true;

        }

        return false;

    }

}
