import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Evil2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Evil2 extends Enemy
{
    
    /**
     * Act - do whatever the Evil2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
     if(!getWorld().getObjects(Player.class).isEmpty()){
       move();
       
       die();}
    }    
    public void move(){
    super.move();
    if (Math.random() > 0.5){
    setLocation(this.getX(), this.getY() +3);
    }
    else if (Math.random() < 0.5){
    setLocation(this.getX(), this.getY() -3);
    }
    }
}
