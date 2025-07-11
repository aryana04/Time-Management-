import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main extends World
{
    /**
     * Constructor for objects of class Main.
     * 
     */
    public Main()
    {
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        GreenfootImage bg = new GreenfootImage("Title.png");
        bg.scale(600,400);
        setBackground(bg);
        
        GreenfootSound bgMusic = new GreenfootSound("Zora's_Domain.mp3");
        bgMusic.setVolume(50);
        bgMusic.playLoop();
        
        GreenfootImage i = new GreenfootImage("download.png");
        i.scale(20,20);
        
        Button startButton = new Button("Start.png", new ChooseCharacter());
        //addObject(startButton, getWidth()/2, getHeight()/2); this set it anywhere on screen
        addObject(startButton, 360, 320); //i placed it where i want the button to be 
    }
}
