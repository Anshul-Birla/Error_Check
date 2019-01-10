import chn.util.*;
import java.util.Random;
/**
 * Tries to complete the Knight's Tour
 *
 * @Anshul 
 * @v1
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
        int number;
        int counter = 2;
       
       
        
        //master loop
          while(mainCheck)
        {
            //gets a number that is garunteed to work OR will terminate the loop
            number = knighty.randomizer();
            
            if (number != 9)
            {
                // move the knight
                knighty.move(counter);
               
                //increment counter
                counter++;
            }
            else
            {
                //if all numbers have been used, terminate the while loop
                if(number == 9)
                    mainCheck = false;
             }
            
            }
        
        //ouput
        knighty.print(counter);
    }
}

