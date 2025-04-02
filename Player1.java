import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player1 extends Player
{
    /**
     * Act - do whatever the Player1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    if(Greenfoot.isKeyDown("left")){
            setLocation(getX() -5, getY());
    }
    if(Greenfoot.isKeyDown("right")){
        setLocation(getX() +5, getY());
    }
    
    if(Greenfoot.mouseClicked(this)){
        Greenfoot.setWorld(new dorm());
    }
    
    //check if the player on right side of the screen in dorm world
    if(getX() >= 600){
        Player.storePosition(getX(), getY());//store current postion
        Greenfoot.setWorld(new outside());//transition to outside world
    }
    
    
    //If the player reaches the edge of the dorm, go outside 
    if(isAtEdge()){
        Player.storePosition(getX(), getY());
        Greenfoot.setWorld(new outside());
    }
}
    
public Player1()
 {
        GreenfootImage image = new GreenfootImage("Player1.png");
        image.scale(200,200);
        setImage(image);
 }
}
