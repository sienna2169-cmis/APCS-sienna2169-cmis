import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Evil2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Evil2 extends Enemy implements Monsterable
{
    private int health = 200;
    /**
     * Act - do whatever the Evil2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Evil2(){
    
     GreenfootImage image = getImage();
        image.scale(80, 80);
        setImage(image);
    }
    
    
    public void act() 
    {
        
         if (isTouching(Projectile.class)){
        takeDamage();
        getWorld().removeObject(getOneIntersectingObject(Projectile.class));
        }
        if (health <=0){
        getWorld().removeObject(this);
        }
        // Add your action code here.
    }    
    public void movement(){
    move(-1);
}
    
    public void takeDamage(){
    this.health -= 70;
    }
}
