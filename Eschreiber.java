package esi18;
import battleship.core.*;
import java.util.List;

/*
 * SimpleShip
 * @author Your Name
 */
public class Eschreiber extends Ship {

    public Eschreiber() {
        this.initializeName("DayChan");
        this.initializeOwner("Ethan");
        this.initializeHull(1);
        this.initializeFirepower(3);
        this.initializeSpeed(0);
        this.initializeRange(6);
    }

    /*
     * Determines what actions the ship will take on a given turn
     * @param arena (Arena) the battlefield for the match
     * @return void
     */
    @Override
    protected void doTurn(Arena arena) {
        this.move(arena, Direction.EAST);

        List<Ship> nearby = this.getNearbyShips(arena);

        for (int i = 0; i < nearby.size(); i++) {
            if ( this.isSameTeamAs(nearby.get(i)) ) {

            }
            else {
                Ship enemy = nearby.get(i);
        Coord location = this.getCoord();
        int x = location.getX();
        int y = location.getY();
        this.fire(arena, x+6, y);
    }

}
}
}
