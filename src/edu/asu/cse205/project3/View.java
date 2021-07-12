package edu.asu.cse205.project3;

//**************************************************************************************************
// CLASS: View (View.java)
//
// DESCRIPTION
// View class for Project 3 - provides the GUI interface and navigation for the project
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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Window;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * The View class implements the GUI. It is a subclass of JFrame and implements the ActionListener
 * interface so that we can respond to user-initiated GUI events.
 */
public class View extends JFrame implements ActionListener {

    public static final int FRAME_WIDTH = 525;
    public static final int FRAME_HEIGHT = 225;

    private Main mMain;

    /*
     * Declare GUI related instance variables for the buttons and text fields.
     */
    private JButton mClearButton;
    private JButton mExitButton;
    private JButton mSaveButton;
    private JButton mSearchButton;
    private JTextField mStudentName;
    private JTextField[] mExamText = new JTextField[Main.getNumExams()];
    private JTextField[] mHomeworkText = new JTextField[Main.getNumHomeworks()];

    /**
     * View()
     *
     * The View constructor creates the GUI interface and makes the frame visible at the end.
     *
     * @param pMain is an instance of the Main class. This links the View to the Main class so
     * they may communicate with each other.
     */
    public View(Main pMain) {

        /**
         * Save a reference to the Main object pMain into instance var mMain by calling setMain().
         */
        setMain(pMain);

        /**
         * Create a JPanel named panelSearch for the user interface
         * that handles lastname search input
         */
        JPanel panelSearch = new JPanel();
        JLabel studentNameLabel = new JLabel("Student Name:");
        mStudentName = new JTextField("", 25);
        mSearchButton = new JButton("Search");
        mSearchButton.addActionListener(this);

        panelSearch.add(studentNameLabel);
        panelSearch.add(mStudentName);
        panelSearch.add(mSearchButton);

        // Create a JPanel named panelHomework which uses the FlowLayout
        JPanel panelHomework = new JPanel();
        JLabel homeworkLabel = new JLabel("Homework: ");
        panelHomework.add(homeworkLabel);
        for (int i = 0; i < Main.getNumHomeworks(); ++i) {
            mHomeworkText[i] = new JTextField(5);
            panelHomework.add(mHomeworkText[i]);
        }

        // Create the exam panel which contains the "Exam: " label and the two exam text fields.
        JPanel panelExam = new JPanel();
        JLabel examLabel = new JLabel("Exam: ");
        panelExam.add(examLabel);
        for (int i = 0; i < Main.getNumExams(); ++i) {
            mExamText[i] = new JTextField(5);
            panelExam.add(mExamText[i]);
        }

        JPanel panelButtons = new JPanel();
        mClearButton = new JButton("Clear");
        mSaveButton = new JButton("Save");
        mExitButton = new JButton("Exit");
        mClearButton.addActionListener(this);
        mSaveButton.addActionListener(this);
        mExitButton.addActionListener(this);

        panelButtons.add(mClearButton);
        panelButtons.add(mSaveButton);
        panelButtons.add(mExitButton);

        /**
         * Create a JPanel named panelMain using a vertical BoxLayout
         * Container panel for the sub-panels defined above
         */
        JPanel panelMain = new JPanel();
        panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS));
        panelMain.add(panelSearch);
        panelMain.add(panelHomework);
        panelMain.add(panelExam);
        panelMain.add(panelButtons);

        // Set the title of the View to whatever you want by calling setTitle()
        setTitle("Gred::Gradebook Editor");

        // Set the size of the View to FRAME_WIDTH x FRAME_HEIGHT
        setSize(FRAME_WIDTH, FRAME_HEIGHT);

        // Make the View non-resizable
        setResizable(false);

        // Set the default close operation to JFrame.DO_NOTHING_ON_CLOSE. This disables the X close button
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        // Add panelMain to the View.
        add(panelMain);

        pack();
        setVisible(true);
    }

    /**
     * actionPerformed()
     * Event handlers for the navigation in the program including
     * Search, save, clear, and exit
     */
    @Override
    public void actionPerformed(ActionEvent pEvent) {
        if (pEvent.getActionCommand().equals("Search")) {
            clearNumbers();
            String lastName = mStudentName.getText();
            if (lastName.isEmpty())
                messageBox("Please enter the student's last name.");
            else {
                Student.setCurrStudent(getMain().search(lastName));
                if (Student.getCurrStudent() == null)
                    messageBox("Student not found. Try again.");
                else
                    displayStudent(Student.getCurrStudent());
            }
        } else if (pEvent.getActionCommand().equals("Save")) {
            if (Student.getCurrStudent() != null)
                saveStudent(Student.getCurrStudent());
        } else if (pEvent.getActionCommand().equals("Clear")) {
            clear();
        } else if (pEvent.getActionCommand().equals("Exit")) {
            getMain().exit();
        }
    }

    /**
     * clear()
     *
     * Clears out the entire GUI display
     */
    private void clear() {
        mStudentName.setText("");
        clearNumbers();
        Student.setCurrStudent(null);
    }

    /**
     * clearNumbers()
     *
     * Clears the homework and exam fields.
     */
    private void clearNumbers() {
        for (int i = 0; i < Main.getNumHomeworks(); ++i) {
            mHomeworkText[i].setText("");
        }
        for (int i = 0; i < Main.getNumExams(); ++i) {
            mExamText[i].setText("");
        }
    }

    /**
     * displayStudent()
     *
     * Displays the homework and exam scores for a student in the mHomeworkText and mExamText text
     * fields.
     *
     * @param pStudent is the Student who's scores we are going to use to populate the text fields.
     *
     */
    private void displayStudent(Student pStudent) {

        // set display to fullname
        mStudentName.setText(pStudent.getFullName());

        for (int i = 0; i < Main.getNumHomeworks(); ++i) {
            int hw = pStudent.getHomework(i);
            String hwStr = Integer.toString(hw);
            mHomeworkText[i].setText(hwStr);
        }
        for (int i = 0; i < Main.getNumExams(); ++i) {
            int exam = pStudent.getExam(i);
            String exStr = Integer.toString(exam);
            mExamText[i].setText(exStr);
        }
    }

    /**
     * Accessor method for mMain.
     */
    private Main getMain() {
        return mMain;
    }

    /**
     * messageBox()
     */
    public void messageBox(String pMessage) {
        JOptionPane.showMessageDialog(this, pMessage, "Alert" , JOptionPane.WARNING_MESSAGE);
    }

    /**
     * saveStudent()
     *
     * Retrieves the homework and exam scores for pStudent from the text fields and writes the
     * results to the Student record in the Roster.
     */
    private void saveStudent(Student pStudent) {
        for (int i = 0; i < Main.getNumHomeworks(); ++i) {
            String hwStr = mHomeworkText[i].getText();
            int hw = Integer.parseInt(hwStr);
            pStudent.setHomework(i, hw);
        }
        for (int i = 0; i < Main.getNumExams(); ++i) {
            String exStr = mExamText[i].getText();
            int exam = Integer.parseInt(exStr);
            pStudent.setExam(i, exam);
        }
    }

    /**
     * Mutator method for mMain.
     */
    private void setMain(Main pMain) {
        mMain = pMain;
    }
}