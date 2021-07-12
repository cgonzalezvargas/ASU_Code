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

//import statements

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Roster
{

    //To store references of players
    private ArrayList<Player> players;

    // default constructor.
    public Roster()
    {
        players = new ArrayList<Player>();
    }

    // overloaded constructor. Take input as filename.
    public Roster(String fileName)
    {
        players = new ArrayList<Player>();
        // reader to read file and store in the list.
        readRosterFile(fileName);
    }

    // file reader.
    private void readRosterFile(String fileName)
    {
        try {
            // reading all lines from the file and storing in the array.
            String[] lines = Files.readAllLines(new File(fileName).toPath()).toArray(new String[0]);
            for (String line : lines) {
                //processing each line and storing into the list.
                String[] arr = line.split(" ");
                String name = arr[0] + " " + arr[1];
                double attackStat = Double.parseDouble(arr[2]);
                double blockStat = Double.parseDouble(arr[3]);
                players.add(new Player(name, attackStat, blockStat));
            }

        }
        catch (Exception e)
        {
            System.out.println("Error while reading roster file.");
        }

    }

    // adding new player to the list
    public void addPlayer(String name, double attackStat, double blockStat)
    {
        players.add(new Player(name, attackStat, blockStat));
    }

    // total count of players in the roster.
    public int countPlayers()
    {
        return players.size();
    }

    // get player by name
    public Player getPlayerByName(String name)
    {
        for (Player p : players)
        {
            //checking if any part of the players name is matching with the search condition.
            if (p.getName().contains(name))
            {
                return p;
            }
        }
        return null;
    }

    // printing top two attackers in the list.
    public void printTopAttackers()
    {
        ArrayList<Player> tmpList = players;
        //using java 8 stream api to sort the list in descending order.
        tmpList = (ArrayList<Player>) tmpList.stream().sorted(Comparator.comparingDouble(Player::getAttackStat).reversed())
                .collect(Collectors.toList());

        //printing first two highest attacker players info
        tmpList.get(0).printPlayerInfo();
        tmpList.get(1).printPlayerInfo();

    }

    // printing top two blocker in the list.
    public void printTopBlockers()
    {
        ArrayList<Player> tmpList = players;
        //using java 8 stream api to sort the list in descending order.
        tmpList = (ArrayList<Player>) tmpList.stream().sorted(Comparator.comparingDouble(Player::getBlockStat).reversed())
                .collect(Collectors.toList());
        //printing first two highest blocker players info
        tmpList.get(0).printPlayerInfo();
        tmpList.get(1).printPlayerInfo();
    }

    //printing all player details.
    public void printAllPlayers()
    {
        for (Player p : players)
        {
            p.printPlayerInfo();
        }
    }

}
