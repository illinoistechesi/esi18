package esi18;
import battleship.core.*;
import java.util.List;

/*
 * SimpleShip
 * @author Your Name
 */
public class Aespitia extends Ship {

    public Aespitia() {
        this.initializeName("Aespitia");
        this.initializeOwner("Your Name");
        this.initializeHull(1);
        this.initializeFirepower(2);
        this.initializeSpeed(1);
        this.initializeRange(6);
    }

    /*
     * Determines what actions the ship will take on a given turn
     * @param arena (Arena) the battlefield for the match
     * @return void
     */
    @Override
    protected void doTurn(Arena arena) {

        List<Ship> nearby = this.getNearbyShips(arena);
        
        int numFriends=0;
        int numShots = this.getRemainingShots();
        // loop through the list of nearby ships
        Ship focus = nearby.get(0);
        for (int i = 0; i < nearby.size(); i++) {
            
            if ( this.isSameTeamAs(nearby.get(i)) ) {
                // if same team, don't shoot
                numFriends = numFriends + 1;
            }
            else {
                Ship enemy = nearby.get(i);
                Coord enemyLoc = enemy.getCoord();
                int x = enemyLoc.getX();
                int y = enemyLoc.getY();
               
                while(enemy.getHealth() > 0 && numShots > 0) {
                    this.fire(arena, x, y);
                    numShots = this.getRemainingShots();
                }
            }
        }
        
        if ( nearby.size() > numFriends ) {
              //boat shouldnt move East, because nearby ship is greater than 0
        }
        
        else{
            this.move(arena,Direction.EAST);
        }
        
        nearby = this.getNearbyShips(arena);
        
        numFriends = 0;
        numShots = this.getRemainingShots();
        // loop through the list of nearby ships
        focus = nearby.get(0);
        for (int i = 0; i < nearby.size(); i++) {
            
            if ( this.isSameTeamAs(nearby.get(i)) ) {
                // if same team, don't shoot
                numFriends = numFriends + 1;
            }
            else {
                Ship enemy = nearby.get(i);
                Coord enemyLoc = enemy.getCoord();
                int x = enemyLoc.getX();
                int y = enemyLoc.getY();
               
                while(enemy.getHealth() > 0 && numShots > 0) {
                    this.fire(arena, x, y);
                    numShots = this.getRemainingShots();
                }
            }
        }
        
    }
}

