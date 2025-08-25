package prog6112poesectionb;

/**
 * @author leander van der Walt
 */

public class Author extends Library
{
    private String AuthorName;
    private int AmountOfBooks;
    private int AuthorAge;
    
    public String getAuthorName()
    {
        return AuthorName;
    }
    
    public void setAuthorName(String AuthorName)
    {
        this.AuthorName = AuthorName;
    }
    
    public int getAmountOfBooks()
    {
        return AmountOfBooks;
    }
    
    public void setAmountOfBooks(int AmountOfBooks)
    {
        this.AmountOfBooks = AmountOfBooks;
    }
    
    public int getAuthorAge()
    {
        return AuthorAge;
    }
    
    public void setAuthorAge(int AuthorAge)
    {
        this.AuthorAge = AuthorAge;
    }
    
}
