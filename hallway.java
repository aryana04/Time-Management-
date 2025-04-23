import greenfoot.*;

public class hallway extends World
{
    public hallway(int spawnX, int spawnY)
    {
        super(600, 400, 1);
        Player2 player = new Player2();
        addObject(player, spawnX, spawnY);
    }
}

