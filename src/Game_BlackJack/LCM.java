
package Game_BlackJack;

import java.util.Scanner;
/**
 * this class uses the Find_GCD class and the method used to find GCD of given numbers
 * and returns the LCM of given numbers
 * 
 * @author tarun kumar
 */
public class LCM {

public static void main(String p[]){
    
int large, small;
        
    Scanner input_scanner = new Scanner(System.in); // capturing the integer elements into array
    System.out.println("please enter the large no of integer ");
        
        large = input_scanner.nextInt();
    System.out.println("please enter the small  no of integer");
        
        small = input_scanner.nextInt();
        Find_GCD fgcd= new Find_GCD();
        int resultGCD = fgcd.findGCD(large,small);   
        System.out.println(" the GCD of the given numbers is : "+resultGCD);
        int resultLCM = findLCM(large,small,resultGCD);   
        System.out.println(" Result LCM of given numbers "+large+ " and "+small+ " is "+ resultLCM);
    
}    
/**
 * this method returns the LCM from GCD and given numbers 
 * The formulae used is LCM * GCD = product of numbers given.
 * @param large
 * @param small
 * @param resultGCD
 * @return 
 */
    private static int findLCM(int large, int small, int resultGCD) {
        int result;
    
    result = (large*small)/resultGCD;
    return result;
    }
    
    
}
/**
 * 
 * @author tarun kumar
 *  this class returns the GCD of given two numbers
 */
 class Find_GCD{
     
     int findGCD(int large, int small) {
        
        int result=0,temp;
        if(large%small==0){
            result=small;
        }else{
            temp=large%small;
            large=small;
            small=temp;
            return findGCD(large, small);
        }
        
        return result;
    }
 }


