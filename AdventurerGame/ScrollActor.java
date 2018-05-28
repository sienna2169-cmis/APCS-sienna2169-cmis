import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScrollActor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScrollActor extends Actor
{
    /**
     * Act - do whatever the ScrollActor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    protected double exactX;
    protected GreenfootImage image = new GreenfootImage("cowboySprite.png");
    protected GreenfootImage flippedImage = new GreenfootImage("cowboySprite2.png");
    int charge = 20;
    int antmo = 20;
    boolean isReloading = false;
    public void act() 
    {
        // Add your action code here.

        controlMovement();
        if (antmo > 0) {
            shoot();
        }
        else if(antmo == 0) {
            reload();
            this.isReloading = false;
        }
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
            move(2);
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
