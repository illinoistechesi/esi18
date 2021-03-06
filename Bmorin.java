package esi18;
import battleship.core.*;
import java.util.List;

/*
 * SimpleShip
 * @author Your Name
 */
public class Bmorin extends Ship {

    public Bmorin() {
        this.initializeName("Bmorin");
        this.initializeOwner("Bmorin");
        this.initializeHull(2);
        this.initializeFirepower(4);
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
        Coord location = this.getCoord();
        this.move(arena, Direction.EAST);

        List<Ship> nearby = this.getNearbyShips(arena);

        // loop through the list of nearby ships
        for (int i = 0; i < nearby.size(); i++) {
            if ( this.isSameTeamAs(nearby.get(i)) ) {
                // if same team, don't shoot
            }
            else {
                Ship enemy = nearby.get(i);
                Coord enemyLoc = enemy.getCoord();
                int x = enemyLoc.getX();
                int y = enemyLoc.getY();
                this.fire(arena, x, y);
            }
        }
    }


}
