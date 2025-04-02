import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ChooseCharacter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChooseCharacter extends World
{
    private World link;
    //public Boy;
    /**
     * Constructor for objects of class ChooseCharacter.
     * 
     */
    public ChooseCharacter()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        GreenfootImage bg = new GreenfootImage("Cyc.png");
        bg.scale(600,400);
        setBackground(bg);
        
        Player1 player1 = new Player1();
        addObject(new Player1(), 450, 200);
        
        Player2 player2 = new Player2();
        addObject(new Player2(), 200, 200);
        
    }
    
    public void act(){
        if(Greenfoot.mouseClicked(getObjects(Player1.class).get(0))){
            //set player as the selected character
            Player.setCharacter(1);
            Greenfoot.setWorld(new dorm());
        }
        if(Greenfoot.mouseClicked(getObjects(Player2.class).get(0))){
            Player.setCharacter(2);
            Greenfoot.setWorld(new dorm());//transitions to next world with player
        }
    }
}
