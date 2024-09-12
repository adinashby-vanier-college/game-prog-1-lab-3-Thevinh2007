// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * 
 */
public class Crab extends Actor
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Act - do whatever the Crab wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAndturn();
        eat();
    }

    /**
     * 
     */
    public void moveAndturn()
    {
        move(0);
        if (Greenfoot.isKeyDown("w")) {
            move(4);
        }
        if (Greenfoot.isKeyDown("s")) {
            move(-4);
        }
        if (Greenfoot.isKeyDown("a")) {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("d")) {
            turn(3);
        }
    }

    /**
     * 
     */
    public void eat()
    {
        Actor worm = getOneIntersectingObject(worm.class);
        if (worm != null) {
            World world = getWorld();
            world.removeObject(worm);
            Greenfoot.playSound("eating.wav");
        }
    }
}
