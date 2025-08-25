package prog6112poesectionb;

/**
 * @author leander van der Walt
 */

public class Book extends Author
{
    private String BookName;
    private String YearPublished;
    private String ISBN;
    private int AmountOfPages;
    
    public String getBookName()
    {
        return BookName;
    }
    
    public void setBookName(String BookName)
    {
        this.BookName = BookName;
    }
    
    public String getYearPublished()
    {
        return YearPublished;
    }
    
    public void setYearPublished(String YearPublished)
    {
        this.YearPublished = YearPublished;
    }
    
    public String getISBN()
    {
        return ISBN;
    }
    
    public void setISBN(String ISBN)
    {
        this.ISBN = ISBN;
    }
    
    public int getAmountOfPages()
    {
        return AmountOfPages;
    }
    
    public void setAmountOfPages(int AmountOfPages)
    {
        this.AmountOfPages = AmountOfPages;
    }
}
