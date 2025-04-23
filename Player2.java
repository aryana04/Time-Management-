import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player2 extends Player
{
    /**
     * Act - do whatever the Player2 wants to do. This method is called whenever
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
            Greenfoot.setWorld(new dorm()); // transition to dorm world when clicked
        }

        // From dorm to outside
        if(getWorld() instanceof dorm && getX() >= 600){
            Player.storePosition(getX(), getY());
            Greenfoot.setWorld(new outside(50, 300)); // spawn in outside at (50, 300)
        }

        // From outside to hallway (Mario to maze) when at edge
        if(getWorld() instanceof outside && isAtEdge()){
            Player.storePosition(getX(), getY());
            Greenfoot.setWorld(new hallway(100, 300)); // spawn in hallway at (100, 300)
        }
    }

    public Player2(){
        GreenfootImage image = new GreenfootImage("Player2.png");
        image.scale(200,200);
        setImage(image);
    }
}

