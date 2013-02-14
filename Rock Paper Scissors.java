
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
            computerChoice = computerPlay();
            
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
        int userPlayChoice;
        //code!
        System.out.println("It is your turn, human. Please enter:\n1 for Rock\n2 for Paper\n3 for Scissors");
        userPlayChoice = userIn.nextInt();
        
        switch(userPlayChoice)
        {
            case 1:System.out.println("You have chosen Rock"); break;
            case 2:System.out.println("You have chosen Paper"); break;
            case 3:System.out.println("You have chosen Scissors"); break;
        }
        
        return userPlayChoice;
    }//end of userPlay method
    
    public static int computerPlay()
    {
        Random generator = new Random();
        int computerPlayChoice = generator.nextInt(3) + 1;
        
        switch(computerPlayChoice)
        {
            case 1:System.out.println("The computer has chosen Rock"); break;
            case 2:System.out.println("The computer has chosen Paper"); break;
            case 3:System.out.println("The computer has chosen Scissors"); break;
        }
        
        return computerPlayChoice;
    }//end of computerPlay method
          
    
}
