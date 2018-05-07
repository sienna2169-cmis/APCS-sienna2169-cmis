import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int health;
    private int damage;
    private int speed;
    public Enemy() {
    health = 100;
    damage = 5;
    speed = 1;
    }
    public void act() 
    {
        // Add your action code here.
    }    
    public void attack() {
    
    }
    public void setSpeed(int speed) {
    this.speed = speed;
    }
}
