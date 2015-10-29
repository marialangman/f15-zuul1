import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;

/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  For each existing exit, the room 
 * stores a reference to the neighboring room.
 * 
 * A "Room" is responsible for storing what Item objects are initially in the room.  A "Room" should be able
 * to store an ArrayList of Items through the add method.  As Van Helsing removes an item from a "Room," 
 * the ArrayList remove method will remove the object.
 * 
 * @author  Michael Kölling and David J. Barnes / edited by Maria Langman 2015.10.28
 * @version 2011.08.09
 */

public class Room 
{
    private String description;
    private String narrativeDescription;
    //private NonplayableChar npc;
    //private ArrayList<Item> items;
    private HashMap<String, Room> exits;        // stores exits of this room.

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * A narrative description describes what Van Helsing sees
     * when using rhe look command inside a room or location.
     * @param description          The room's description.
     */
    public Room(String description) 
    {
        this.description = description;
        //narrativeDescription = null;
        //npc = null;
        //items = null;
        exits = new HashMap<String, Room>();
    }
    
    /**
     * This is a constructor for a location which will also be
     * passed a more detailed description of the scenery given
     * elements of the location itself along with written text
     * for the imagery of Van Helsing's thoughts.
     * @param description           The location's description.
     * @param narrativeDescription  A detailed view of the location from Van Helsing's perspective.
     */
    public Room(String description, String narrativeDescription)
    {
        this.description = description;
        this.narrativeDescription = narrativeDescription;
        //npc = null;
        //items = null;
    }
    
    /**
     * THIS METHOD HAS NO IMPLEMENTATION AT THIS POINT IN TIME
     * This method generates a room with a non-playable
     * character such as a shopkeeper and items to go with the
     * location that are not part of the NPC's inventory. If
     * no item is in the room by itself then it can just be
     * set to null.
     * @param description           The location's description.
     * @param narrativeDescription  A detailed view of the location from Van Helsing's perspective.
     * @param npc                   A non-playable character in this room.
     * @param item                  An item that exists inside the room that isn't already part
     *                              of the NPC's inventory.
     */
    /*
     * public Room(String description, String narrativeDescription, NonplayableChar npc, Item item){
     *     this.description = description;
     *     this.narrativeDescription = narrativeDescription;
     *     this.npc = npc;
     *     if (item != null)
     *       items.add(item);
     * }
     */

    /**
     * Define an exit from this room.
     * @param direction The direction of the exit.
     * @param neighbor  The room to which the exit leads.
     */
    public void setExit(String direction, Room neighbor) 
    {
        exits.put(direction, neighbor);
    }
    
    /**
     * THIS METHOD HAS NO IMPLEMENTATION AT THIS POINT IN TIME
     * Set the item present in the room if there is one.
     * @param Item   The item of the room.
     */
    /*
     * public void setItem(Item item)
     * {
     *     items.add(item);
     * }
     */
    
    /**
     * THIS METHOD HAS NO IMPLEMENTATION AT THIS POINT IN TIME
     * Define an NPC from the room if there is one.
     * @param npc   The NPC of the room.
     */
    /*
     * public void setNonplayableChar(NonplayableChar npc)
     * {
     *     this.npc = npc;
     * }
     */
    
    /**
     * THIS METHOD HAS NO IMPLEMENTATION AT THIS POINT IN TIME
     * Return the item present in the room if there is one.
     * @return   The item in the room. (The list of items in the room).
     */
    /*
     * 
     * public ArrayList<Item> getItem()
     * {
     *     if (items == null)
     *          System.out.println("No items here to get") (This message belongs somewhere else,
     *          but placed here for logic)
     *    (Need a for loop to retrieve the item.)
     *     return item;
     * }
     */

    /**
     * THIS METHOD HAS NO IMPLEMENTATION AT THIS POINT IN TIME
     * Return the NPC present in the room if there is one.
     * @return   The NPC of the room.
     */
    /*
     * public NonplayableChar getNonplayableChar()
     * {
     *     return npc;
     * }
     */

    
    /**
     * @return The short description of the room
     * (the one that was defined in the constructor).
     */
    public String getShortDescription()
    {
        return description;
    }

    /**
     * Return a description of the room in the form:
     *     You are in the kitchen.
     *     Exits: north west
     * @return A long description of this room
     */
    public String getLongDescription()
    {
        return "You are " + description + ".\n" + getExitString();
    }
    
    /**
     * THIS METHOD HAS NO COMPLETE IMPLEMENTATION AT THIS POINT IN TIME
     * Return a narrative description from the perspective of
     * Van Helsing along with a description of how many NPCs
     * are in the room and whether there are any items in
     * plain sight.
     * @return Detailed elements of the room, including NPCs and items.
     */
    
    private String getNarrativeDescription()
    {
        String returnString = narrativeDescription;
        /*if (npc != null) {
            returnString += "\nHere with Van Helsing is " + npc.getName();
        }
        if (item != null) {
            returnString += "\nAbout the location, Van Helsing sees something: " + item.getName();
        }*/
        return returnString;
    }
    
    /**
     * Return a string describing the room's exits, for example
     * "Exits: north west".
     * @return Details of the room's exits.
     */
    private String getExitString()
    {
        String returnString = "Exits:";
        Set<String> keys = exits.keySet();
        for(String exit : keys) {
            returnString += " " + exit;
        }
        return returnString;
    }

    /**
     * Return the room that is reached if we go from this room in direction
     * "direction". If there is no room in that direction, return null.
     * @param direction The exit's direction.
     * @return The room in the given direction.
     */
    public Room getExit(String direction) 
    {
        return exits.get(direction);
    }
}

