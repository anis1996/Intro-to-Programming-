/**
 * book class is the subclass of product which has couple method to oprate the book class like getauthor and getdescription
 */
public class Book extends Product
{
    private String author;
    /**
     * intialize the desripstion, price and author 
     * @param description to intialize 
     * @param price to intilaize 
     * @param author to intilaize 
     */
    public Book(String description, double price, String author)
    {
        super(description,price);
        this.author = author;       
    }

    /**
     * check the author of two books is same 
     * @param other to check the author 
     * @return the false if author aren't same and true if author are same.
     */
    public boolean sameAuthor(Book other)
    {
        return false;   
    }
}