import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ImageScrollWorld extends World
{
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;
    public static final int constantY = HEIGHT / 4;
    int totalXMovement = 0;
    protected GreenfootImage textur;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public ImageScrollWorld()
    {    

        // creates a world thats 800 by 600 pixels, unbounded
        super(WIDTH, HEIGHT, 1, false); 
        GreenfootImage background = new GreenfootImage("finalbackground.png");
        setBackground(background);
        ScrollActor obj = new ScrollActor();
        obj.getImage().scale(80,80);
        addObject(obj, WIDTH/2, HEIGHT - HEIGHT/3);
        
    }

    public static int getConstantY(){
        return constantY;
    }

    public final void keepInPlace(ScrollActor actor){
        int xMovement = (int) ((double) getWidth()/4 - actor.getExactX());
        totalXMovement += xMovement;
        List<Actor> actors = getObjects(Actor.class);
        for (Actor act : actors) {
            if (act instanceof ScrollActor){
                ((ScrollActor) act).setLocation(act.getX() + xMovement, constantY);
            }

        }
        createTextur();
    }

    public void act(){
        
    }

    protected final void createTextur() {
        int x;
        int y;
        if (totalXMovement > 0) {
            for (x = totalXMovement; x > 0; x -= textur.getWidth()) {
                ;
            }
        }
        else {
            for (x = totalXMovement; x < 0; x += textur.getWidth()) {
                ;
            }
            x -= textur.getWidth();
        }

        getBackground().clear();
        for (int i = x; i < getWidth(); i += textur.getWidth()) {

            getBackground().drawImage(textur, i, constantY);

        }
    }

    public void setScrollingBackground(GreenfootImage bgImage) {
        textur = bgImage;
    }   

    
}
