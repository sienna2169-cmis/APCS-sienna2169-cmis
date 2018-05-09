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
    int charge = 20;
    int antmo = 150;
    boolean isReloading = false;
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
    public int getAmmo(){
    return this.antmo;
    }
    public void act() 
    {
        // Add your action code here.

        move();
        if (antmo > 0) {
        shoot();
    }
        else if(antmo == 0) {
        reload();
        this.isReloading = false;
        }
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
    
    public void reload(){
    this.isReloading = true;
    while (antmo < 100){
    antmo +=1;
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

        if (charge < 20){
            charge +=1;
        }
        if (charge == 20 && ammo > 0){
            if (Greenfoot.isKeyDown("a")) {
                getWorld().addObject(new Projectile(180), this.getX() -4, this.getY());
                charge = 0;
                antmo--;
            }
            else if (Greenfoot.isKeyDown("s")) {
                getWorld().addObject(new Projectile(90), this.getX(), this.getY() + 4);
                charge = 0;
                antmo--;
            }

            else if (Greenfoot.isKeyDown("w")) {

                getWorld().addObject(new Projectile(-90), this.getX(), this.getY() -4);
                charge = 0;
                antmo--;
            }
            else if (Greenfoot.isKeyDown("d")){
                getWorld().addObject(new Projectile(1), this.getX() +4, this.getY());
                charge = 0;
                antmo--;
            }
        }
    }
}