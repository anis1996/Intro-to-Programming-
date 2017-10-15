public class ArrayUtil
{
   /**
      Computes the sum of a given row in a two-dimensional array. 
      @param values the array
      @param the row whose sum to compute
      @return the sum of the given row
   */
   public static int rowSum(int[][] values, int row) 
   {
      int[][] s;
      s = values;
     
      int w = 0;
  
      for ( int i = 0;  i < s[row].length;i++)
      {
        w = w + s[row][i];
        
      }
      return w;
      }
   }

