import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public static final int W = 750;
    public static final int H = 500;
    public static final int playerNum = 1;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 500, 1); 
        setPaintOrder(Player.class, Enemy.class);
        
        addObject(new Player(), (int)(Math.random() * W), (int)(Math.random() * H));
    }
    public static int getW(){
    return W;
    }
}
