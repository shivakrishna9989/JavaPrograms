/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Game_BlackJack;

/**
 *
 * @author Akhilkondra
 */
public class TestingVinil {
    public static void main(String g[]){
        
        
        
          
                //define the limit
                int limit = 100000;
               
                System.out.println("Printing Odd numbers between 1 and " + limit);
               
                for(int i=1; i <= limit; i++){
                       
                        //if the number is not divisible by 2 then it is odd
                        if( i % 2 != 0){
                                System.out.print(i + " ");
                        }
                }
        }


    
}
