import java.lang.*;
/**
 * Processes first and last letters of words
 */
public class StartToFinish
{
    private String phrase;
    /**
     * Constructs a StartToFinish objec
     * @param myString the phase for this object
     */
    public StartToFinish(String myString)
    {
        phrase = myString;
    }

    /** 
     * get the first letter from everyword and make a string
     * @return the string which contains the first letter of every words.
     */
    public String firstLetters()
    {
        String word = phrase.substring(0,1);
        if (phrase.equals(""))
        {
            return "";
        }else 
        { 
            for(int i = 0; i < phrase.length(); i++)
            {
                if (phrase.substring(i,i+1).equals(" "))
                { 
                    word = word + phrase.substring(i+1,i+2);
                }
            }
            return word;
        } 
    }

    /**
     * get the last letter of every word with containing the character and make a string 
     * @return the string containing the last letter of every words
     */
    public String lastLetters()
    {
        String word = "";
        if (phrase.equals(""))
        {
            return "";
        }else 
        { 
            for(int i = 0; i < phrase.length(); i++)
            {
                if (phrase.substring(i,i+1).equals(" "))
                { 
                    if(Character.isLetter(phrase.charAt(i-1)))
                    {
                        word = word + phrase.substring(i-1,i);
                    }else
                    {
                        word = word + phrase.substring(i-2,i-1);
                    }
                }
            }
            if(Character.isLetter(phrase.charAt(phrase.length()-1)))
            {return word+ phrase.substring(phrase.length()-1);
            }else
            {return word+ phrase.substring(phrase.length()-2,phrase.length()-1);
            }
        }
    }
}