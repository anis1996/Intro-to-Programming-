import java.util.Arrays;
import java.util.ArrayList;
/**
 * encapsulates a array and arraylist  and provides method to manupulate it
 */
public class Util
{
    /**
     * check the all element in the given array and find maximu value
     * @param array to check the array 
     * @return the maximum value in array 
     */
    public static int max(int[] array)
    {
        int largest = array[0]; 
        for (int i = 0; i < array.length ; i++)
        {
            if (array[i] > largest)
            {
                largest = array[i];
            }
        }
        return largest;
    }

    /**
     * check the given string is in array or not 
     * @param array to check the list 
     * @param target to check the word is in array or not 
     * @return the boolean with false or true
     */
    public static boolean contains(String[] array, String target)
    {
        boolean contains = false;
        for (int i = 0; i < array.length ; i++)
        {
            if (array[i].equals(target))
            {
                contains = true;
            }
        }
        return contains;
    }

    /**
     * check the arraylist and get the string which start from given letter 
     * @param list to check the arraylist 
     * @param letter to check and see  how many words start from that character
     * @return the arraylist including all words which start from given character.
     */
    public static ArrayList<String> wordsStartingWith(ArrayList<String> list, char letter)
    {
        ArrayList<String> newWords = new ArrayList<String>() ;
        for (int i = 0; i < list.size();i++)
        {

            if((list.get(i).toUpperCase().charAt(0) == letter) || (list.get(i).toLowerCase().charAt(0) == letter) )
            {
                newWords.add(list.get(i));
            }
        }
        return newWords;
    }

}