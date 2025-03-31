import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Char1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Char1 extends Actor
{
    
public int vSpeed = 0;
    public int gravity = 1;
    public boolean jumping = false;
    public int jumpStrength = 25;
    public int speed = 5;
    
    public void act()
    {
        movKeys();
        applyGravity();
        checkFalling();
    }
    
    public void movKeys()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + speed, getY());
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - speed, getY());
        }
        
        if (Greenfoot.isKeyDown("Up") && !jumping)
        {
            jump();
        }
    }
    
    public void jump()
    {
        vSpeed = -jumpStrength;
        jumping = true;
    }
    
    public void applyGravity()
    {
        setLocation(getX(), getY() + vSpeed);
        vSpeed += gravity;
        
        if(getY() >= getWorld().getHeight() - 1) // Assuming ground level is the bottom of the world
        {
            jumping = false;
            vSpeed = 0;
        }
    }
    
    public void checkFalling()
    {
        if(!isTouching(Brick.class))
        {
            vSpeed++;
        }
        else
        {
            vSpeed = 0;
            jumping = false;
        }
    }
}



