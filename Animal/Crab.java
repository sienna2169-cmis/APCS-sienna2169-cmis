import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Crab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crab extends Animal {
        private static boolean loser = false;
public boolean eat(Actor food){
        boolean success = false;
        if(food instanceof Banana){
            
           
            success = true;
            while(Math.random() > 0.10){
                whither();
            }
        } else if (food instanceof Cherry){
            Cherry cherry = new Cherry();
           int nutrition = cherry.getNutrition();
             while ( nutrition > 0){
                incrementLifeForce();
                nutrition--;
            }
            success = true;
        }
        return success;
    }
    
    public static void lose(){
    loser = true;
    }
  public boolean fight(){
     System.out.println("FIGHT!");
        boolean success = false;
    
        if(Math.random() > 0.5) {
            System.out.println("Crab's attack is successful!");
        success = true;
        Starfish.lose();
        System.out.println("Starfish takes a hit!!");
        }
        else {
        System.out.println("Crab's attack failed!!");
        }
    
    return success;
    }
    public void changePosition(){
        if(Math.random() > 0.8){
            turn(30 - (int)(Math.random() * 60));
        }
        move(getLifeForce() / 20);
        if(isTouching(Starfish.class)){
        fight();
        }
    }

    public void reproduce(){
        if(isTouching(Crab.class) && getLifeForce() > 85){
            World w = getWorld();
            w.addObject(new Crab(), getX(), getY());
            while(getLifeForce() > 25){
                whither();
            }
        }
    }
}
