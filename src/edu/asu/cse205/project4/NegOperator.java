package edu.asu.cse205.project4;

//**************************************************************************************************************
// CLASS: NegOperator
//
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
 * Represents the negation operator which is a specific type of unary operator.
 */

public class NegOperator extends UnaryOperator {
    public NegOperator() {
    }

    @Override
    public Operand evaluate(Operand pOperand) {
        return new Operand(-pOperand.getValue());
    }

    @Override
    int precedence() {
        return 4;
    }

    @Override
    int stackPrecedence() {
        return 4;
    }
}
