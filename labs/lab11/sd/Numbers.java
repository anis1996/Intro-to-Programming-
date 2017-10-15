public class Numbers
{
    /**
    Computes the number of even and odd values in a given array
    @param values an array of integer values
    @return an array of length 2 whose 0 entry contains the count
    of even elements and whose 1 entry contains the count of odd
    values
     */
    public static int[] evenOdds(int[] values)
    {
        int[] s = new int[2];
        int oddcounter = 0;
        int evencouner = 0;
        for (int i = 0; i < values.length ; i++) 
        {
            if (values[i] % 2 == 0)
            {
                evencouner++;
            }else
            {
                 oddcounter++;
            }
        }
       s[0] = evencouner ;
       s[1] = oddcounter;
        return s;
    }
}