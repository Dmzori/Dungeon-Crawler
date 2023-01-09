
package GAME.DUNGEON;


public class Room {
    //what does a room?
    //every room has an entrance 
    //rooms might have an exit
    //rooms could have items 
    //rooms could have enemies to fight
    private int roomNumber;
    
    
    
    public Room(int roomNumber)
    {
        roomNumber = this.roomNumber;
    }
    
    public int getRoomNumber(Room r)
    {
        return r.roomNumber;
    }
}
