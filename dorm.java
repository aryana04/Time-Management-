import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dorm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dorm extends World
{

    /**
     * Constructor for objects of class dorm.
     * 
     */
    private Player player;
    public dorm()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        GreenfootImage bg = new GreenfootImage("Dormbg.png");
        bg.scale(600,400);
        setBackground(bg);
        
        //spawn the selected charcater the player choosed
        if(Player.getCharacter()==1){
            player = new Player1();
        } else{
            player = new Player2();
        }
        addObject(player, 100, 300); //place the charcter in corner 
    }
    
    public void act(){
        
    }
}

