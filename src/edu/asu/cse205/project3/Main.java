package edu.asu.cse205.project3;
//**************************************************************************************************
// CLASS: Main (Main.java)
//
// DESCRIPTION
// Main class for Project 3 - code runner for the project for reading and updating student
// roster's exams and homework scores
//
// FEATURES
// 1. Read and write to file
// 2. Sorting student objects by lastname (using QuickSort)
// 3. Perform linear search of student object by lastname
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
import javax.swing.JFrame;

/**
 * The Main class containing the main() and run() methods.
 */

public class Main {

    private final String PROJ_FILENAME = "proj3/gradebook.dat";
    private final String OPEN_EXCEPTION_MESSAGE = "Could not open gradebook.dat for reading. Exiting.";
    private final String WRITE_EXCEPTION_MESSAGE = "Could not open gradebook.dat for writing. Exiting without saving.";
    private static final int NUM_EXAMS = 3;
    private static final int NUM_HOMEWORKS = 5;

    /**
     * The Roster of students that is read from the input file "gradebook.dat".
     */
    private Roster mRoster;
    /**
     * A reference to the View object.
     */
    private View mView;

    /**
     * This is where execution starts. Instantiate a Main object and then call run().
     */
    public static void main(String[] vArgs) {
        new Main().run();
    }

    /**
     * exit() is called when the Exit button in the View is clicked. When we exit we have to write
     * the roster to the output file "gradebook.dat". Then we exit the program with a code of 0.
     *
     */
    public void exit() {
        try {
            GradebookWriter gbWriter = new GradebookWriter(PROJ_FILENAME);
            gbWriter.writeGradebook(getRoster());
            System.exit(0);
        } catch (FileNotFoundException e) {
            // call messageBox() on getView() to display exception message
            getView().messageBox(WRITE_EXCEPTION_MESSAGE);
            System.exit(-1);
        }
    }

    /**
     * This method returns the number of exams in the class.
     */
    public static int getNumExams() {
        return NUM_EXAMS;
    }

    /**
     * This method returns the number of homework assignments in the class.
     */
    public static int getNumHomeworks() {
        return NUM_HOMEWORKS;
    }

    /**
     * Accessor method for mRoster.
     */
    private Roster getRoster() {
        return mRoster;
    }

    /**
     * Accessor method for mView.
     */
    private View getView() {
        return mView;
    }

    /**
     * Run() links the view GUI to the main object and performs the roster
     * fetch from the file
     */
    private void run() {
        // instantiate the JFrame
        JFrame.setDefaultLookAndFeelDecorated(true);
        // create new view object and link back to main
        setView(new View(this));

        try {
            GradebookReader gbReader = new GradebookReader(PROJ_FILENAME);
            setRoster(gbReader.readGradebook());
            // System.out.println(getRoster().toString());
        } catch (FileNotFoundException e) {
            // call messageBox() on getView() to display exception message
            getView().messageBox(OPEN_EXCEPTION_MESSAGE);
            System.exit(-1);
        }
    }

    /**
     * search() is called when the Search button is clicked in the View. The input parameter is
     * the last name of the Student to search the roster for. Call getStudent(pLastName) on the
     * Roster object (call getRoster() to get the reference to the Roster) to get a reference to
     * the Student with that last name. If the student is not located, getStudent() returns null.
     *
     * @param pLastName The last name of the student who we will search the Roster for.
     */
    public Student search(String pLastName) {
        return getRoster().getStudent(pLastName);
    }

    /**
     * Mutator method for mRoster.
     */
    private void setRoster(Roster pRoster) {
        mRoster = pRoster;
    }

    /**
     * Mutator method for mView.
     */
    private void setView(View pView) {
        mView = pView;
    }
}
