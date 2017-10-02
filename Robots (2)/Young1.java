import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
public class Young1 extends Robot
{
    public Young1(){
        super(Color.cyan);
    }
    
    public void init(){
        
    }
    
    /**
     * What your robot can do:
     * right() => move 1 to the right
     * left() => move 1 to the left
     * up() => move 1 up
     * down() => move 1 down
     * isClearRight() => true means no block to the right
     * isClearLeft() => true means no block to the left
     * isClearUp() => true means no block up
     * isClearDown() => true means no block down
     */
    public void behave(){
        if(isClearRight()==false){
            if(isClearUp()==true){
                up();
            }
            if(isClearUp()==false){
                if(isClearDown()==true){
                    down();
                }
                if(isClearDown()==false){
                    left();
                }
                if(isClearUp()==false){
                    left();
                }
                if(isClearUp()==true){
                    up();
                }
            }
        }
        else{
            right();
        }
    }
}