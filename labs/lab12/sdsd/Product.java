/**
 * Models a Product that can increase and decrease in price
 */
public class Product implements Comparable 
{
    private double price;
    private String name;

    /**
     * Constructs a Product with a price and a description
     * @param thePrice the price of this Product
     * @param name - the name of this product
     */
    public Product( String name,double price)
    {
        this.price = price;
        this.name = name;  
    }

    /**
     * Gets the price
     * @return the price of this Ptoduct object
     */
    public double getPrice()
    {
        return price;
    }

    /**
     * Gets the name
     * @return the name of the Product object
     */
    public String getName()
    {
        return name;
    }

    /**
     * Reduces the price of this product by the give percentage
     * @param percent the percentage to reduce the priice by
     */
    public void reducePrice(double percent)
    {
        double reduction = price * percent / 100;
        price = price - reduction;
    }

    /**
     * Increases the price by the given percent
     * @param percent the percent to increase the price by
     */
    public void increasePrice(double percent)
    {
        double increase = price * percent / 100;
        price = price + increase;
    }

    /**
     * compare the object with other object
     * @param otherObject to check with object 
     * @return the -1 if object should come before the otherObject 
     * 1 if object should come after the otherObject
     * 0 if both object are same 
     */
    @Override
    public int compareTo(Object otherObject)
    {
        Product other = (Product) otherObject;
        if(this.getName().compareTo(other.getName()) != 0)
        { 
            return this.getName().compareTo(other.getName());
        }else 
        {
            return Double.compare(this.getPrice(), other.getPrice());
        }
    }

}