/**
 * a shoppingcart has a subtotal that can be changed by add and remove item's cost and give name of the content list of the add and remove item's list
 */
public class ShoppingCart
{
    private double subTotal;
    public static final double TAX_PERSENT = 8.5;
    private double total;
    private String contents;
    /**
     * construct a shoppingcart with a zero subtotal
     */    
    public ShoppingCart()
    {   
        subTotal=0;
        contents = "";
    }

    /**
     * add cost into the subtotal of shoppingcart.
     * @param cost the cost to add in subtotal.
     */
    public void add(double cost)
    {
        subTotal= subTotal + cost;
        String addItem = "Add Item: ";
        contents = contents + addItem + cost+"\n";

    }

    /**
     * remove cost from the subtotal of shoppingcart.
     * @param cost the cost to remove from subtotal.
     */
    public void remove(double cost)
    {
        subTotal = subTotal - cost ;
        String removeItem ="Remove Item: ";
        contents = contents + removeItem + cost+"\n";

    }

    /**
     * get the current subtotal of the shoppingcart.
     * @return the current subtotal
     */
    public double getSubtotal()
    {     
        return subTotal;
    }

    /**
     * get total with tax 
     * @return total with tax
     */
    public double getTotal(){
        total = subTotal + subTotal * TAX_PERSENT / 100;
        return total;

    }

    /**
     * get the list of the add and remove items with total at the end
     * @return contents get the contents of items and total
     */
    public String getContents(){
        this.getTotal();
        return contents + "Total: " + total +"\n";

    }

    /**
     * reset the contents list to nothing and subtotal to 0
     * 
     */
    public void reset(){
        contents = "";
        subTotal = 0;

    }
}

