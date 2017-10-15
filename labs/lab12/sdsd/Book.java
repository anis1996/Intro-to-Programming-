/**
 * book class which orders book by genre in alphabetical if genre is the same it is ordered by title in alphabetical
 */
public class Book implements Comparable 

{
    private String title;
    private String genre;
    /**
     * intialize the title and genre of Book 
     * @param name to intilize the name 
     * @param genre to intiliaze the genre
     */
    public Book( String name, String genre)
    {
        title = name;
        this.genre = genre; 
    }

    /**
     * get the titile of the book 
     * @return the title of the book 
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * get the genre of the book 
     * @return the genre of the book 
     */
    public String getGenre()
    {
        return genre; 
    }

    @Override
    public int compareTo(Object otherObject)
    {
        Book book = (Book) otherObject;
        if(this.getGenre().compareTo(book.getGenre()) != 0)
        {
            return this.getGenre().compareTo(book.getGenre());
        }else
        {
            return this.getTitle().compareTo(book.getTitle());
        }
    }
}