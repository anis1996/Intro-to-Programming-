/**
 * a shoppingcart has a subtotal that can be changed by add and remove item's cost and contents list which give items list add and remove from shoppingcart.
 */
public class ShoppingCart
{
    private double subTotal;
    private String contents;
    /**
     * construct a shoppingcart with a zero subtotal and zero item in contents.
     */    
    public ShoppingCart()
    {   
        subTotal=0;
        contents = "";
    }

    /**
     * add cost into the subtotal of shoppingcart and modify contents list with given string.
     * @param cost the cost to add in subtotal.
     */
    public void add(double cost)
    {
        if (cost > 0)
        {
        subTotal= subTotal + cost;        
        contents = contents + "Add Item: " + cost + "\n";
        }else 
        {
            contents = contents + "No item added: " + "\n";
        }

    }

    /**
     * remove cost from the subtotal of shoppingcart and modify the contents list with given string.
     * @param cost the cost to remove from subtotal.
     */
    public void remove(double cost)
    {
        if (cost > 0)
        {
        subTotal = subTotal - cost ;
        contents = contents + "Remove Item: " + cost + "\n";
        }else 
        {
            contents = contents + "No item removed: " + "\n"; 
        }

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
        final double TAX_PERSENT = 8.5;
        double total = subTotal + subTotal * TAX_PERSENT / 100;
        return total;

    }

    /**
     * get the list of the add and remove items with total at the end
     * @return contents get the contents of items and total
     */
    public String getContents(){

        return contents + "Total: " + this.getTotal() + "\n";

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
