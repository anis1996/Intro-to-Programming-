/**
 * create a class of book which give the book name and price and set new name and price
 *  and get the price and name
 */
public class Book
{
    String bookName ; 
    Double bookPrice;
    /**
     * intialize the bookname and price of book 
     * @param name to give name 
     * @param price to give price to book 
     */
    public Book(String name , double price)
    {
        bookName = name ; 
        bookPrice = price ; 
    }

    /**
     * set the new price of book 
     * @param newPrice to set the price
     */
    public void setPrice(double newPrice)
    {
        bookPrice = newPrice;
    }

    /**
     * set the title of book 
     * @param title to set new name of book 
     */
    public void setTitle(String title)
    {
        bookName = title;
    }

    /**
     * get the price of book
     * @return price of book 
     */
    public double getPrice()
    {
        return bookPrice ;
    }

    /**
     * get the name of book 
     * @return name of book 
     */
    public String getTitle()
    {
        return bookName;
    }
}
