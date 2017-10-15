public class StringScrambler
{
    private String lastWord;
   public String scramble(String word)
   {
       String word1;
       String word4;
       String word3;
       String word5;
       String word2;
       int i;
       i = randomInt(1, word.length()-2);
       word1 = word.substring(word.length()-1,word.length());
       word2 = word.substring(i+1,word.length()-i-1);
       word3 = word.substring(0,1);
       word4 = word.substring(i,i+1);
       word5 = word.substring(word.length()-(i+1),word.length()-i);
       
      lastWord = word3 + word5 + word2 + word4 + word1;
      
      return lastWord;
   }

   /**
      Returns a random integer between begin and pastEnd - 1
      @param begin the lower bound (inclusive)
      @param end the upper bound (exclusive)
   */
   public int randomInt(int begin, int pastEnd)
   {
      return begin + (int)((pastEnd - begin) * Math.random());
   }

   /**
      Scrambles all words of length > 3 in a given sentence, after stripping off 
      white space and punctuation marks (except for '). Do not look inside this
      method. If you do, be sure to avert your eyes from the split method call, or permanent eye damage may occur.
      @param sentence a string consisting of one or more words
      @return the string witht the words scrambled
   */
   public String scrambleSentence(String sentence)
   {
      String result = "";
      for (String w : sentence.split("[\\s\\p{Punct}&&[^']]+"))
      {
         String r;
         if (w.length() > 3) r = scramble(w);
         else r = w;
         result = result + r + " ";
      }

      return result;
   }

}