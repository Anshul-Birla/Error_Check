import chn.util.*;
import java.util.Random;
/**
 * Write a description of class KnightDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class KnightDriver
{
    public static void main(String [] args)
    {
        //constructors
        Random randy = new Random();
        KnightsTour knighty = new KnightsTour();
        
        //initialize
        boolean mainCheck = true;
        boolean works = false;
        int[] moveCheck = new int [9];
        int number;
        int counter = 2;
       
        moveCheck[0] = 1;
        
        //master loop
          while(mainCheck)
        {
            //generates random integer
            number = randy.nextInt(8)+1;
            
            //checks if the move works 
            works = knighty.checkMove(number);
            
            //record the number has been used in this iteration
            moveCheck[number] = 1;
            
            if (works)
            {
                //both work in tandem to move the knight
                knighty.set();
                knighty.move(counter);
                
                //flushes the moveCheck array
                for (int x = 1; x< moveCheck.length; x++)
                {
                    moveCheck[x] = 0;
                }
                
                //increment counter
                counter++;
            }
            else
            {
                //if all numbers have been used, terminate the while loop
                if(knighty.checkMoveNum(moveCheck) == 9)
                    mainCheck = false;
             }
            
            }
        
        //ouput
        knighty.print(counter);
    }
}

