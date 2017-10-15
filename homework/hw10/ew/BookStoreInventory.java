import java.util.ArrayList;
/**
 * sdsidis
 */
public class BookStoreInventory
{
    ArrayList<Book> bookStore;
    /**
     * intialize the instance variabel 
     */
    public BookStoreInventory()
    {
        bookStore = new ArrayList<Book>();
    }

    /**
     * add the book into bookStore 
     * @param book to add 
     */
    public void add(Book book)
    {
       
        bookStore.add(book);
    }

    /**
     * remove the book from book store 
     * @param name to remove 
     */
    public void remove(Book name)
    {
        boolean check = false;
        for(int i = 0; i < bookStore.size() ; i++)
        {
            if (bookStore.get(i).getTitle().equals(name) && !check)
            {
                bookStore.remove(i);
                check = true;
            }

        }
    }

    /**
     * check the bookStore and see there is a given book or not 
     * @param name to check 
     * @return the false or true 
     */
    public boolean contains(Book name)
    {
        boolean contains = false;
        for(int i = 0; i < bookStore.size() ; i++)
        {
            if (bookStore.get(i).getTitle().equals(name))
            {
                contains = true;
            }
        }
        return contains;
    }

    /**
     * get the list of all books 
     * @return the list of all books
     */
    public ArrayList<Book> list()
    {
        return bookStore;
    }
}