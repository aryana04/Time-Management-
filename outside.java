import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class outside here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class outside extends World
{
    
    /**
     * Constructor for objects of class outside.
     * 
     */
    public outside()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        GreenfootImage bg = new GreenfootImage("Outsidebg.png");
        bg.scale(600,400);
        setBackground(bg);
        
        // declare the player object
        Actor player;
        
        if(Player.getCharacter() ==1){
            player = new Player1(); //player1 object
        }else{
            player = new Player2(); //player2 object
        }
        
        //adjust the postion to wrap aorund left side 
        int wrapAroundX = 0; //left side of the screen 
        int storedY = Player.getStoredY(); 
        
        addObject(player, wrapAroundX, storedY);
    }
    
    }