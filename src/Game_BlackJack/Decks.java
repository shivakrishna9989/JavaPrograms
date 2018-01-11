package Game_BlackJack;

import java.util.Random;
// this class refers to decks of cards which draws 1 to 11 numbers 11 is for King, Queen and Jack 
   public class Decks {

         private final int value;

    Decks(){ // return a numhber between 1 to 11 from Random fucnction
        int min = 2;
        int max = 11;
        int range = (max - min);

        int random = new Random().nextInt(range + 1) + min;// generates 1 to 11 numbers.
       
        value = random;
    }

    public int getValue(){
        return value;
    }

}
    
    

