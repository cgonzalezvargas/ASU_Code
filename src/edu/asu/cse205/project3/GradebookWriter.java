package edu.asu.cse205.project3;

//**************************************************************************************************
// CLASS: GradebookWriter (GradebookWriter.java)
//
// DESCRIPTION
// GradebookWriter class for Project 3 - handler for writing output to the roster file
//
// COURSE AND PROJECT INFO
// CSE 205 Object Oriented Programming and Data Structure, Spring 2021
// Project Number: 3
// TEAM: KK
//
// AUTHOR
// Shawn Chen, schen337, schen337@asu.edu
// Timothy Cash, tjcash, tjcash@asu.edu
// Christian J Gonzalez Vargas, cjgonz21, cjgonz21@asu.edu
//
// NOTE
// This code is based on the design and pseudo code provided by the course instructor
//**************************************************************************************************

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * GradebookWriter inherits from PrintWriter and writes the gradebook info to the file whose name
 * is passed to the ctor.
 */
public class GradebookWriter extends PrintWriter {

    /**
     * Constructor
     * @param pFname The name of the output file to be opened for writing.
     */
    public GradebookWriter(String pFname) throws FileNotFoundException {
        super(pFname);
    }

    /**
     * Writes the gradebook info to the output file which was opened in the ctor.
     *
     * @param pRoster The roster of students.
     *
     */
    public void writeGradebook(Roster pRoster) {
        for (Student student: pRoster.getStudentList()) {
            System.out.println(student);
            this.println(student);
        }
        this.close();
    }
}
