import java.util.ArrayList;
/**
 * Models a list of vocabulary words
 */
public class Vocab
{
    private ArrayList<String> words = new ArrayList<String>(); 
    /**
     * intialize the array list 
     * @param word intialiaze the words array list.
     */
    public Vocab(ArrayList<String> word)
    {
        words = word;
    }

    /**
     * get the longest word from words
     * @return the longest word 
     */
    public String longest()
    {
        if (words.size()!= 0)
        {
            String longest = "";
            for (int i = 0 ; i < words.size(); i++)
            {
                if (words.get(i).length()> longest.length())
                {
                    longest = words.get(i);

                }
            }
            return longest;
        }else 
        {
            return null;
        }
    }

    /**
     * get the avaereage length of the words of arraylist 
     * @return the number of average length of words
     */
    public double averageLength()
    {
        if (words.size()!= 0)
        {
            double average = 0;
            for (int i = 0 ; i < words.size(); i++)
            {
                average = average + words.get(i).length();
            }
            return average/(words.size());

        }else
        {
            return 0;
        }
    }

    /**
     * remove the String from the arraylist 
     * @param target to remove from array list  
     */
    public void remove (String target)
    {
        for (int i = 0 ; i < words.size(); i++)
        {
            if (words.get(i).equals(target))
            {
                words.remove(i);
            }
        }
    }

    /**
     * get the string of 
     * @return String after removing words
     */
    @Override
    public String toString()
    {
        return words.toString();
    }
}