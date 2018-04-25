import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private int health;
    private int damage;
    private int ammo;
    private int speed;
    private boolean alive = true;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void Player() 
    {
    health = 200;
    damage = 10;
    ammo = 150;
    speed = 3;
    }
    public void act() 
    {
        // Add your action code here.
    }   
    public void move()
    {
    while (Greenfoot.isKeyDown("left")){
    turn(90);
    move();
    }
    while (Greenfoot.isKeyDown("right")){
        turn(-90);
        move();
    }
    }
    public int getHealth(){
    return this.health;
    }
    public void setLife(boolean life)
    {
    this.alive = life;
    }
    public void die()
    {
    turn(30);
    setLife(false);
    
    }
}
