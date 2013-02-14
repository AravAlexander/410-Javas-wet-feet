package rockpaperscissors;

/**
 *
 * @author noel
 */

import java.util.Scanner;
import java.util.Random;

        
public class RockPaperScissors 
{

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int[] gameTally = new int[3];
        String quitGame;
        boolean playGame = true;
         
        while(playGame)
        {
            //play game!
            
            System.out.println("Enter Q to quit\nAny other input to keep playing: ");
            quitGame = input.next();
            
            if(quitGame.matches("Q"))
            {playGame=false;}
        }
        
         System.out.println("end");
        
    }
}
