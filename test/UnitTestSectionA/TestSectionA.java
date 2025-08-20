package UnitTestSectionA;

/**
 * @author leander van der Walt ST10468931
 */

import org.junit.Test;
import prog6112poesectiona.PROG6112POESectionA;
import prog6112poesectiona.Series;
import static org.junit.Assert.*;


public class TestSectionA 
{
    Series series = new Series();
    
    @Test
    public void testSearchSeries()
    {
        series.CaptureSeries("4", "TestName", "15", "10", false);
        String result = series.SearchSeries("4");
        
        assertEquals("Values do not match", "------------------------------\n"
                + "SERIES ID: 4\n"
                + "SERIES NAME: TestName\n"
                + "SERIES AGE RESTRICTION: 15\n"
                + "SERIES NUMBER OF EPISODES: 10\n"
                + "------------------------------\n", result);
    }
    
    @Test
    public void testSearchSeries_SeriesNotFound()
    {
        series.CaptureSeries("4", "TestName", "15", "10", false);
        String result = series.SearchSeries("5");
        
        assertEquals("Values do match", "Series with id 5 was not found!\n"
                + "------------------------------\n", result);
    }
    
    @Test
    public void testUpdateSeries()
    {
        series.CaptureSeries("4", "TestName", "15", "10", false);
        series.UpdateSeries("4", "NewTestName", "18", "5");
        
        assertEquals("Values are not the same", "NewTestName", series.SeriesName.get(0));
    }
    
    @Test
    public void testDeleteSeries()
    {
        series.CaptureSeries("4", "TestName", "15", "10", false);
        series.DeleteSeries("4");
        
        assertEquals("", null, series.SeriesName.get(0));
        
    }
    
    @Test
    public void testDeleteSeries_SeriesNotFound()
    {
        series.CaptureSeries("4", "TestName", "15", "10", false);
        series.DeleteSeries("5");
        
        assertEquals("", "TestName", series.SeriesName.get(0));
    }
    
    @Test
    public void testSeriesAgeRestriction_AgeValid()
    {
        series.CaptureSeries("4", "TestName", "15", "10", false);
        
        assertEquals("", "15", series.SeriesAge.get(0));
    }
    
    @Test
    public void testSeriesAgeRestriction_SeriesAgeInValid()
    {
        series.CaptureSeries("4", "TestName", "20", "10", false);
        
        assertEquals("", "20" , series.SeriesAge.get(0));
    }
}
