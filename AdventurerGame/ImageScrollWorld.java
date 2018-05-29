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
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private int margin;
   // private Background[] bg = new Background[3];
    private int scrollWidth;
    private int scrollHeight;
    public static final int constantY = HEIGHT / 4;
    int totalXMovement = 0;
    protected GreenfootImage textur = new GreenfootImage("finalbackground.png");
    boolean atEdge;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */

    
    public ImageScrollWorld()
    {    

        // creates a world thats 800 by 600 pixels, unbounded
        super(WIDTH, HEIGHT, 1, false); 
       
        GreenfootImage background = new GreenfootImage("finalbackground.png");
       // setBackground(background);
        
        ScrollActor obj = new ScrollActor();
        obj.getImage().scale(80,80);
        addObject(obj, WIDTH/3, HEIGHT - HEIGHT/3);
              // resetPlayersPosition(obj);
              isAtEdge(obj);
        scrollingBg();
    }
    public void act(){
    
    }
 /*   public void constructBG(){
    int x = -400;
    for (int i = 0; i<bg.length; i++){
    bg[i] = new Background();
    addObject(bg[i], x, getHeight()/2);
    x = x+800;
    }
    
    }*/
    
      public final void resetPlayersPosition(ScrollActor scrollingActor) {
        int xMovement = (int) ((double) 400 - scrollingActor.getExactX());
       // int yMovement = (int) ((double) getHeight()/2 - scrollingActor.getExactY());
        totalXMovement += xMovement;
       // totalYMovement += yMovement;
        List<Actor> actors = getObjects(Actor.class);
        for (Actor actor : actors) {
            if (actor instanceof ScrollActor) {
                ((ScrollActor) actor).setLocation(actor.getX() - 20, HEIGHT - HEIGHT/3);
            }
            
            else {
                actor.setLocation(actor.getX() + xMovement, HEIGHT);
            }
        }
    }
    public void isAtEdge(ScrollActor actor){
    if(actor.getX() == scrollWidth +1){
    actor.setLocation(scrollWidth, actor.getY());
    this.atEdge = true;
    
    }
    else {
    this.atEdge = false;
    }
    }
    
    public void scrollingBg(){
        int count = 0;
    while (this.atEdge == true){
        count++;
    
    }
    for(int x = 1; x < count +1; x++){
    
    getBackground().drawImage(textur, x, HEIGHT);
    }
    
    
    }
    /*
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

     */ 
}
