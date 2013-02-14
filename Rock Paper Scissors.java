
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
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int[] gameTally = new int[3];
        String quitGame;
        
        System.out.println("outside input: ");
        quitGame = input.next();
         
        while(quitGame != "Quit")
        {
            System.out.println("inside input: ");
            quitGame = input.next();
        }
        
         System.out.println("end");
        
    }
}
