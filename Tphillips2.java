package esi18; 
import battleship.core.*;
import java.util.List;


/*
 * SimpleShip
 * @author Your Name
 */
public class Tphillips2 extends Ship {
    
    private int waitToMove;
    
    public Tphillips2() {
        this.initializeName("tati");
        this.initializeOwner("TATI");
        this.initializeHull(5);
        this.initializeFirepower(2);
        this.initializeSpeed(1);
        this.initializeRange(2);
        waitToMove = 1;
    }
    
    /*
     * Determines what actions the ship will take on a given turn
     * @param arena (Arena) the battlefield for the match
     * @return void
     */
   @Override
    protected void doTurn(Arena arena) {
        if (waitToMove > 0) {
            waitToMove = waitToMove - 1;
            // do nothing
        }
        else {
            Coord coord = this.getCoord();
            int xLoc = coord.getX();
            int yLoc = coord.getY();
            if (this.getHealth() > 1 ) {
                if (xLoc >= 5) {
                    this.move(arena, Direction.WEST);
                }
                else if (xLoc < 5) {
                    this.move(arena, Direction.EAST);
                }
               if (yLoc < 3) {
                    this.move(arena, Direction.NORTH);
                }
                else if (yLoc >= 5) {
                    this.move(arena, Direction.SOUTH);
                }
            }
           else {
               this.move(arena, Direction.WEST);
           }
            // Get a list of nearby ships
            List<Ship> nearby = this.getNearbyShips(arena);
            // Get the number of shots left on this ship
            int numShots = this.getRemainingShots();
            
            // [e1, f1, e2, e3 ]
            for (int i = 0; i < nearby.size(); i++) {
                if ( this.isSameTeamAs(nearby.get(i)) ) {
                // my group is Tati and Julia
                } else {
                    Ship enemy = nearby.get(i);
                    while(enemy.getHealth() > 0 && numShots > 0) {
                        Coord enemyLoc = enemy.getCoord();
                        int x = enemyLoc.getX();
                        int y = enemyLoc.getY();
                        this.fire(arena, x, y);
                        numShots = this.getRemainingShots();
                    }
                    // if we get here, that means a ship has been sunk
                    // call this function again to update the list to not shoot at a sunk ship
                    // don't need this
                    // nearby = this.getNearbyShips(arena);
                }
            }
        }
    }
    
}