package esi18;
import battleship.core.*;
import java.util.List;

/*
 * SimpleShip
 * @author Your Name
 */
public class Cton extends Ship {

    public Cton() {
        this.initializeName("WonTon");
        this.initializeOwner("Calvin");
        this.initializeHull(2);
        this.initializeFirepower(3);
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
        this.move(arena, Direction.EAST);
        this.move(arena, Direction.EAST);
        this.move(arena, Direction.SOUTH);
       /* Coord location = this.getCoord();
        int x = location.getX();
        int y = location.getY();
        this.fire(arena, x+1, y);
        this.fire(arena, x+1, y); */

        List<Ship> targets = this.getNearbyShips (arena);
        if (targets.size() > 0){
           for (int i = 0; i <= targets.size(); i++){
                Ship ship = targets.get(0);
                Coord location = ship.getCoord();
                if (this.isSameTeamAs(targets.get(0))){
                // This is my team
                } else {
                    int x = location.getX();
                    int y = location.getY();
                    this.fire(arena, x, y);
                }
            }
        }
    }
}
