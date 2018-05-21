import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ImageScrollWorld extends World
{
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public ImageScrollWorld()
    {    
       
        // creates a world thats 800 by 600 pixels, unbounded
        super(WIDTH, HEIGHT, 1, false); 
        GreenfootImage background = new GreenfootImage("gameBACKGROUND.gif");
    }
}
