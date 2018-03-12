import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Goal extends Actor
{
    private GreenfootImage img;
    public Goal(int d){
        img = new GreenfootImage(d,d);
        img.setColor(Color.GREEN);
        img.fill();
        setImage(img);
    }
}
