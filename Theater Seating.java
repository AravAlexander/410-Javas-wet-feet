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
        int seatChoice;
        
        int[][] seatMap = { {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
                            {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
                            {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
                            {10, 10, 20, 20, 20, 20, 20, 20, 10, 10}, 
                            {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
                            {20, 20, 30, 30, 40, 40, 30, 30, 20, 20}, 
                            {20, 30, 30, 40, 50, 50, 40, 30, 30, 20},
                            {30, 40, 50, 50, 50, 50, 50, 50, 40, 30} };

//        printSeatMap(seatMap);

        while(chooseSeats)
        {
            System.out.println("Welcome to Theater Alexander.");
            System.out.println("Press 1 to choose a seat by price.");
            System.out.println("Press 2 to choose a seat by number.");
            System.out.print("Enter: ");            
            methodChoice = input.nextInt();
            System.out.println();

            switch(methodChoice)
            {
                case 1: seatChoice = seatByPrice(seatMap); break;
                case 2: seatChoice = seatByCoord(seatMap); break;
                default: System.out.println("\nInvalid choice, try again.\n");
            }          
            
            
                        
            System.out.print("Enter Q to quit, any other input to purchase a new seat: ");
            stopInput = input.next();
            System.out.println();
            
            if(stopInput.matches("Q"))
            {chooseSeats=false;}
            
        }//END OF WHILE LOOP TO CHOOSE SEATS

    }//end of main
    
    public static void printSeatMap(int[][] seatMap)
    {//generic print method
        int row, column;
        
        
        System.out.println("   01 02 03 04 05 06 07 08 09 10");//print column numbers
        System.out.println("   -----------------------------");//print column numbers
        
        for(row=0; row<8; row++)
        {//outer print loop
            System.out.print(String.format("%02d",row+1));
            System.out.print("|");//print row numbers
            
            for(column=0; column<10; column++)
            {//inner print loop
                System.out.print(seatMap[row][column]);
                System.out.print(" ");
                
            }//inner print loop     
            
            System.out.println();
            
        }//outer print loop
        
    }//end generic print method
    
    public static void priceSelectMap(int[][] seatMap, int userSelection) 
    {//print method, used by seatByPrice method
        int row, column;        
       
        System.out.println("   01 02 03 04 05 06 07 08 09 10");//print column numbers
        System.out.println("   -----------------------------");//print column numbers
        
        for(row=0; row<8; row++)
        {//outer print loop
            System.out.print(String.format("%02d",row+1));
            System.out.print("|");//print row numbers
            
            for(column=0; column<10; column++)
            {//inner print loop
                
                if(seatMap[row][column] == userSelection)
                {
                    System.out.print(seatMap[row][column]);
                    System.out.print(" ");                    
                }
                
                else
                {
                    System.out.print("   ");
                }
            }//inner print loop     
            
            System.out.println();
            
        }//outer print loop

    }//end print method, used by seatByPrice method
    
    public static int seatByPrice(int[][] seatMap)
    {
        Scanner userIn = new Scanner(System.in);
        int chosenPrice;
        int seatNumber=0;
        
        System.out.print("Please enter a price (10, 20, 30, 40, 50): ");
        chosenPrice = userIn.nextInt();
        System.out.println();
        
        priceSelectMap(seatMap, chosenPrice);
        
        return seatNumber;
    }//end of seat by price
    
    public static int seatByCoord(int[][] seatMap)
    {

        return 0;        
    }//end of seat by price
}
