/**
 * Object for finding vowels
 */
public class VowelFinder
{
    String word;
    /**
     * Constructs a word.
     * @param newWord the word to be analyzed 
     */
    public VowelFinder(String newWord)
    {
        word = newWord;
    }

    /**
     * Cumulates all vowels of a word together into a string.
     * @return string with all the vowels of a word
     */
    public String findVowels()
    {
        String vowels = "aeiouyAEIOUY";
        String result = "";
        int i = 0;
        
        while (i < word.length())
        {
            String letter = word.substring(i, i + 1);
            if (vowels.contains(letter))
            {
               
                result = result + letter;
            }
            i++;
        }
        return result;
    }
}