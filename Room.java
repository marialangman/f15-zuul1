import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

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
 * @author  Michael Kölling and David J. Barnes
 * @version 2011.08.09
 */

public class Room 
{
    private String description;
    private String narrativeDescription;
    //private NonplayableChar npc;
    //private Item item;
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
        //item = null;
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
        //item = null;
    }
    
    /**
     * THIS METHOD HAS NO IMPLEMENTATION AT THIS POINT IN TIME
     * This method generates a room with a non-playable
     * character such as a shopkeep and items to go with the
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
     *     this.item = item;
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
     * Return the item present in the room if there is one.
     * @param Item   The item of the room.
     */
    /*
     * public void setItem(Item item)
     * {
     *     this.item = item;
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
     * @return   The item of the room.
     */
    /*
     * public Item getItem()
     * {
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

