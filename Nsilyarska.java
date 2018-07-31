package esi18; 
import battleship.core.*;
import java.util.List;

/*
 * SimpleShip
 * @author Your Name
 */
public class Nsilyarska extends Ship {
    
    public Nsilyarska() {
        this.initializeName("Simple Ship");
        this.initializeOwner("Your Name");
        this.initializeHull(2);
        this.initializeFirepower(3);
        this.initializeSpeed(4);
        this.initializeRange(1);
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
        this.move(arena, Direction.EAST);
        this.move(arena, Direction.EAST);
        
        List<Ship> nearby = this.getNearbyShips(arena);
        for(int i = 0; i<nearby.size();i++){
            if (this.isSameTeamAs(nearby.get(i))){
                //friend no fire
            }
            else{
                 Coord location = nearby.get(i).getCoord();
                int x = location.getX();
                int y = location.getY();
                this.fire(arena, x, y);
            }
            
        }
        
    }
    
}