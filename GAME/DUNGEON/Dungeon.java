
package GAME.DUNGEON;

import java.util.ArrayList;


public class Dungeon {
    //the dungeon is made of rooms
    
    private int dungeonSize;
    private ArrayList<Room> roomList = new ArrayList<>();
    
    public Dungeon(int dungeonSize)
    {
        dungeonSize = this.dungeonSize;
        for(int i = 0; i <= dungeonSize; i++)
        {
            
            
            //Room r = new Room(i);
            roomList.add(i, new Room(i));
        }
    }
    
    public ArrayList<Room> getRoomList(Dungeon d)
    {
        return d.roomList;
    }
    
}
