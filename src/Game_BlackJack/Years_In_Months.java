
package Game_BlackJack;

import java.util.Scanner;

public class Years_In_Months {
    public static void main(String k[]){
        
        
int large, small, temp ;
    Scanner input_scanner = new Scanner(System.in); // capturing the integer elements into array
    System.out.println("please enter the large no of integer ");
        
        large = input_scanner.nextInt();
    System.out.println("please enter the small  no of integer");
        
        small = input_scanner.nextInt();
        int result =findGCD(large,small);   
        System.out.println(" the GCD of the given numbers is : "+result);
        
    }

    private static int findGCD(int large, int small) {
        
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


