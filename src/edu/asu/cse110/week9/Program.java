package edu.asu.cse110.week9;

/*-------------------------------------------------------------
// AUTHOR: Christian J. Gonzalez Vargas Student ID# 1218551828
// CONTACT: cjgonz21@asu.edu & c.gonzalez@encetech.org
// FILENAME: Program.java
// SPECIFICATION: Program that Autogrades Students
// FOR: CSE 110 - Lab#07
// TIME SPENT: 170 Minutes
//-----------------------------------------------------------*/

import java.util.Date;

public class Program
{

    String programName;
    String description;
    String createdDate;
    String FileName;
    Student author;
    public Program(String programName, String description, String FileName, Student author)
    {
        super();
        this.programName = programName;
        this.description = description;
        this.FileName = FileName;
        this.author = author;
        Date date=java.util.Calendar.getInstance().getTime();
        this.createdDate=date.toString();
    }//End of the Constructor

    public String getProgramName()
    {
        return programName;
    }//End of the getProgramName Method

    public void setprogramName(String programName)
    {
        this.programName = programName;
    }//End of the setProgramName Method

    public String getDescription()
    {
        return description;
    }//End of the getDescription Method

    public void setDescription(String description)
    {
        this.description = description;
    }//End of the setDescription Method

    public String getCreatedDate()
    {
        return createdDate;
    }//End of setCreatedDate Method.

    public void setCreatedDate(String createdDate)
    {
        this.createdDate = createdDate;
    }//End of SetCreatedDate Method

    public String getFileName()
    {
        return FileName;
    }//End of getTitleName Method

    public void setFileName(String FileName)
    {
        this.FileName = FileName;
    }//End of SetTitleName Method

    public Student getAuthor()
    {
        return author;
    }//End of getAuthor Method

    public void setAuthor(Student author)
    {
        this.author = author;
    }//End of setAuthor Method

    @Override
    public String toString()
    {
        return "Program : " + programName + ", Description : " + description + ", Filename : " + FileName + ", Author: " + author;

    }//End of toString Method



}
