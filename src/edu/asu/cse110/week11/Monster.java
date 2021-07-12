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

public class Monster
{
    private String name;
    private int healthScore;
    private Weapon weapon;

    //overloaded constructor

    public Monster(String name, int healthScore, Weapon weapon)
    {
        this.name = name;
        this.healthScore = healthScore;
        this.weapon = weapon;
    }

    public String getName()
    {
        return name;
    }
    public int getHealthScore()
    {
        return healthScore;
    }
    public String getWeaponName()
    {
        return weapon.getName();
    }
    public int attack(Monster m)
    {
        int randomInt=(int)(Math.random() * ((weapon.getMaxDamage() - 0) + 1)) + 0;
        m.healthScore-=randomInt;
        //removed to display negative values
        //if(m.getHealthScore()<0)
        //m.healthScore=0;
        return randomInt;
    }
}
