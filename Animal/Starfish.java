import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Starfish extends Animal
{
    private static boolean loser = false;
    public boolean eat(Actor food){
        boolean success = false;
        if(food instanceof Banana){
            Banana banana = (Banana) food;
            int nutrition = banana.getNutrition();
            success = true;
            while ( nutrition > 0){
                incrementLifeForce();
                nutrition--;
            }
        } else if (food instanceof Cherry){
            while(Math.random() > 0.10){
                whither();
            }
            success = true;
        }
        return success;
    }
    
    public void takeDamage() {
    whither();
    }
    public static void lose(){
    loser = true;
    }
   
    public void changePosition(){
        if(Math.random() > 0.8){
            turn(30 - (int)(Math.random() * 60));
        }
        move(getLifeForce() / 20);
        if(isTouching(Crab.class)){
        fight();
        }
       
    }
    public boolean fight(){
        
        boolean success = false;
    
        if(Math.random() > 0.5) {
            System.out.println("Starfish's attack is successful!");
        success = true;
        Starfish.lose();
        System.out.println("Crab takes a hit!!");
        }
        else {
        System.out.println("Starfish's attack failed!");
            
        }
    
   
    
    return success;
    }
    public void reproduce(){
        if(isTouching(Starfish.class) && getLifeForce() > 50){
            World w = getWorld();
            w.addObject(new Starfish(), getX(), getY());
            while(getLifeForce() > 25){
                whither();
            }
        }
    }
    
    
    
}