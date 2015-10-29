
/**
 * This creates an Item object needed to help kill Dracula or Monster.
 * 
 * @author Maria Langman 
 * @version 2015.10.28
 */
public class Item
{
    //name of the item
    private String name;
    // weight of power from this item
    private int power;

    /**
     * Constructor for objects of class Item
     */
    public Item(String name, int power)
    {
        // initialise instance variables
        this.name = name;
        this.power = power;
    }

    /**
     * return the name of the Item object
     * @return name
    */
    public String getItemName()
    {
        return name;
    }
    
     /**
     * return the power of the Item object
     * @return power
    */
    public int getItemPower()
    {
        return power;
    }
    
    /**
     * set the name of the Item object
     * @param name
    */
    public void setItemName(String name)
    {
        this.name = name;
    }
    
     /**
     * set the power of the Item object
     * @param power
    */
    public void setItemPower(int power)
    {
        this.power = power;
    }
}
