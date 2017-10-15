/**
 * a shoppingcart has a subtotal that can be changed by add and remove item's cost.
 */
public class ShoppingCart
{
    private double subTotal;
    /**
     * construct a shoppingcart with a zero subtotal
     */    
    public ShoppingCart()
    {   
        subTotal=0;
    }

    /**
     * add cost into the subtotal of shoppingcart.
     * @param cost the cost to add in subtotal.
     */
    public void add(double cost)
    {
        subTotal= subTotal + cost;
    }

    /**
     * remove cost from the subtotal of shoppingcart.
     * @param cost the cost to remove from subtotal.
     */
    public void remove(double cost)
    {
        subTotal = subTotal - cost ;

    }

    /**
     * get the current subtotal of the shoppingcart.
     * @return the current subtotal
     */
    public double getSubtotal()
    {
        return subTotal;
    }

}