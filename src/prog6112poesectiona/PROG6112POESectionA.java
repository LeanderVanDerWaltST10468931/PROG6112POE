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
        System.out.println("Enter (1) to launch menu or any other key to exit");
        
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.next();
        Series series = new Series();
        boolean repeatOptions = true;
        
        if (input.equals("1"))
        {
            while (repeatOptions)
            {
            System.out.println("Please select one of the following menu items: \n"
                    + "(1) Capture new series.\n"
                    + "(2) Search for a series.\n"
                    + "(3) Update series age restriction.\n"
                    + "(4) Delete a series.\n"
                    + "(5) Print series report - 2025\n"
                    + "(6) Exit Application");
            
            input = scanner.next();
            String seriesID;
            String seriesName;
            String seriesAge = "";
            int seriesAgeNumber = 0;
            String seriesNumberOfEpisodes;
            boolean repeatAgeInput = true;
            
            switch (input)
            {
                case "1":
                { 
                    System.out.print("CAPTURE A NEW SERIES\n"
                    + "******************************\n"
                    + "Enter the series id: ");
                    seriesID = scanner.next();
                    
                    System.out.print("Enter the series name: ");
                    seriesName = scanner.next();
                                        
                    System.out.print("Enter the series age restriction: ");
                    while (repeatAgeInput)
                    {
                        seriesAge = scanner.next();
                        try
                        {
                            seriesAgeNumber = Integer.parseInt(seriesAge);
                        }
                        catch(Exception e)
                        {
                            System.out.println("Please input a number for the age.");
                        }
                        
                        if ((seriesAgeNumber >= 2) && (seriesAgeNumber <= 18))
                        {
                            repeatAgeInput = false;
                        }
                        else 
                        {
                            System.out.print("You have entered the incorrect series age!!!"
                                    + "\nPlease re-enter the series age >> ");
                            
                        }
                    }
                    
                    System.out.print("Enter the number of episodes for " +  seriesName + ": ");
                    seriesNumberOfEpisodes = scanner.next();
                    
                    series.CaptureSeries(seriesID, seriesName, seriesAge, seriesNumberOfEpisodes, repeatAgeInput);
                    break;
                }
                case "2": 
                {
                    System.out.print("Enter the series id to search: ");
                    seriesID = scanner.next();
                    System.out.print("------------------------------\n");
                    
                    try 
                    {
                       System.out.println(series.SearchSeries(seriesID));
                    }
                    catch(Exception e)
                    {
                        System.out.println("Series with id " + seriesID + " was not found!\n"
                                + "------------------------------");
                    }
                    break;
                }
                case "3":
                {
                    System.out.print("Enter the series id to update: ");
                    seriesID = scanner.next();
                    
                    if (series.TestID(seriesID) != -1)
                    {
                        System.out.print("Enter the series name: ");
                        seriesName = scanner.next();
                    
                         System.out.print("Enter the series age restriction: ");
                         seriesAge = scanner.next();
                    
                         System.out.print("Enter the number of episodes: ");
                            seriesNumberOfEpisodes = scanner.next();
                    
                          series.UpdateSeries(seriesID, seriesName, seriesAge, seriesNumberOfEpisodes);
                    
                    }
                    else
                         System.out.println("Series with id " + seriesID + " was not found!\n"
                            + "------------------------------");
                    
                    
                    break;
                }
                case "4":
                {
                    System.out.print("Enter the series id to delete: ");
                    seriesID = scanner.next();
                    
                    if (series.TestID(seriesID) != -1)
                    {
                        System.out.println("Are you sure you want to delete series" + seriesID
                            + "from the system? Yes (y) to delete");
                        
                        if (scanner.next().equals("y"))
                        {
                            series.DeleteSeries(seriesID);
                            System.out.println("------------------------------\n"
                                    + "Series with Series id: " + seriesID + " WAS deleted!\n"
                                            + "------------------------------");
                        }
                        else
                            System.out.println("Series with id: " + seriesID + " was not deleted");
                        
                    }
                    else
                        System.out.println("Series with id " + seriesID + " was not found!\n"
                            + "------------------------------");
                    
                }
                case "5":
                {   
                    if (series.counter > 0)
                        series.DisplaySeries();
                    else
                        System.out.println("No series have been added yet!");
                }
                case "6": System.exit(0);  
                default : System.out.println("Code not found, please enter a valid one.");
            }
            
            System.out.println("Enter (1) to launch menu or any other key to exit");
            input = scanner.next();
            if (input.equals("1"))
            {
                
            }
            else
                System.exit(0);
            
            }
        }
        else 
        {
            System.exit(0);
        }
        
    }
    
}
