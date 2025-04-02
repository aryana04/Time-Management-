import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hallway here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hallway extends World
{

    /**
     * Constructor for objects of class hallway.
     * 
     */
    public hallway()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        GreenfootImage bg = new GreenfootImage("Hallwaybg.png");
        bg.scale(600,400);
        setBackground(bg);
        
        //Actor Player;
        //if(Player.getCharacter() == 1){
            //player = new Player1();
        //}else{
            //player = new Player2();
        //}
        
        //int storedY = Player.getStoredY();
        //addObject(player,600,storedY);
    }
}
