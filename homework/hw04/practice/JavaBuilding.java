/**
 * compute the total cost of painting the JavaBuilding 
 */
public class JavaBuilding
{
   
    private double x;
    private double area;
    private double totalCost;
    /**
     * constructs a JavaBuliding with given dimension
     * @param dimension the dimension of Javabuilding 
     */
    public JavaBuilding(double dimension){
        this.x = dimension;

    }

    /**
     * get the surface area of the JavaBuilding 
     * @return the surface area
     */
    public double getSurfaceArea(){
       
        return area;
    }

    /**
     * get total cost of painting the Javabuilding 
     * @return total cost of painting 
     */
    public double getCost(){
       
        return totalCost;
    }

    /**
     * increase the size of dimension by given amount
     * @param amount amount to add in dimension
     */
    public void increaseSide(double amount){
       
    }

}