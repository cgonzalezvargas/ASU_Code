package edu.asu.cse110.week5;

/*-------------------------------------------------------------
// CSE 110     : Class # 75326
// ASSIGNMENT  : Assignment #03
// AUTHOR      : Christian J. Gonzalez Vargas Student ID# 1218551828
// DESCRIPTION : Program that automates stock trading using user input parameters
// CONTACT     : cjgonz21@asu.edu & c.gonzalez@encetech.org
// FILENAME    : Assignment03.java
// TIME SPENT  : 180 Minutes
//-----------------------------------------------------------*/

//Import scanner utility for user input
import java.util.Scanner;



public class Assignment03
{
    public static void main(String [] args)
    {
        //Declare my scanner for use within this method
        Scanner scan = new Scanner(System.in);

        //Declare variables for use in this program
        int inCurrentShares;
        int inPurchasePrice;
        int inMarketPrice;
        int inAvailFunds;

        //Calculation variables for use with input
        double calTotalBuyCost;
        double calNumberToBuy;
        double calPerShareBValue;
        int calTotalBuyValue;
        double calPerShareSValue;
        double calTotalSellValue;
        int calCurrentValueS;
        int calCurrentValueB;
        int calAvailBalance;

        //Output variables for decisions

        double ouNumberSharesToBuy;
        double ouTotalBuyCost;

        //Constant declaration for calculations

        final int conTranPrice = 10;

        //*--------------------------------------------------------------------------------------
        //                                  INPUT LOGIC OF THE PROGRAM
        //                                              |
        //                                              v
        //--------------------------------------------------------------------------------------*/

        System.out.println("Current Shares              :");
        inCurrentShares = scan.nextInt();

        System.out.println("Purchase Price              :");
        inPurchasePrice = scan.nextInt();

        System.out.println("Market Price                :");
        inMarketPrice = scan.nextInt();

        System.out.println("Available Funds             :");
        inAvailFunds = scan.nextInt();


        //*--------------------------------------------------------------------------------------
        //                                   ARITHMETIC OF THE PROGRAM
        //                                              |
        //                                              v
        //--------------------------------------------------------------------------------------*/

        //Evaluating current position within the market
        calCurrentValueS = inCurrentShares * inMarketPrice;
        calCurrentValueB = inCurrentShares * inPurchasePrice;
        calAvailBalance = inAvailFunds - conTranPrice;
        calTotalBuyCost = calAvailBalance/inMarketPrice;
        calTotalSellValue = (inCurrentShares * inMarketPrice) - conTranPrice;


        if ( inPurchasePrice > inMarketPrice && calTotalBuyCost < inAvailFunds && calTotalBuyCost != 0 )
        {
            calTotalBuyValue = (inAvailFunds - conTranPrice) * inMarketPrice;
            ouNumberSharesToBuy = (int) Math.floor(inAvailFunds-conTranPrice/inMarketPrice);
            ouTotalBuyCost = conTranPrice + (inMarketPrice/ouNumberSharesToBuy);
            System.out.println("Buy " + calTotalBuyValue + " shares");

        }
        else if ( inPurchasePrice < inMarketPrice && calTotalSellValue > calCurrentValueB)
        {
            System.out.println("Sell " + inCurrentShares + " shares");
        }
        else
        {
            System.out.println("Hold shares");

        }







    }
}
