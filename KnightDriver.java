
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
        Random rand = new Random();
        int[] moveCheck = new int [9];
        int number;
        int counter = 2;
        
        moveCheck[0] = 1;
        while(mainCheck)
        {
            number = rand.randomInt(7)+1;
            
            works = checkMove(number);
            
            moveCheck[number] = 1;
            
            if (works)
            {
                set();
                move(counter);
                for (int x = 1; x< moveCheck.length(); x++)
                {
                    moveCheck[x] = 0;
                }
                counter++;
            }
            else
            {
                if(checkMoveNum == 9)
                    mainCheck = false
                }
            
            }
    }
}

