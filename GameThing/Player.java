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
    public  Player() 
    {
    health = 200;
    damage = 10;
    ammo = 150;
    speed = 3;
    }
    public void act() 
    {
        // Add your action code here.
        
        move();
        shoot();
    }   
    public void move()
    {
       
    if (Greenfoot.isKeyDown("left") ){
    turnTowards(this.getX() -1, this.getY());
    move(speed);
    }
    if (Greenfoot.isKeyDown("right")){
        turnTowards(this.getX() + 1, this.getY());
        move(speed);
    }
    if (Greenfoot.isKeyDown("up")){
        turnTowards(this.getX(), this.getY() -1);
        move(speed);
    }
    if (Greenfoot.isKeyDown("down")) {
        turnTowards(this.getX(), this.getY() +1);
        move(speed);
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
    public void shoot(){
    if (Greenfoot.isKeyDown("a")) {
    getWorld().addObject(new Projectile(), this.getX() -1, this.getY());
    
    }
    else if (Greenfoot.isKeyDown("s")) {
    getWorld().addObject(new Projectile(), this.getX(), this.getY() + 1);
    }
    
    else if (Greenfoot.isKeyDown("w")) {
    getWorld().addObject(new Projectile(), this.getX(), this.getY() -1);
   
    }
    else if (Greenfoot.isKeyDown("d")){
    getWorld().addObject(new Projectile(), this.getX() +1, this.getY());
    }
    }
}
