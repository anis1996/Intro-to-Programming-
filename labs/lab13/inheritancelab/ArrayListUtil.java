import java.util.ArrayList;

public class ArrayListUtil
{
    /**
    Removes adjacent duplicates from an array list of strings.
    @param word an array list of strings
     */
    public static void removeAdjacentDuplicates(ArrayList<String> words)
    {

        for(int i = 1 ; i < words.size() ;i++)
        {
            if(words.get(i-1).equals(words.get(i)))
            {
                words.remove(words.get(i));
                if(words.get(i-1).equals(words.get(i)))
                {
                    words.remove(words.get(i));
                }
            }else
            {

            }
        }

    }
}