import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Projectile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Projectile extends Actor
{
    /**
     * Act - do whatever the Projectile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int rotation;
    
public Projectile(int rotation){
    
    setRotation(rotation);

    }
    public void act() 
    {
        move(6);
       if (this.getX() == 749 ){
        getWorld().removeObject(this);
        }
        else if (this.getX() == 0) {
        getWorld().removeObject(this);
        }
        else if (this.getY() == 0) {
        getWorld().removeObject(this);
        }
        else if (this.getY() == 499) {
        getWorld().removeObject(this);
        }
       // if (this.getY() == 0 || this.getY() == 500) {
       // getWorld().removeObject(this);
       // }
      /*  if (Greenfoot.isKeyDown("a")) {
   turnTowards(this.getX() -1, this.getY());
    }
    else if (Greenfoot.isKeyDown("s")) {
    turnTowards(this.getX(), this.getY() +1);
    }
    
    else if (Greenfoot.isKeyDown("w")) {
    turnTowards(this.getX(), this.getY() -1);
    }
    
    }    */
    
}
}
