
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
            
            
            //if it works, give boolean true 
            //if the previous boolean is still false, and
               //all numbers have been exhausted, give the main while 
               //loop boolean false
            
            
    }
}
