package esi18; 
import battleship.core.*;
import java.util.List;


public class ZKyledipietropaolo extends Ship {
    
    public ZKyledipietropaolo() {
        this.initializeName("Shipy");
        this.initializeOwner("Zoe");
        this.initializeHull(5);
        this.initializeFirepower(3);
        this.initializeSpeed(0);
        this.initializeRange(2);
    }
   
  
   public void watchAndWait(Arena arena){
      
    boolean target = false; 
        
    List<Ship> targets = this.getNearbyShips(arena);
    
    // Ship enemy = targets.get(i);
  
    // boolean isOnMyTeam = this.isSameTeamAs(enemy);
    Coord targetLocation;
    for (int index = 0; target == true ; index += 1) {
     
        Ship enemy = targets.get(index);
        boolean isOnMyTeam = this.isSameTeamAs(enemy);
        if (isOnMyTeam){

        }
        else {
            if((enemy.getHealth() < this.getFirepower())){
                target = true;
                targetLocation = enemy.getCoord();
                int x = targetLocation.getX();
                int y = targetLocation.getY();
                this.fire(arena, x, y);  
            }
            else{
                
            }
        }
        // return target;
    }

   
   //public void turnAction (boolean target){
       
    //   if(target){
         
    //      if (arena.isInRange(this, enemy)) {
    //      int x = targetLocation.getX();
    //     int y = targetLocation.getY();
    //     this.fire(arena, x, y);  
    //      }
    //   }
    //   else{
           
    //   }
   //}
   
       
   }
  // public 

    @Override
   protected void doTurn(Arena arena) {
        
        watchAndWait(arena);
        
        
      
        
        
    }
    
}