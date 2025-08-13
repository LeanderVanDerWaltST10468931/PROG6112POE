package prog6112poesectiona;

/**
 * @author leander van der Walt ST10468931
 */

import java.util.Scanner;

public class PROG6112POESectionA
{


    public static void main(String[] args) 
    {
        System.out.println("LATEST SERIES - 2025");
        System.out.println("******************************");
        System.out.println("Enter (1) to launch menu or any other key to exit\n");
        
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.next();
        
        if (input.equals("1"))
        {
            System.out.println("Please select one of the following menu items: \n"
                    + "(1) Capture new series.\n"
                    + "(2) Search for a series.\n"
                    + "(3) Update series age restriction.\n"
                    + "(4) Delete a series.\n"
                    + "(5) Print series report - 2025\n"
                    + "(6) Exit Application");
            
            input = scanner.next();
            
            switch (input)
            {
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6": System.exit(0);  
                default : System.out.println("Code not found, please enter a valid one.");
            }
        }
        else 
        {
            System.exit(0);
        }
        
    }
    
}
