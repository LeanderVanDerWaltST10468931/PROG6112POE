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
    
    public Series(String SeriesID, String SeriesName, String SeriesAge, String SeriesNumberOfEpisodes)
    {
        this.SeriesID.add(SeriesID);
        this.SeriesName.add(SeriesName);
        this.SeriesAge.add(SeriesAge);
        this.SeriesNumberOfEpisodes.add(SeriesNumberOfEpisodes);
        counter += 1;
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
        }
        else
        {
            System.out.println("You have entered an incorrect series age!!!\n"
                    + "Please re-enter the series age >>");
        }
        
        
    }
    
    public void SearchSeries(String SeriesID)
    {
        int searchPos = this.SeriesID.indexOf(SeriesID);
        
        if (searchPos != -1)
        {
            System.out.println("\n ------------------\n"
                + "SERIES ID: " + this.SeriesID.get(searchPos) + "\n"
                + "SERIES NAME: " + SeriesName.get(searchPos) + "\n"
                + "SERIES AGE RESTRICTION: " + SeriesAge.get(searchPos) + "\n"
                + "SERIES NUMBER OF EPISODES: " + SeriesNumberOfEpisodes.get(searchPos) + "\n"
                + "-------------------\n");
        }        
        else
            System.out.println("\n ------------------\n"
                + "Series with ID " + SeriesID + " was not found!\n"
                + "-------------------\n");
    }
    
    public void UpdateSeries(String SeriesID, String SeriesName, String SeriesAge, String SeriesNumberOfEpisodes)
    {
        this.SeriesID.set(counter, SeriesID);
        this.SeriesName.set(counter, SeriesName);
        this.SeriesAge.set(counter, SeriesAge);
        this.SeriesNumberOfEpisodes.set(counter, SeriesNumberOfEpisodes);
        counter -=1;
    }
    
    public void DeleteSeries()
    {
        SeriesID.remove(counter);
        SeriesName.remove(counter);
        SeriesAge.remove(counter);
        SeriesNumberOfEpisodes.remove(counter);
        counter -=1;
    }
    
}
