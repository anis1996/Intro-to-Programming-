public class Word
{
    /**
    Tests whether a letter is a vowel
    @param letter a string of length 1
    @return true if letter is a vowel
     */
    public boolean contains(String str)
    {  String letter1 = str.toLowerCase();
       if (letter1.contains("a") || letter1.contains("e") || letter1.contains("i") || letter1.contains("o") || letter1.contains("y") ) 
        {return true;
        }else
        {
            return false;
        }
        
    }
}
