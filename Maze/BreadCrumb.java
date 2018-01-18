import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BreadCrumb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BreadCrumb extends Actor
{
    GreenfootImage img;
    public BreadCrumb(int d){
        img = new GreenfootImage(d,d);
        img.setColor(Color.YELLOW);
        img.fill();
        img.setColor(Color.BLACK);
        img.drawRect(0,0,d-1,d-1);
        setImage(img);       
    }
}
