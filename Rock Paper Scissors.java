
package rockpaperscissors;

/**
 *
 * @author noel
 */

import java.util.Random;
import java.util.Scanner;

        
public class RockPaperScissors 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int[] gameTally = {0, 0, 0};//initialize win counts to all 0s
        String quitGame;
        boolean playGame = true;
        int userChoice, computerChoice, winner;
        
        System.out.println("Welcome to Rock, Paper Scissors!\n");
         
        while(playGame)
        {
            //play game!
            //user plays
            userChoice = userPlay();
                    
            //computer plays
            computerChoice = computerPlay();
            
            //compare player choices
            winner = compareChoices(userChoice, computerChoice);
            
            //complete this round
            finishRound(winner, gameTally);
            
            System.out.println("Enter Q to quit, or any other input to keep playing: ");
            quitGame = input.next();
            
            if(quitGame.matches("Q"))
            {playGame=false;}
        }
        
        printTallies(gameTally);
        
        System.out.println("Goodbye!");
        
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
    
    public static int compareChoices(int usersChoice, int computersChoice)
    {
        int winnerInteger = 0;//will return 1 for human, 2 for pc, 3 for tie
        
        //player win
        if( (usersChoice == 1 && computersChoice == 3) ||
            (usersChoice == 3 && computersChoice == 2) ||
            (usersChoice == 2 && computersChoice == 1) )
        {
            winnerInteger = 1;
        }
        
        //computer win
        if( (computersChoice == 1 && usersChoice == 3) ||
            (computersChoice == 3 && usersChoice == 2) ||
            (computersChoice == 2 && usersChoice == 1) )
        {
            winnerInteger = 2;
        }        

        //tie
        if(usersChoice == computersChoice)
        {
            winnerInteger = 3;            
        }        
        
        return winnerInteger;
    }//end compareChoices
    
    public static void finishRound(int winTemp, int[] gameTally)
    {//winTemp 1=player, 2=pc, 3=tie

        if(winTemp == 1)
        {
            System.out.println("The human won.");
            gameTally[0]++;
        }
        
        if(winTemp == 2)
        {
            System.out.println("The computer won.");
            gameTally[1]++;            
        }
        
        if(winTemp == 3)
        {
            System.out.println("The game was a tie.");
            gameTally[2]++;
        }
        
    }//end of finishRound
    
    public static void printTallies(int[] gameTally)
    {
        System.out.print("The human won ");
        System.out.print(gameTally[0]);
        System.out.println(" games.");
        
        System.out.print("The computer won ");
        System.out.print(gameTally[1]);
        System.out.println(" games.");

        System.out.print("There were ");
        System.out.print(gameTally[2]);
        System.out.println(" tied games.");        
    }
    
}
