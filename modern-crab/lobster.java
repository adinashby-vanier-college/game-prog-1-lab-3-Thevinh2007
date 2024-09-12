// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class lobster extends Actor
{

    /**
     * 
     */
    public void act()
    {
        moveAround();
        eatCrab();
        tranformWormtoLobster();
        orientationStart();
    }

    /**
     * 
     */
    public void orientationStart()
    {
        if (Greenfoot.getRandomNumber(80) == 1) {
            turn(Greenfoot.getRandomNumber(360));
        }
    }

    /**
     * Act - do whatever the lobster wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void moveAround()
    {
        move(3);
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (isAtEdge()) {
            turn(180);
        }
    }

    /**
     * 
     */
    public void eatCrab()
    {
        Actor Crab = getOneIntersectingObject(Crab.class);
        if (Crab != null) {
            World world = getWorld();
            world.removeObject(Crab);
            Greenfoot.playSound("trombone.mp3");
        }
    }

    /**
     * 
     */
    public void tranformWormtoLobster()
    {
        Actor worm = getOneIntersectingObject(worm.class);
        if (worm != null) {
            World world = getWorld();
            int x = worm.getX();
            int y = worm.getY();
            world.removeObject(worm);
            lobster lobster =  new  lobster();
            world.addObject(lobster, x, y);
        }
    }
}
