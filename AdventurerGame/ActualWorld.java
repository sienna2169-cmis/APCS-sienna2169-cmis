import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ActualWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ActualWorld extends ImageScrollWorld
{

    /**
     * Constructor for objects of class ActualWorld.
     * 
     */
    public ActualWorld()
    {  super();
        //setScrollingBackground(new GreenfootImage("ground.png"));
      addThings();
    }
    public void addThings(){
     addObject(new Ground(), 100,200);
    
    }
}
