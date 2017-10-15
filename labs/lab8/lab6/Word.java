public class Word
{
   private String text;

   /**
      Constructs a word.
      @param text the characters in this word
   */
   public Word(String text)
   {
      this.text = text;
   }

   /**
      Tests whether a letter is a vowel
      @param letter a string of length 1
      @return true if letter is a vowel
    */
   public boolean isVowel(String letter)
   {
      return "aeiouy".contains(letter.toLowerCase());
   }

   public int countVowels()
   {
      int i = 0;
      int counter = 0;
      boolean b = false;
      while (i < text.length())
      {
         String letter = text.substring(i, i + 1); 
         if (isVowel(letter))
         {  
             if (!b)
             {
              counter++;
                 b = true;
                }
             
            }else {
                b = false;
            }
            i++;// the ith letter
         // Your work here

      }
      return counter;
   }

   public int countVowelGroups()
   {
        int i = 0;
      int counter = 0;
      boolean b = false;
       while (i < text.length())
      {
         String letter = text.substring(i, i + 1); 
         if (isVowel(letter))
         {  
             if (!b)
             {
              counter++;
                 b = true;
                }
             
            }else {
                b = false;
            }
            i++;// the ith letter
         // Your work here

      }
            return counter;// the ith letter
         // Your work here

   }
   
   public String toString()
   {
      return text;
   }
}