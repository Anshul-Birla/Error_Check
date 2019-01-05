import apcslib.*;
/**
 * Write a description of class KnightsTour here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
/*
  This program will start the knight chess piece at a corner of the
  board and attempt to move to all 64 squares.  This program
  will use a random number generator to attempt a move of type 1-8.
  The possible moves are categorized as follows:

  move 1:  +1 to the right, -2 up, a negative move to go up in the grid
  move 2:  +2 to the right, -1 up
  move 3:  +2 to the right, +1 down
  move 4:  +1 to the right, +2 down
  move 5:  -1 to the left, +2 down
  move 6:  -2 to the left, +1 down
  move 7:  -2 to the left, -1 up
  move 8:  -1 to the left, -2 up

  The program will move the knight until all 64 squares have been
  hit (extremely rare), or the piece gets stuck.  The program will
  print out the board, with numbers ranging from 1-64 for the order
  in which the squares were visited.
*/
class KnightsTour
{
  protected int[] myHorizMove = {0, 1, 2, 2, 1, -1, -2, -2, -1}; //see above
  protected int[] myVertMove = {0, -2, -1, 1, 2, 2, 1, -1, -2}; //see above
  protected int[][] masterBoard; //this keeps track of the knight's path
  private int lastMoveX; //holds value for the x coordinate for the last move
  private int lastMoveY; //holds value for the y coordinate for the last move
  private int newX; //x coordinate for the new x candidate
  private int newY; //y coordinate for the new x candidate
  
  /**
   * Constructor for KnightsTour object
   * 
   */
  public KnightsTour()
  {
      masterBoard = new int[9][9];
      newX = 0;
      newY = 0;
      lastMoveX = 1;
      lastMoveY = 1;
      move(1);
  }
  
  /**
   * This checks if the move provided is legal or not 
   * @param num               number of move that needs checking for legality
   * @return check            true/false value for legality
   */
  public boolean checkMove(int num)
  {
       boolean check = false;
       newX = lastMoveX + myHorizMove[num];
       newY = lastMoveY + myVertMove[num];
       
       if ( newX > 0 && newX <9)
            if( newY > 0 && newY <9)
                check = true;
       
       if(check)
           if(masterBoard[newX][newY] != 0)
                check = false;
       
        return check;
       
  }
  
  /**
   * This moves the piece to a spot and inputs move number in the spot
   * @param number               the number of the move when the 
   *                             piece got to the spot
   */
  public void move(int number)
  {
     masterBoard[lastMoveX][lastMoveY] = number;
  }
  
  /**
   * Helper method that sets lastMoveX and lastMoveY to their
   * new values should it be needed
   */
  public void set()
  {
     lastMoveX = newX;
     lastMoveY = newY;
  }
  
  /**
   * This adds up all the values in a given array and outputs it
   * @param moves             array that needs adding
   * @return tot              value of the sum
   */
  public int checkMoveNum(int [] moves)
  {
    int tot = 0;
    
    for (int x = 0; x< moves.length;x++)
        tot+=moves[x];
        
    return tot;
  }
  
  /**
   * This outputs the result
   * @param num          the number of moves it took the knight to finally 
   *                     fail
   */
  public void print(int num)
  {
    System.out.print("     ");

    for(int x =1; x<9; x++)
     {
       System.out.print(Format.right(x,2));
       System.out.print("  ");
     }
    
      System.out.println();
      System.out.println();
      
    for(int row = 1; row< 9; row++)
      {
        for (int co= 1; co<9; co++)
          {
            if (co ==1)
                System.out.print(Format.right(row,2) + " ");
               
            System.out.print("  " + 
                Format.right((masterBoard[row][co]),2));
            }
        System.out.println();  
        }
        
        System.out.print(num+ " spaces were visited");
    }
}