/**
 * Models a building sold by Java Builders inc.
 */
public class JavaBuilding
{
    public static final int SQUARE_FEET_PER_GALLON = 400;
    public static final double COST_PER_GALLON = 32.27;
    private double x;
    
    /**
     * Constructs an object with the given dimension
     * @param side the height of the cube
     */
    public JavaBuilding(double dimension )
    {
        if (dimension >= 0)
        {
            x = dimension;
        }else 
        {
            x = 0;
        }
    }
    
    /**
     * Gets the surface area of the paintable surface
     * @return the surface area
     */
    public double getSurfaceArea()
    {
        double area = 10*(x)*x;
        return area;
    }
    
    /**
     * Gets the cost to paint the building
     * @return the cost
     */
    public double getCost()
    {
        return getSurfaceArea() / SQUARE_FEET_PER_GALLON * COST_PER_GALLON;
    }
    
    /**
     * Increases the size of the height of the square
     * @param amount the anount to increase by
     */
    public void increaseSide(double amount)
    {
        if (amount > 0 )
        {
            this.x = this.x + amount;
        }
    }
}