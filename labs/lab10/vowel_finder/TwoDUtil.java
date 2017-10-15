import java.util.Arrays;
/**
 * encapsulates a 2d array of Strings and provides method to manupulate it
 */
public class TwoDUtil
{
    private String[][] twoArray ;
    /**
     * intilaize the 2dArray
     * @param array to intilaize the 2dArray
     */
    public TwoDUtil(String[][] array)
    {
        twoArray = array;         
    }

    /**
     * get the shortest string from 2dArray
     * @return shortest string 
     */
    public String shortest() 
    {
        int shor = twoArray[0][0].length();
        String shortest = twoArray[0][0];
        for(int i =0; i<twoArray.length;i++)
        { 
            for(int j=0; j<twoArray[0].length;j++)
            {
                if (twoArray[i][j].length() < shor)
                {
                    shortest = twoArray[i][j];
                    shor = twoArray[i][j].length();
                }
            }
        }
        return shortest;
    }

    /**
     * get the words in lastColumn with diving *   
     * @return words in lastColumn with diving *
     */
    public String lastColumn() 
    {
        String words = twoArray[0][twoArray[0].length-1];
        for(int i =1; i<twoArray.length;i++)
        { 

            words = words + "*" + twoArray[i][twoArray[0].length-1];
        }
        return words;
    }

    /**
     * check the word how many times appear in the 2dArray
     * @param letter to check the words 
     * @return number of words appear in the 2dArray
     */
    public int howMany(char letter)
    {
        int charcter = 0;   
        for(int i =0; i<twoArray.length;i++)
        { 
            for(int j=0; j<twoArray[0].length;j++)
            {
                String word = twoArray[i][j].toLowerCase();
                for(int t = 0; t<word.length();t++)
                {
                    if (letter == word.charAt(t))
                    {
                        charcter++;
                    }

                }
            }
        }
        return charcter;
    }

}