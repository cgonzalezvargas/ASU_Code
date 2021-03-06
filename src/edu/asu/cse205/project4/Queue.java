package edu.asu.cse205.project4;

//**************************************************************************************************
// CLASS: Queue<E> (Queue.java)
//
//
// COURSE AND PROJECT INFO
// CSE 205 Object Oriented Programming and Data Structure, Spring 2021
// Project Number: 4
// TEAM: KK
//
// AUTHOR
// Shawn Chen, schen337, schen337@asu.edu
// Timothy Cash, tjcash, tjcash@asu.edu
// Christian J Gonzalez Vargas, cjgonz21, cjgonz21@asu.edu
//
//**************************************************************************************************

/**
 * Implements a generic queue data structure using a DList to store the elements.
 */
public class Queue<E> {

    private DList<E> mList;

    /**
     * Creates a new empty Queue by creating a new empty DList.
     */
    public Queue() {
        setList(new DList<>());
    }

    /**
     * Removes all of the elements from this Queue. After clear() returns this Queue is empty.
     */
    public void clear() {
        getList().clear();
    }

    /**
     * Removes and returns the element that is at the front of this Queue.
     */
    public E dequeue() {
        E front = getList().remove(0);
        return front;
    }

    /**
     * Adds pData to the rear of this Queue.
     */
    public void enqueue(E pData) {
        getList().append(pData);
    }

    /**
     * Accessor method for mList.
     */
    protected DList<E> getList() {
        return mList;
    }

    /**
     * Returns true if this Queue is empty.
     */
    public boolean isEmpty() {
        return getList().isEmpty();
    }

    /**
     * Returns the front element of this Queue without removing it.
     */
    public E peek() {
        return getList().get(0);
    }

    /**
     * Mutator method for mList.
     */
    protected void setList(DList<E> pList) {
        mList = pList;
    }

    /**
     * Overrides toString() inherited from Object. Returns a String representation of the elements
     * of this Queue by calling the DList.toString() method.
     */
    @Override
    public String toString() {
        return getList().toString();
    }

}
