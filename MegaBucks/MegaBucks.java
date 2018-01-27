
/**
 *  This class gets users input of lottery numbers and creates a random lottery
 *  drawing that prints out the weeks lottery.
 *
 * @author (Misa Uvalic & Danielle Clymer)
 * @version (January 12, 2018)
 */
import java.util.*;
public class MegaBucks
{
    //initialized instance variables
    Scanner scan = new Scanner(System.in);
    public ArrayList<Integer>winnerNums;
    public ArrayList<Integer>User;
    public int bonusNum;
    public int userNumsBonus;
    private int increment;
    private String you;
    int pick = 0;
    int randNums = (int)(Math.random()*42+1);
    
   /**
     * Constructor for objects of class MegaBucks
     * Purpose of the constructor is to create the ArrayList of the winning lottery numbers
     * and call the lotto number creators 
     */
    public MegaBucks()
    {
        winnerNums = new ArrayList<Integer>();
        User = new ArrayList<Integer>();
        setNums();
        user();
    }

   /**
    * Purpose of userPicks method is to either pick the users numbers or allow the user to print
    * the 6 numbers they want to play for the whole year.
     *
     * @param  none
     * @return users numbers
     */
    public void userPicks()
     {
      System.out.println("Easy pick? Type in 0. Else, just put in a different number to begin.");
        pick = scan.nextInt();
        if (pick == 0)
        {
            for (int i = 0; i<7; i++)
            {
                     while (User.contains(randNums))
                     {
                        randNums = (int)(Math.random()*42+1);
                     }
                     User.add(randNums);
            }
        }
            else 
            {
            for (int x = 0; x< 6; x++)
            {
                System.out.print("Number:"+(x+1)+" ");
                increment = scan.nextInt();
                while (User.contains(increment))
                     {
                         System.out.println("Please enter a number other than one you have entered prior: ");
                         increment = scan.nextInt();
                     }
                if (increment < 1 || increment > 42)
                {
                    System.out.println("Please enter an integer from 1 to 42.");
                    increment = scan.nextInt();
                }
                User.add(increment);
            }
      }
    }
    
   /**
      * Purpose of ArrayList is to return Users numbers to MegaBucksTest
      * 
      * @param none
      * @return Users numbers
      * 
      */
    public ArrayList<Integer>user()
    {
        return User;
    }

   /**
     * Purpose of Bonus is to return bonus to tester
     * 
     * @param none
     * @return Bonus
     * 
     */
    public int Bonus()
    {
        userNumsBonus = (int)(Math.random()*42+1);
        return userNumsBonus;
    }

   /**
     * Purpose of Bonus2 is to return users bonus 
     * 
     * @param none
     * @return return bonus each time
     * 
     */
    public int Bonus2()
    {
        return userNumsBonus;
    }

      /**
     * Purpose is to check and see if user bonus and random bonus are the same
     * 
     * @param none
     * @return bonus if the same; boolean  
     * 
     */
   public boolean bonus3()
    {
        return true;
    }
    
   /**
     * Purpose is to set the random number lottery bonus
     * 
     * @param none
     * @return lotto bonus 
     * 
     */
    public int actualBonus()
    {
        bonusNum = (int)(Math.random()*42+1);
        return bonusNum;
    }

    /**
    * Purpose is to set the lottery numbers for each week 
    * 
    * @param none
    * @return weeks lottery numbers
    * 
    */
    private ArrayList<Integer> setNums()
    {
        int randNum = (int)(Math.random()*42+1);
        winnerNums.add(randNum);
        for(int i = 0; i<5; i++)
        {
            while(winnerNums.contains(randNum))
            {
            randNum = (int)(Math.random()*42+1);
           }
            winnerNums.add(randNum);
    }
    return winnerNums;
   }
   
   /**
     * Purpose of User is to just print out the numbers you enter.
     * 
     * @param none
     * @return prints users numbers
     * 
     */
    public String User()
    {
      String you = "Your numbers are: " + User.get(0) + " " + User.get(1) + " " +  User.get(2) + " " + 
      User.get(3)+ " " + User.get(4) + " " + User.get(5) + " " + " Bonus:" + userNumsBonus;
      System.out.println(you);
      return you;
     } 
    
   /**
    * Purpose is to print out lottery numbers of the week 
    * 
    * @param none
    * @return prints lottery numbers into a string 
    * 
    */
   public String toString()
   {
        String week = "The lottery numbers this week are " +
                     winnerNums.get(0)+", "+ winnerNums.get(1)+", "+
                     winnerNums.get(2)+", "+winnerNums.get(3)+", "+
                     winnerNums.get(4)+", "+winnerNums.get(5)+" Bonus: "+
                     bonusNum;
        return week;
    }   
  }
