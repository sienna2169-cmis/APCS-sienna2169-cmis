import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
public class RobotTemplate extends Robot
{
    public RobotTemplate(){
        super(Color.black);
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
     * isClearRight() => true means no block to the left
     * isClearUp() => true means no block up
     * isClearDown() => true means no block down
     * getX() => returns x coordinate of robot
     * getY() => returns y coordinate of robot 
     * public final int[] getData() => returns array of int data
     * public final int getData(int idx) => returns int data from index idx
     * public final void setData(int idx, int value) => sets value of data array at idx
     * public final void setData(int[] newData) => replaces values in data array with values in newData
     */
    public void behave(){
        getData();
        int count = 1;

        //4 = how far along the side we are
        //5 = we've hit the box! side 1
        if (isClearRight() == false ) {
            setData(5, 1);
            if (getData(4) != 10) {
                down();
                count++;
                setData(4,count);
            }

            if (getData(4) == 10) {
                right();
            }
        }
        else if (isClearLeft() == false ) {
            setData(5, 1);
            if (getData(4) != 10) {
                down();
                count++;
                setData(4,count);
            }

            if (getData(4) == 10) {
                left();
            }
        }
        int count2 = 1;
        // data 6 is have we hit the 2nd side?
        // data 7 is how far along we are on the 2nd side
        if (getData(5) == 1 && isClearUp() == false) {
            setData(6, 1);
            if (getData(7) != 10) {
                down();
                count++;
                setData(4,count);
            }

            if (getData(7) == 10) {
                left();
            }
        }
        
        if (getData(6) == 1 && isClearRight() == false) {
        
         setData(4, 0);
            if (getData(4) != 10) {
                down();
                count++;
                setData(4,count);
            }

            if (getData(4) == 10) {
                right();
            }}
            
            
    }
}