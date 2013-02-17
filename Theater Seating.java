package theaterseatingmap;

/**
 *
 * @author noel
 */

import java.util.Scanner;

public class TheaterSeatingMap 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);        
        boolean chooseSeats=true;
        String stopInput;
        int methodChoice;

        while(chooseSeats)
        {
            System.out.println("Welcome to Theater Alexander.");
            System.out.println("Press 1 to choose a seat by price.");
            System.out.println("Press 2 to choose a seat by number.");
            
            methodChoice = input.nextInt();

            System.out.println("you chose: ");
            System.out.println(methodChoice);
            
            System.out.println("Enter Q to quit, any other input to purchase a new seat: ");
            stopInput = input.next();
            
            if(stopInput.matches("Q"))
            {chooseSeats=false;}
            
        }//END OF WHILE LOOP TO CHOOSE SEATS

        
        
    }
}
