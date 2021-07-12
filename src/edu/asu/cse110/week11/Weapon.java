package edu.asu.cse110.week11;

/*-------------------------------------------------------------
// CSE 110     : Class # 75326
// ASSIGNMENT  : Assignment #07
// AUTHOR      : Christian J. Gonzalez Vargas Student ID# 1218551828
// DESCRIPTION : Program that simulates battles of imagined monsters
// CONTACT     : cjgonz21@asu.edu & c.gonzalez@encetech.org
// FILENAME    : Assignment07.java
// TIME SPENT  : 260 Minutes
//-----------------------------------------------------------*/

public class Weapon
{
    private String name;
    private int maxDamage;

    //default constructor

    public Weapon()
    {
        name="Pointy Stick";
        maxDamage=1;
    }

    //overloaded constructor

    public Weapon(String name, int maxDamage)
    {
        this.name = name;
        this.maxDamage = maxDamage;
    }

    //method that takes no arguments and returns name

    public String getName()
    {
        return name;
    }

    //method that takes one argument and doesn't return anything

    public void setName(String name)
    {
        this.name = name;
    }

    //method that takes no argument and returns an int

    public int getMaxDamage()
    {
        return maxDamage;
    }

    //method that takes one int argument, doesn't return anything

    public void setMaxDamage(int maxDamage)
    {
        this.maxDamage = maxDamage;
    }
}
