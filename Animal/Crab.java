import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Crab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crab extends Animal {
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
  public boolean fight(){
        boolean success = false;
    if(isTouching(Starfish.class)){
        if(Math.random() > 0.5) {
        whither();
        
        }
        else {
        success = true;
        Starfish.lose();
        }
    }
    return success;
    }
    public void changePosition(){
        if(Math.random() > 0.8){
            turn(30 - (int)(Math.random() * 60));
        }
        move(getLifeForce() / 20);
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
