package esi18; 
import battleship.core.*;
import java.util.*;

/*
 * SimpleShip
 * @author Your Name
 */
public class Rgarciaescobedo extends Ship {
    
    public Rgarciaescobedo() {
        this.initializeName("meurtre");
        this.initializeOwner("Uriel");
        this.initializeHull(6);
        this.initializeFirepower(1);
        this.initializeSpeed(2);
        this.initializeRange(1);
    }
    
    /*
     * Determines what actions the ship will take on a given turn
     * @param arena (Arena) the battlefield for the match
     * @return void
     */
    // doTurn Example, place in your ship class
 @Override
    protected void doTurn(Arena arena) {
        Coord location = this.getCoord();
        this.move(arena, Direction.EAST);
        this.move(arena, Direction.EAST);

        List<Ship> nearby = this.getNearbyShips(arena);
        // nearby = [e1, f1, e2]
        // i = 0
        // enemy = 
        
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
// @Override
// protected void doTurn(Arena arena) {
//     // your implementation of a ship
//      int numMoves = this.getRemainingMoves();
    
//         while(numMoves > 0) {
//             // move north, west until there's only one turn left
//             this.move(arena, Direction.NORTH);
//             this.move(arena, Direction.WEST);
//             // update the number of turn remaining
//             numMoves = this.getRemainingMoves();
//         }
//         this.move(arena, Direction.EAST);
//     // gets the current location of the ship
//   /* Coord coord = this.getCoord();
//     int x = coord.getX();
//     int y = coord.getY();

//     if (x > 2) {
//         this.move(arena, Direction.WEST);
//     }
//     else if (x < 2) {
//         this.move(arena, Direction.EAST);
//     }
//     else if (y > 8) {
//         this.move(arena, Direction.NORTH);
//     }
//     else if (y < 2) {
//         this.move(arena, Direction.SOUTH);
//     }
//     else {
//         // make a list of all the location, and store it in a variable
//         Direction[] possibleMovement = {Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST};

//         // get a random number and store it in a variable
//         int randomNumber = arena.getRandom().nextInt(4);

//         // get a random movement by using the random number to access one possibleMovement
//         this.move(arena, possibleMovement[randomNumber]);
//     }

//     // ship using this instruction will fire at location (x: 0, y: 0) each turn
//     this.fire(arena, 0, 0);
//     }
    
//     */
// }