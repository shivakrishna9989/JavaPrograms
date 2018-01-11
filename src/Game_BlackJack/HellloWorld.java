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
public class HellloWorld {

    
    
   public static void main(String[] args) {
  int[] arr = new int[3];
   arr[1]=3;
   arr[1]=4;
   arr[1]=6;
      System.out.print(doSomething(arr));
   }
       public static int doSomething(int[] ar) {
  int val = -1;
  for(int i = 0; i < ar.length; i++) {
   if(ar[i] % 3 == 0 && ar[i] > val) {
      val = ar[i];
    }
  }
 return val;
}}
       
       
       
       
   
 

//To compile this java class. we run $javac HelloWorld.java in the java folder through command prompt.
  //      after successful compilation, It will generate .class file in the same location. 
    //            To run: we use java HelloWorld command. it will print the String Hello, World.
