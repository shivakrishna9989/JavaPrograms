/*
 * this class randomly generates 2 pairs of 2 cards with faces 1 to 10 and
 *add them together diclares the winner with highest count
 */

package Game_BlackJack;

import java.util.Random;

public class BlackJack_sample {
    public static void main(String k[]){
    int a,b,c,d;
    
    Random r = new Random();
    
    System.out.println(" player 1");
    
    
    
     a =(r.nextInt((10 - 1) + 1) + 1);; 
	 b =(r.nextInt((10 - 1) + 1) + 1);; 
        System.out.println(" first card and second values are "+a+ " and "+b+". the total will be :"+(a+b));
        
        
        
        System.out.println("For player 2");
     c =(r.nextInt((10 - 1) + 1) + 1);
	 d =(r.nextInt((10 - 1) + 1) + 1);; 
        System.out.println(" first card and second values are "+c+ " and "+d+". the total will be :"+(c+d));
        
        if((a+b)>(c+d)){
        System.out.println(" first Player is the winner");    
        }else if ((a+b)<(c+d)){
        System.out.println(" second Player is the winner" );
        }else {
            System.out.println("Both players has same score" );
        }
}
    
     
     
     
}