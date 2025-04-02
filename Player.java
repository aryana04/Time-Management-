import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static int characterChoice;
    private static int storedX;
    private static int storedY;
    
    //set the selected charcater
    public static void setCharacter(int character)
    {
        //character = characterType;
        characterChoice = character;
    }
    
    //gets the selected character
    public static int getCharacter(){
        return characterChoice; 
    }
    
    public static void storePosition(int x, int y){
        storedX = x;
        storedY = y;
    }
    
    public static int getStoredX(){
        return storedX;
    }
    
    public static int getStoredY(){
        return storedY;
    }
    
    public Player(){
        //
    }
}
