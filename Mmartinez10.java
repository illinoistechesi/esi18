package esi18; 
import battleship.core.*;
import java.util.List;

/*
 * SimpleShip
 * @author Your Name
 */
public class Mmartinez10 extends Ship {
    
    public Mmartinez10() {
        this.initializeName("Sweet");
        this.initializeOwner("The Dank Armada");
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
     @Override
    protected void doTurn(Arena arena) {
        this.move(arena, Direction.EAST);
        List<Ship> nearby = this.getNearbyShips(arena); 
        for(int i=0; i<nearby.size(); i++){
            if (this.isSameTeamAs(nearby.get(i))){
                //my team 
                // System.out.println("friend ship");
            }
            else{
                // System.out.println("enemy ship");
                Ship target = nearby.get(i);
                Coord coord = target.getCoord();
                this.fire(arena, coord.getX(), coord.getY()); 
                
            }
        
        }
    }
    
}