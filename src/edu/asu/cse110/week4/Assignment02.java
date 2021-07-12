package edu.asu.cse110.week4;

/*-------------------------------------------------------------
// CSE 110     : Class # 75326
// ASSIGNMENT  : Assignment #02
// AUTHOR      : Christian J. Gonzalez Vargas Student ID# 1218551828
// DESCRIPTION : Program that calculates building project parameters
// CONTACT     : cjgonz21@asu.edu & c.gonzalez@encetech.org
// FILENAME    : Assignment02.java
// TIME SPENT  : 180 Minutes
//-----------------------------------------------------------*/

//Import java Scanner utility
import java.util.Scanner;

public class Assignment02
{
    public static void main(String[] args)
    {
        //Declare and instantiate a Scanner
        Scanner scan = new Scanner(System.in);

        //Declare and initialize variables for input
        double inLenghtRoad;
        int inNumberLanes;
        int inDepthAsphalt;
        int inDaysToComplete;

        //Declare and initialize variables for output

        int ouTruckOfAsphalt;
        int ouStopLight;
        int ouConduitPipes;
        int ouCrewMembers;
        double ouCostOfAsphalt;
        double ouCostOfStoplights;
        double ouCostOfConduit;
        double ouCostOfLabor;
        double ouTotalCost;

        //Declare constants and terms for use in calculations

        final double conWorkerWage = 25.00;
        final int conInterSection = 1;
        final int conConduitMeasure = 24;
        final double conStopCost = 25000.00;
        final double conConduCost = 500.00;
        final double conAsphaltCost = 200.00;
        final int conHourDays = 8;
        final double conRoadWidthPerLane = 12.00;
        final double conFeetPerMile = 5280.00;
        final double conAsphaltCubeWeight = 150.00;
        final double conTruckMaxWeight = 10000.00;
        final int conStopLight = 2;

        //Declare calculation variables

        float calAsphaltMiles;
        float calAshalptCubic;
        int calStopLights;
        float calDepthAsphalt;
        float calAsphaltVolume;
        double calAsphaltTruck;



        //*---------------------------------------------------------------------------------
        //                              MAIN LOGIC OF THE PROGRAM HERE
        //                                              |
        //                                              v
        //---------------------------------------------------------------------------------*/

        System.out.println("Lenght of road project (miles)       :");
        inLenghtRoad = scan.nextDouble();


        System.out.println("Number of lanes                      :");
        inNumberLanes = scan.nextInt();


        System.out.println("Depth of asphalt (inches)            :");
        inDepthAsphalt = scan.nextInt();


        System.out.println("Days to complete project             :");
        inDaysToComplete = scan.nextInt();

        //--------------------------------------------------------------------------------
        // CALCULATE VOLUME OF ASPHALT FOR PROJECT
        //------------------------------------------------------------------------------*/

        calAsphaltMiles = (float) (inLenghtRoad * conFeetPerMile);

        calDepthAsphalt = (float) inDepthAsphalt/12;

        calAshalptCubic = calAsphaltMiles * calDepthAsphalt * (float)(inNumberLanes * conRoadWidthPerLane);

        calAsphaltVolume = (float)(calAshalptCubic * conAsphaltCubeWeight);

        calAsphaltTruck =  Math.round(calAsphaltVolume);

        ouTruckOfAsphalt = (int) Math.ceil(calAsphaltTruck/conTruckMaxWeight);


        //--------------------------------------------------------------------------------
        // CALCULATE AMOUNT OF STOPLIGHTS FOR PROJECT
        //------------------------------------------------------------------------------*/

        calStopLights = (int) (inLenghtRoad / conInterSection);
        ouStopLight = calStopLights *(conStopLight + inNumberLanes);

        //--------------------------------------------------------------------------------
        // CALCULATE AMOUNT OF CONDUIT PIPES FOR PROJECT
        //------------------------------------------------------------------------------*/

        ouConduitPipes = (int) calAsphaltMiles/conConduitMeasure;

        //--------------------------------------------------------------------------------
        // CALCULATE AMOUNT OF CREW MEMBERS
        //------------------------------------------------------------------------------*/

        ouCrewMembers = (int) Math.round((50 * inLenghtRoad * inNumberLanes)/inDaysToComplete);

        //--------------------------------------------------------------------------------
        // CALCULATE COST OF ASPHALT
        //------------------------------------------------------------------------------*/

        ouCostOfAsphalt = conAsphaltCost * (ouTruckOfAsphalt * 5);

        //--------------------------------------------------------------------------------
        // CALCULATE COST OF STOPLIGHTS
        //------------------------------------------------------------------------------*/

        ouCostOfStoplights = ouStopLight * conStopCost;

        //--------------------------------------------------------------------------------
        // CALCULATE COST OF CONDUIT PIPES
        //------------------------------------------------------------------------------*/

        ouCostOfConduit = ouConduitPipes * conConduCost;

        //--------------------------------------------------------------------------------
        // CALCULATE COST OF LABOR
        //------------------------------------------------------------------------------*/

        ouCostOfLabor = conWorkerWage * (inDaysToComplete * conHourDays * ouCrewMembers);

        //--------------------------------------------------------------------------------
        // CALCULATE TOTAL COST FOR PROJECT
        //------------------------------------------------------------------------------*/

        ouTotalCost = ouCostOfAsphalt + ouCostOfStoplights + ouCostOfConduit + ouCostOfLabor;











        System.out.println("===Amount of materials needed===");

        System.out.println("Truckloads of Asphalt  :" + ouTruckOfAsphalt);
        System.out.println("Stoplights             :" + ouStopLight);
        System.out.println("Conduit pipes          :" + ouConduitPipes);
        System.out.println("Crew members needed    :" + ouCrewMembers);

        System.out.println("===Cost of Materials needed=====");

        System.out.println("Cost of Asphalt        :" + "$" + ouCostOfAsphalt);
        System.out.println("Cost of Stoplights     :" + "$" + ouCostOfStoplights);
        System.out.println("Cost of Conduit pipes  :" + "$" + ouCostOfConduit);
        System.out.println("Cost of Labor          :" + "$" + ouCostOfLabor);

        System.out.println("===Total Cost of Project========");

        System.out.println("Total cost of project  :" + "$" + ouTotalCost);




    }


}
