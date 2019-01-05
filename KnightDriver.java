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
        boolean mainCheck = true;
        boolean works = false;
        Random randy = new Random();
        int[] moveCheck = new int [9];
        int number;
        int counter = 2;
        KnightsTour knighty = new KnightsTour();
        
        moveCheck[0] = 1;
          while(mainCheck)
        {
            number = randy.nextInt(8)+1;
            
            works = knighty.checkMove(number);
            
            moveCheck[number] = 1;
            
            if (works)
            {
                knighty.set();
                knighty.move(counter);
                for (int x = 1; x< moveCheck.length; x++)
                {
                    moveCheck[x] = 0;
                }
                counter++;
            }
            else
            {
                if(knighty.checkMoveNum(moveCheck) == 9)
                    mainCheck = false;
                }
            
            }
        
        knighty.print(counter);
    }
}

