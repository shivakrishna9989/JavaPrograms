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
public class Final {
    public static void main(String k[]){
//    int[] inputArray = new int[50];
//
//    for(int i=0;i<50;i++){
//        inputArray[i]=0;
//        
//    }
//    
//    System.out.println(" dsfadsf"+inputArray[48]);
//    
//    
//    
    int x=107;
    int p=x/16;
    int s=x%16;
    
        System.out.println("   adsfdafs "+p+" adsf "+s);
        
        
       String  inputString="shiva";
        String result="";
        char[] charArray= inputString.toCharArray();
            for (int i=charArray.length-1;i>=0;i--)
          //  System.out.print(charArray[i]);
    
            
      //char[] charArray= inputString.toCharArray();
        //    for (int i=charArray.length-1;i>=0;i--)
result+=charArray[i];
    
              System.out.print(result);
    
    }
    
    public static String stringRev(String inputString){
        
        String result="";
      char[] charArray= inputString.toCharArray();
            for (int i=charArray.length-1;i>=0;i--)
result+=charArray[i];
        
    return result;
    }
    
    
    
    
}
