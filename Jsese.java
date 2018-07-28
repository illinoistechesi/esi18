package esi18;
import battleship.core.*;
import java.util.List;

/*
 * SimpleShip
 * @author Your Name
 */
public class Jsese extends Ship {

    public Jsese() {
        this.initializeName("Asian Sensation");
        this.initializeOwner("Jesse Sese");
        this.initializeHull(1);
        this.initializeFirepower(4);
        this.initializeSpeed(0);
        this.initializeRange(5);
    }

    /*
     * Determines what actions the ship will take on a given turn
     * @param arena (Arena) the battlefield for the match
     * @return void
     */
    @Override
    protected void doTurn(Arena arena) {
        this.move(arena, Direction.EAST);

        Coord location = this.getCoord();
        int x = location.getX();
        int y = location.getY();
        this.fire(arena, x+5, y);
    }

}
