
package Game_BlackJack;

public interface TurnPlayer {
    void gameStartup();  
    void drawCard(); // drawing card
    boolean wantToStay(); // stay or hit 
    int getTotal(); // returning total all the draws 
 }


    
    
    
