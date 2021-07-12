package edu.asu.cse110.week13;

/*-------------------------------------------------------------
// CSE 110     : Class # 75326
// ASSIGNMENT  : Assignment #08
// AUTHOR      : Christian J. Gonzalez Vargas Student ID# 1218551828
// DESCRIPTION : Program that creates random numbers and compares to input
// CONTACT     : cjgonz21@asu.edu & c.gonzalez@encetech.org
// FILENAME    : Assignment08.java
// TIME SPENT  : 320 Minutes
//-----------------------------------------------------------*/


public class Player
{

    // The name. */
    private String name;

    //The attack stat. */
    private double attackStat;

    // The block stat. */
    private double blockStat;

    public Player(String name, double attackStat, double blockStat)
    {
        this.name = name;
        this.attackStat = attackStat;
        this.blockStat = blockStat;
    }

    //Gets the name. @return the name*/
    public String getName()
    {
        return name;
    }

    //Gets the attack stat.@return the attack stat*/
    public double getAttackStat()
    {
        return attackStat;
    }

    //Sets the attack stat.@param attackStat the new attack stat*/
    public void setAttackStat(double attackStat)
    {
        this.attackStat = attackStat;
    }

    //.Gets the block stat.@return the block stat*/
    public double getBlockStat()
    {
        return blockStat;
    }

    //Sets the block stat.@param blockStat the new block stat*/
    public void setBlockStat(double blockStat)
    {
        this.blockStat = blockStat;
    }

    // printing players info
    public void printPlayerInfo()
    {
        String playerInfo = name + " (attack = " + String.format("%.2f",attackStat) + ", block = " + String.format("%.2f", blockStat) + ")";
        System.out.println(playerInfo);
    }
}
