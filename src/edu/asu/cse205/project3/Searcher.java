package edu.asu.cse205.project3;
//**************************************************************************************************
// CLASS: Searcher (Searcher.java)
//
// DESCRIPTION
// Searcher class for Project 3 - helper class and method for finding index to student object
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

public class Searcher {

    public static int search(ArrayList<Student> pList, String pKey) {
        // look for student lastname match with key provided
        for (int i = 0; i < pList.size(); ++i)
            if (pList.get(i).getLastName().equals(pKey))
                return i;

        // if no key match, return -1
        return -1;
    }
}
