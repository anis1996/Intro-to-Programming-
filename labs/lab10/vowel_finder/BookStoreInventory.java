import java.util.ArrayList;
/**
 * create a bookstore class which has method like add book, remove book and check if there is book of specific name or not.
 */
public class BookStoreInventory
{
    private ArrayList<String> bookStore;
    /**
     * intialize the instance variabel 
     */
    public BookStoreInventory()
    {
        bookStore = new ArrayList<String>();
    }

    /**
     * add the book into bookStore 
     * @param book to add 
     */
    public void add(Book book)
    {
        String bookName = book.getTitle();
        bookStore.add(bookName);
    }

    /**
     * remove the book from book store 
     * @param name to remove 
     */
    public void remove(String name)
    {
        boolean check = false;
        for(int i = 0; i < bookStore.size() ; i++)
        {
            if (bookStore.get(i).equals(name) && !check)
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
    public boolean contains(String name)
    {
        boolean contains = false;
        for(int i = 0; i < bookStore.size() ; i++)
        {
            if (bookStore.get(i).equals(name))
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
    public ArrayList<String> list()
    {
        return bookStore;
    }
}