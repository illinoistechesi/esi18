package esi18;
import battleship.core.*;
import java.util.List;

/*
 * SimpleShip
 * @author Your Name
 */
public class Sdavila extends Ship {

    public Sdavila() {
        this.initializeName("antiDerivative");
        this.initializeOwner("Haras");
        this.initializeHull(2);
        this.initializeFirepower(3);
        this.initializeSpeed(2);
        this.initializeRange(3);
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
        List<Ship> nearby = this.getNearbyShips(arena);

      //  int x = location.getX();
     //   int y = location.getY();
     //   this.fire(arena, x+1, y);


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
