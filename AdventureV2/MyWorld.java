import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Background bg1, bg2;//, bg3;
    Player player;
    private int scrollingLimit;
    private int setHeight = getHeight() - getHeight()/3;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1, false); 
        //GreenfootSound music = new GreenfootSound("Aha_-_Take_On_Me");
        // music.play();
        player = new Player();
        player.getImage().scale(80,80);

        setPaintOrder(Interactive.class, NonInteractive.class);

        
        addObject(player, getWidth()/3, setHeight);
        scrollingLimit = getWidth()/4;

        bg1 = new Background();
        addObject(bg1, getWidth()/2, getHeight()/2);

        bg2 = new Background();
        addObject(bg2, getWidth() + getWidth()/2, getHeight()/2);

        //  bg3 = new Background();
        // addObject(bg3, - getWidth() - getWidth()/2, getHeight()/2);

        
    }
    public void act(){
        if (Math.random() > 0.99){
            if (Math.random() < 0.17) {addObject(new Evil1(), player.getX() + 600 + (int) (Math.random() * 1000), setHeight);
            }
            else if (Math.random() > 0.90) {
                addObject(new Evil2(), player.getX() + 600 + (int) (Math.random() * 1000), setHeight);
            }
        }

        ArrayList<Actor> actors = new ArrayList<Actor>();
        actors = (ArrayList)getObjects(Actor.class);

        if (player.atBorder()){
            bg1.scroll();
            bg2.scroll();
            //   bg3.scroll();
            for (Actor act : actors){
                if (act instanceof Player){
                    ;
                }
                else if (act instanceof Projectile){
                    ;
                }
                else {
                    act.setLocation(act.getX() -2, act.getY());
                }

            }
        }
        if (getObjects(Player.class).size() == 0){
        Greenfoot.stop();
        }
    
    }
    
    public int getSetHeight(){
    return this.setHeight;
    }
    public int getScrollingLimit(){
        return this.scrollingLimit;
    }
}
