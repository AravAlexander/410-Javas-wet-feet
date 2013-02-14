
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
        int userChoice, computerChoice;
         
        while(playGame)
        {
            //play game!
            
            //user plays
            userChoice = userPlay();
                    
            //computer plays
            
            System.out.println("Enter Q to quit\nAny other input to keep playing: ");
            quitGame = input.next();
            
            if(quitGame.matches("Q"))
            {playGame=false;}
        }
        
         System.out.println("end");
        
    }//end of main method
    
    public static int userPlay()
    {
        Scanner userIn = new Scanner(System.in);
        int choice;
        //code!
        System.out.println("It is your turn, human. Please enter:\n1 for Rock\n2 for Paper\n3 for Scissors");
        choice = userIn.nextInt();
        
        return choice;
    }
    
}
