/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Game_BlackJack;

import java.util.Scanner;

public class Fib {
    
public static void main(String p[]){
    
    Scanner s=new Scanner(System.in);
    
    System.out.print("Please enter the number of fibanacci numbers you want :");
    String input=s.next();
    int looper=Integer.parseInt(input);

     for (int counter = 1; counter <= looper; counter++){
      System.out.print( printFibanacci(counter)+"  ");
  }
}
/**
 * 
 * this method is a recursive call to the numbers
 * 
 * 
 * @param input
 * @return 
 */

    private static int printFibanacci(int input) {
    if ((input == 0) || (input == 1)) // base cases
      return input;
    else
           return printFibanacci(input - 1) + printFibanacci(input - 2);  // this is recursive step
    
    }


}
