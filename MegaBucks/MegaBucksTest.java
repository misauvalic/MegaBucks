

/**
 * The test class MegaBucksTest welcomes the user to Jackpot Jack.
 * As well, it prints out the number of times the same lottery number was repeated
 * and if the user won the lottery or not. As well, it prints out other prizes
 * the client can receive based on how many numbers they win.
 *
 * @author  (Misa Uvalic & Danielle Clymer)
 * @version (January 12, 2018)
 */
import java.util.*;
public class MegaBucksTest
{
    public static void main (String[] args)
    {
    //intializes variables
    int win = 0;
    int freq = 0;
    int freq1 = 0;
    int freq2 = 0;
    int freq3 = 0;
    int freq4 = 0;
    int freq5 = 0;
    int bonusWinner = 0;
    int lotto = 0;
    int luckyDay=0;
        
    System.out.println("Welcome to Jackpot Jack!");
    MegaBucks draw = new MegaBucks();
    //calls methods to be able to use within the for loops
    draw.userPicks();
    draw.Bonus();
    draw.User();
              
       /** The first for loop prints out 104 times in a year for twice a week. As well, 
        *  we compare bonuses to determine if they are the same. Furthermore, the 
        *  last two for loops determine the frequencies of the numbers.
       */
         for(int i = 0; i<104; i++)
         {
       MegaBucks draw1 = new MegaBucks();
       if(draw.Bonus2()== draw1.actualBonus())
         {
           System.out.println("CONGRATULATIONS! YOU WON THE BONUS!");
           bonusWinner++;
             }
            for (int x = 0; x<6; x++)
             {  
                for (int y = 0; y<6; y++)
                {
                    if (draw1.winnerNums.get(x)==draw.User.get(y))
                    {
                        win++;
                        if (y == 0)
                        {
                            freq++;
                        }
                        if (y == 1)
                        {
                            freq1++;
                        }
                        if (y == 2)
                        {
                            freq2++;
                        }
                        if (y == 3)
                        {
                            freq3++;
                        }
                        if (y == 4)
                        {
                            freq4++;
                        }
                        if (y == 5)
                        {
                            freq5++;
                        }
                    }
            }     
       }
       /**
        * if statements used to determine how much the user won
        * if they had a certain amount of the same numbers as the lottery drawings.
        */
       if ((win == 2) && draw1.userNumsBonus == draw1.bonusNum)
       {
                System.out.println("Congratulations! You won $2.00!");
                luckyDay++;
       } 
       else if (win==3)
       {
                System.out.println("Congratulations! You won a free $1.00 ticket!");
                luckyDay++;
       }
       else if ((win == 3) && draw1.userNumsBonus == draw1.bonusNum)
        {
                System.out.println("Congratulations! You won $5.00!");
                luckyDay++;
       } 
       else if (win == 4)
        {
                System.out.println("Congratulations! You won $40.00!");
                luckyDay++;
       } 
       else if ((win == 4) && draw1.userNumsBonus == draw1.bonusNum)
        {
                System.out.println("Congratulations! You won $50.00!");
                luckyDay++;
       } 
       else if (win == 5)
       {
                System.out.println("Congratulations! You won $1,000.00!");
                luckyDay++;
       } 
       else if ((win == 5) && draw1.userNumsBonus == draw1.bonusNum)
        {
                System.out.println("Congratulations! You won $10,000.00!");
                luckyDay++;
       } 
       else if (win == 6)
        {
            lotto++;    
            System.out.println("JACKPOT!!!!!!!!!!!!!!!!!!!!");
            luckyDay++;
       } 
       //prints out drawing number, how many numbers are won & the weeks lottery numbers
       System.out.println();
       System.out.println("Drawing "+ (i+1));
       System.out.println(draw1);
       System.out.println("You won "+ win +" numbers!");
       win=0;
    }
    //prints out frequencies & how many times lottery is won as well as prizes won.
    System.out.println();
    System.out.println("1st number won "+ freq +" time(s)");
    System.out.println("2nd number won "+ freq1 +" time(s)");
    System.out.println("3rd number won "+ freq2 +" time(s)");
    System.out.println("4th number won "+ freq3 +" time(s)");
    System.out.println("5th number won "+ freq4 +" time(s)");
    System.out.println("6th number won "+ freq5 +" time(s)");        
    System.out.println("Bonus number won "+ bonusWinner +" time(s)");
    System.out.println("You won the lottery "+ lotto +" time(s)");
    System.out.println("You won " + luckyDay + " prize(s)!!!");
 }
}
