import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Evil1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Evil1 extends Enemy implements Monsterable
{
    private int health = 100;
     
    
    /**
     * Act - do whatever the Evil1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Evil1(){
    
        GreenfootImage image = getImage();
        image.scale(50, 50);
        setImage(image);
    }
    public void act() 
    {
        
        // Add your action code here.
        movement();
        if (isTouching(Projectile.class)){
        takeDamage();
        }
          if (health ==0){
        getWorld().removeObject(getOneIntersectingObject(Projectile.class));
        getWorld().removeObject(this);
        }
    }    
    public void movement(){
     move(-2);
    }
    public void takeDamage(){
    this.health -= 100;
    }
}
