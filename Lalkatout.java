package esi18;
import battleship.core.*;
import java.util.List;

/*
 * SimpleShip
 * @author Your Name
 */
public class Lalkatout extends Ship {

    public Lalkatout() {
        this.initializeName("Clean");
        this.initializeOwner("Clean");
        this.initializeHull(3);
        this.initializeFirepower(3);
        this.initializeSpeed(2);
        this.initializeRange(2);
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
        this.fire(arena, x+1, y);
    }

}
