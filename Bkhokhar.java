package esi18;
import battleship.core.*;
import java.util.List;

/*
 * SimpleShip
 * @author Your Name
 */
public class Bkhokhar extends Ship {

    public Bkhokhar() {
        this.initializeName("bkhokhar");
        this.initializeOwner("Bilal");
        this.initializeHull(3);
        this.initializeFirepower(2);
        this.initializeSpeed(3);
        this.initializeRange(2);
    }

    /*
     * Determines what actions the ship will take on a given turn
     * @param arena (Arena) the battlefield for the match
     * @return void
     */
    @Override
    protected void doTurn(Arena arena) {
        Coord coord = this.getCoord();
        int x = coord.getX();
        int y = coord.getY();
        
        // Undeclared variable enemy
        // if (enemy.getSpeed() > this.getSpeed()) {
        //     System.out.println("The enemy ship will move before my ship.");
        //     if (x < 5) {
        //         this.move(arena, Direction.EAST);
        //     }
        //     else if (x > 5); {
        //         this.move(arena, Direction.WEST);
        //     }
        // } 
        // else if (enemy.getSpeed() < this.getSpeed()) {
        //     System.out.println("The enemy ship will move after my ship.");
        // } 
        // else {
        //     System.out.println("The enemy ship might move before or after my ship.");
        // }
    }

}