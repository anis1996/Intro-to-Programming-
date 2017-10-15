import java.util.Arrays;
/**
 * Encapsulates an integr array and provides methods
 * to manipulate it
 */
public class NumberArray
{
    private int[] data;
    /**
     * intilaize the array 
     * @param data to intilaize the data 
     */
    public NumberArray(int[] data)
    {
        this.data = data;
    }

    /**
     * get the last element in the array 
     * @return the last element 
     */
    public int getLast()
    {
        return data[data.length-1] ;
    }

    /**
     * swap the elements 
     * @param index1 to swap with index2
     * @param index2 to swap with index1
     */
    public void swap(int index1, int index2)
    {

        if (index1<data.length && index2<data.length &&index1>= 0 && index2>=0)
        {
            int a = data[index1] ; 
            data[index1] = data[index2];
            data[index2] = a;
        }
    }

    /**
     * check the element is in the array or not 
     * @param target to check element 
     * @return boolean false if there is not any mathcing array 
     */
    public boolean contains(int target)
    {
        int a = 0;
        for (int i = 0; i<data.length;i++)
        { 
            if (data[i] == target)
            {
                a++;
            }
        }
        if (a!=0)
        {
            return true;
        }else 
        {
            return false;
        }

    }

    /**
     * get the product of array 
     * @return the product of array 
     */
    public int product()
    {
        int product = 1;
        for (int i = 0; i < data.length; i++)
        {
            product = product * data[i];
        }
        return product;
    }

    /**
     *@return the String 
     */

    @Override
    public String toString()
    {
        return Arrays.toString(data);
    }
}
