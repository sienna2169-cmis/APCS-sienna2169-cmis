import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Interactive
{
    private int health;
     protected double exactX;
    protected GreenfootImage image = new GreenfootImage("cowboySprite.png");
    protected GreenfootImage flippedImage = new GreenfootImage("cowboySprite2.png");
    int charge = 20;
    int antmo = 20;
    boolean isReloading = false;
    private boolean isAtBorder = false;
    private boolean isAtBack = false;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Player(){
    health = 100;
    
    }
    public void act() 
    {
        // Add your action code here.

        if(getX() >= (getWorld().getWidth()-500)){
        this.isAtBorder = true;
        setLocation(getX() - 3, getY());
        }
        else{
        this.isAtBorder = false;
        }
        
        
     
        controlMovement();
        if (antmo > 0) {
            shoot();
        }
        else if(antmo == 0) {
            reload();
            this.isReloading = false;
        }
    }    
    public boolean atBorder(){
    
    return this.isAtBorder;
    }
   
  

    public double getExactX(){
        return exactX;
    }

    public void controlMovement(){
        if (Greenfoot.isKeyDown("d")){
            setImage(image);
            image.scale(80,80);
            //turn(180);
            turnTowards(getX() +1, getY());

            //turnTowards(getX() + 1, getY());
            move(3);
            setRotation(0);
        }
        if (Greenfoot.isKeyDown("a")){

            setImage(flippedImage);
            flippedImage.scale(80,80);
            //turn(180);
            turnTowards(getX() -1, getY());

            move(2);
            setRotation(0);
        }

    }

    public void shoot(){

        if (charge < 20){
            charge +=1;
        }
        if (charge == 20 && antmo > 0){
            if (Greenfoot.isKeyDown("space")) {
                if (this.getImage() == flippedImage){
                    getWorld().addObject(new Projectile(180), this.getX() -4, this.getY());
                    charge = 0;
                    antmo--;
                }
                if (this.getImage() == image){
                    getWorld().addObject(new Projectile(0), this.getX() +4, this.getY());
                    charge = 0;
                    antmo--;
                }
            }

        }
    }

    public void reload(){
        this.isReloading = true;
        while (antmo < 100){
            antmo +=1;
        }
    }
}
