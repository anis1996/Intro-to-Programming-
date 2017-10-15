public class Book 
{
    private String title;
    private String genre;
    public Book( String name, String genre)
    {
        title = name;
        this.genre = genre; 
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getGenre()
    {
        return genre; 
    }
}