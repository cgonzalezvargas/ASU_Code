package edu.asu.cse205.project3;
//**************************************************************************************************
// CLASS: Sorter (Sorter.java)
//
// DESCRIPTION
// Sorter class for Project 3 - Quicksort for Student objects
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

import java.util.ArrayList;

public class Sorter {

    // partitioning  method
    private static int partition(ArrayList<Student> pList, int pFromIdx, int pToIdx) {
        Student pivot = pList.get(pFromIdx);
        int leftIndex = pFromIdx - 1;
        int rightIndex = pToIdx + 1;

        while (leftIndex < rightIndex) {
            leftIndex++;
            while(pList.get(leftIndex).compareTo(pivot) < 0)
                leftIndex++;

            rightIndex--;
            while(pList.get(rightIndex).compareTo(pivot) > 0)
                rightIndex--;

            if (leftIndex < rightIndex)
                swap(pList, leftIndex, rightIndex);
        }
        return rightIndex;
    }

    // quicksort algo
    private static void quickSort(ArrayList<Student> pList, int pFromIdx, int pToIdx) {

        // check if sorting is done, e.g., fromIndex >= toIndex
        if (pFromIdx >= pToIdx)
            return;

        int partitionIndex = partition(pList, pFromIdx, pToIdx);

        // recursive call quicksort
        quickSort(pList, pFromIdx, partitionIndex);
        quickSort(pList, partitionIndex + 1, pToIdx);
    }

    // public method for calling the sort function
    public static void sort(ArrayList<Student> pList) {
        quickSort(pList, 0, pList.size() - 1);
    }

    // helper method swap - swap student objects based on indexes
    private static void swap(ArrayList<Student> pList, int pIdx1, int pIdx2) {
        Student tempStudent = pList.get(pIdx1);
        pList.set(pIdx1, pList.get(pIdx2));
        pList.set(pIdx2, tempStudent);
    }

}
