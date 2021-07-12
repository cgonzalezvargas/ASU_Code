package edu.asu.cse205.project2;

/*********************************************************************************************************
 * CLASS: OnlineStudent (OnlineStudent.java)
 *
 * DESCRIPTION
 * OnlineStudent is a child class of Student which contains additional variables that differ from the Student
 * superclass. OnlineStudent also implements the calcTuition method that calculates the tuition costs specific
 * to online students.
 *
 * COURSE AND PROJECT INFORMATION
 * CSE205 Object Oriented Programming and Data Structures, Spring 2021
 * Project Number: project-number #2
 *
 * GROUP INFORMATION
 * AUTHOR 1: Christian J Gonzalez, cjgonz21, cjgonz21@asu.edu
 * AUTHOR 2: Timothy Cash, tjcash, tjcash@asu.edu
 ********************************************************************************************************/
public class OnlineStudent extends Student {

    private boolean mTechFee;

    /**
     * OnlineStudent(String, String, String)
     *
     * Constructor method for creating OnlineStudent objects
     * @param pId the student's ID stored as a String
     * @param pFname the student's first name stored as a String
     * @param pLname the student's last name stored as a String
     */
    public OnlineStudent(String pId, String pFname, String pLname) {
        super(pId, pFname, pLname);
    }

    /**
     * calcTuition()
     *
     * Calculates the OnlineStudent's tuition based on current rates and applicable tech fees
     */
    @Override
    protected void calcTuition() {
        double t = getCredits() * TuitionConstants.ONLINE_CREDIT_RATE;

        if (getTechFee()) {
            t += TuitionConstants.ONLINE_TECH_FEE;
        }

        setTuition(t);
    }

    /**
     * getTechFee()
     *
     * Accessor method for student's applicable tech fee status
     * @return true for applicable tech fees, false for not applicable
     */
    public boolean getTechFee() {
        return mTechFee;
    }

    /**
     * setTechFee(boolean)
     *
     * Mutator for student's tech fee applicability
     * @param pTechFee true for applicable tech fees, false for not applicable
     */
    public void setTechFee(boolean pTechFee) {
        mTechFee = pTechFee;
    }
}
