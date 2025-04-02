import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private World link;
    public Button(String imagePath, World link){
        GreenfootImage image = new GreenfootImage(imagePath);
        image.scale(100,50);
        setImage(image);
        this.link = link;
    }
    
    public void act()
    {
        if (Greenfoot.mouseClicked(this)){
            //Greenfoot.setWorld(this.link);
            Greenfoot.setWorld(new ChooseCharacter()); 
        }
    }
    }
