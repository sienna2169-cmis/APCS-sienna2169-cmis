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
    int antmo = 20;
    boolean isReloading = false;
    boolean poweredUp = false;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public  Player() 
    {
        health = 200;
        damage = 10;
        ammo = 150;
        speed = 5;
    }
    public int getAmmo(){
    return this.antmo;
    }
    public void setHealth(int newHealth){
    this.health = newHealth;
    }
    public void act() 
    {
        // Add your action code here.

        move();
        takeDamage();
        if (antmo > 0) {
        shoot();
    }
        else if(antmo == 0) {
        reload();
        this.isReloading = false;
        }
        if (getHealth() == 0){
        die();
        }
        
        if (this.isTouching(Powerup.class)){
        powerUP();
        }
        if (isBoosted() == true) {
        //makes it so that it uses shoot2 for set amount of time
        
        }
        
    }   
    public void powerUP(){
    this.poweredUp = true;
    }
    public boolean isBoosted(){
    return this.poweredUp;
    }
    public void shootBOOST(){
      if (Greenfoot.isKeyDown("left")) {
                getWorld().addObject(new Projectile(180), this.getX() -4, this.getY());
                
            }
            else if (Greenfoot.isKeyDown("down")) {
                getWorld().addObject(new Projectile(90), this.getX(), this.getY() + 4);
                
            }

            else if (Greenfoot.isKeyDown("up")) {

                getWorld().addObject(new Projectile(-90), this.getX(), this.getY() -4);
                
            }
            else if (Greenfoot.isKeyDown("right")){
                getWorld().addObject(new Projectile(1), this.getX() +4, this.getY());
                
            }
    }
    public void move()
    {

        if (Greenfoot.isKeyDown("a") ){
            turnTowards(this.getX() -1, this.getY());
            move(speed);
        }
        if (Greenfoot.isKeyDown("d")){
            turnTowards(this.getX() + 1, this.getY());
            move(speed);
        }
        if (Greenfoot.isKeyDown("w")){
            turnTowards(this.getX(), this.getY() -1);
            move(speed);
        }
        if (Greenfoot.isKeyDown("s")) {
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
        getWorld().removeObject(this);
    }
    
    public void takeDamage(){
    if(this.isTouching(Enemy.class)){
    setHealth(getHealth()-25);
    }
    
    }
    public void shoot(){

        if (charge < 20){
            charge +=1;
        }
        if (charge == 20 && ammo > 0){
            if (Greenfoot.isKeyDown("left")) {
                getWorld().addObject(new Projectile(180), this.getX() -4, this.getY());
                charge = 0;
                antmo--;
            }
            else if (Greenfoot.isKeyDown("down")) {
                getWorld().addObject(new Projectile(90), this.getX(), this.getY() + 4);
                charge = 0;
                antmo--;
            }

            else if (Greenfoot.isKeyDown("up")) {

                getWorld().addObject(new Projectile(-90), this.getX(), this.getY() -4);
                charge = 0;
                antmo--;
            }
            else if (Greenfoot.isKeyDown("right")){
                getWorld().addObject(new Projectile(1), this.getX() +4, this.getY());
                charge = 0;
                antmo--;
            }
        }
    }
}