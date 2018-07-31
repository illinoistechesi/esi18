package esi18; 
import battleship.core.*;
import java.util.List;

/*
 * SimpleShip
 * @author Your Name
 */
public class Amartinez2 extends Ship {
    
    public Amartinez2() {
        this.initializeName("Patrick Star");
        this.initializeOwner("Your Name");
        this.initializeHull(1);
        this.initializeFirepower(4);
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
        this.move(arena, Direction.EAST);
        
        List<Ship> nearby = this.getNearbyShips(arena);
        
        for (int i = 0; i < nearby.size(); i++) { 
            Ship other = nearby.get(i);
            boolean isOnMyTeam = this.isSameTeamAs(other);
            if (isOnMyTeam) {
                // System.out.println("This ship is on my Team!");
            } else {
                // System.out.println("This ship is an enemy.");
                // Ship other = nearby.get(i);
                Coord placement = other.getCoord();
                int enemyx = placement.getX();
                int enemyy = placement.getY();
                // while loop: fire until enemy sinks
                int health = other.getHealth();
                while (health > 0) {
                    this.fire(arena, enemyx,enemyy);
                    health--;
                }
                // for loop equivalent of fire until sink
                // for (int health = other.getHealth(); health > 0; health--) {
                //     this.fire(arena, enemyx,enemyy);
                // }
            }
        }
    }
}