package edu.asu.cse205.project3;

//**************************************************************************************************
// CLASS: Roster (Roster.java)
//
// DESCRIPTION
// Roster class for Project 3 - methods for managing student objects as part of the roster
// within the roster
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
//**************************************************************************************************

import java.util.ArrayList;

/**
 * The Roster class encapsulates an ArrayList<Student> object named mStudentList which stores the
 * information for each student that was read from "gradebook.txt" when the app started.
 */
public class Roster {

    /**
     * Declare mStudentList as ArrayList<Student>
     */
    private ArrayList<Student> mStudentList;

    /**
     * Roster()
     */
    public Roster() {
        setStudentList(new ArrayList<Student>());
    }

    /**
     * addStudent()
     */
    public void addStudent(Student pStudent) {
        mStudentList.add(pStudent);
    }

    /**
     * getStudent()
     *
     * Searches mStudentList for a Student with pLastName.
     */
    public Student getStudent(String pLastName) {

        int index = Searcher.search(getStudentList(), pLastName);
        // if lastname (key) not found, return -1
        if (index == -1)
            return null;
            // return index where key was found
        else
            return getStudentList().get(index);
    }

    /**
     * getStudentList()
     *
     * Accessor method for mStudentList.
     */
    public ArrayList<Student> getStudentList() {
        return mStudentList;
    }

    /**
     * setStudentList()
     *
     * Mutator method for mStudentList.
     */
    private void setStudentList(ArrayList<Student> pStudentList) {
        mStudentList = pStudentList;
    }

    /**
     * sortRoster()
     * Called to sort the roster by last name.
     *
     */
    public void sortRoster() {
        Sorter.sort(getStudentList());
    }

    /**
     * Overriding toString method for Roster
     * prints the entire student roster (utilizing the student's toString output)
     */
    @Override
    public String toString() {
        String result = "";
        for (Student student : getStudentList()) {
            result += student + "\n";
        }
        return result;
    }
}
