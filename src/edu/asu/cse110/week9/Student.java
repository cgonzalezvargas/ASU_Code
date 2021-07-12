package edu.asu.cse110.week9;

/*-------------------------------------------------------------
// AUTHOR: Christian J. Gonzalez Vargas Student ID# 1218551828
// CONTACT: cjgonz21@asu.edu & c.gonzalez@encetech.org
// FILENAME: Student.java
// SPECIFICATION: Program that Autogrades Students
// FOR: CSE 110 - Lab#07
// TIME SPENT: 170 Minutes
//-----------------------------------------------------------*/

public class Student
{

    String firstName;
    String lastName;
    String FullName;
    String asuid;
    double grade;

    public Student(String firstName, String lastName, String asuid)
    {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.FullName = firstName+" "+lastName;
        this.asuid = asuid;
    }

    public String getfirstName()
    {
        return firstName;
    }

    public void setfirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getFullName()
    {
        return FullName;
    }

    public void setFullName(String fullName)
    {
        this.FullName = fullName;
    }

    public String getAsuID()
    {
        return asuid;
    }

    public void setAsuid(String asuid)
    {
        this.asuid = asuid;
    }

    public double getGrade()
    {
        return grade;
    }

    public void setGrade(double grade)
    {
        this.grade = grade;
    }

    @Override
    public String toString()
    {
        return "Student : " + FullName + ", ASU ID : "
                + asuid + ", Grade : " + grade;
    }




}
