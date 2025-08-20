package prog6112poesectiona;

/**
 * @author leander van der Walt ST10468931
 */

import java.util.ArrayList;

public class Series 
{
    public int counter =0;
    public ArrayList<String> SeriesID = new ArrayList<String>();
    public ArrayList<String> SeriesName = new ArrayList<String>();
    public ArrayList<String> SeriesAge = new ArrayList<String>();
    public ArrayList<String> SeriesNumberOfEpisodes = new ArrayList<String>();
    
    
    public int TestID(String SeriesID)
    {
        return this.SeriesID.indexOf(SeriesID);
    }
    
    public void CaptureSeries(String SeriesID, String SeriesName, String SeriesAge, String SeriesNumberOfEpisodes, boolean repeatAge)
    {   
        
        if ((Integer.parseInt(SeriesAge) >= 2) && (Integer.parseInt(SeriesAge) <= 18))
        {
            this.SeriesID.add(SeriesID);
            this.SeriesName.add(SeriesName);
            this.SeriesAge.add(SeriesAge);
            this.SeriesNumberOfEpisodes.add(SeriesNumberOfEpisodes);
            counter += 1;
            repeatAge = false;
            System.out.println("Series processed successfully!!!");
        }
        else
        {
            System.out.println("You have entered an incorrect series age!!!\n"
                    + "Please re-enter the series age >>");
        }
        
        
    }
    
    public String SearchSeries(String SeriesID)
    {
        int searchPos = this.SeriesID.indexOf(SeriesID);
        
        if (searchPos != -1)
        {
            return ("------------------------------\n"
                + "SERIES ID: " + this.SeriesID.get(searchPos) + "\n"
                + "SERIES NAME: " + SeriesName.get(searchPos) + "\n"
                + "SERIES AGE RESTRICTION: " + SeriesAge.get(searchPos) + "\n"
                + "SERIES NUMBER OF EPISODES: " + SeriesNumberOfEpisodes.get(searchPos) + "\n"
                + "------------------------------\n");
        }        
        else
            return("Series with id " + SeriesID + " was not found!\n"
                + "------------------------------");
    }
    
    public void UpdateSeries(String SeriesID, String SeriesName, String SeriesAge, String SeriesNumberOfEpisodes)
    {
        int searchPos = this.SeriesID.indexOf(SeriesID);
        
        if (searchPos != -1)
        {
            this.SeriesName.set(counter, SeriesName);
            this.SeriesAge.set(counter, SeriesAge);
            this.SeriesNumberOfEpisodes.set(counter, SeriesNumberOfEpisodes);
        }
        else
            System.out.println("Series with id " + SeriesID + " was not found!\n"
                + "------------------------------");
    }
    
    public void DeleteSeries(String SeriesID)
    {
        int searchPos = this.SeriesID.indexOf(SeriesID);
        
        if (searchPos != -1)
        {
            this.SeriesID.remove(counter);
            this.SeriesName.remove(counter);
            this.SeriesAge.remove(counter);
            this.SeriesNumberOfEpisodes.remove(counter);
            this.counter -=1;
        }
    }
    
    public void DisplaySeries()
    {
        for (int counter =0; counter <= this.counter; counter++)
        {
            System.out.println("Series " + counter + "\n"
                    + "------------------------------\n"
                    + "SERIES ID: " + this.SeriesID.get(counter) + "\n"
                    + "SERIES NAME: " + this .SeriesName.get(counter) + "\n"
                    + "SERIES AGE RESTRICTION: " + this.SeriesAge.get(counter) + "\n"
                    + "NUMBER OF EPISODES: " + this.SeriesNumberOfEpisodes.get(counter) + "\n"
                    + "------------------------------");
        }
    }
    
}
