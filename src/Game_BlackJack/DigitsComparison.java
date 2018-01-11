package Game_BlackJack;

import java.util.Scanner;

public class DigitsComparison {

public static void main(String a[]){
    // this program will check each charecter of a string to the digits and print them.    
 System.out.println("Enter the string: ");
 Scanner scanner = new Scanner(System.in);
 String input = scanner.nextLine(); 
 char[] vowelArray = new char[] {'a','e','i','o','u','A','E','I','O','U'};
 char[] numberArray = new char[] {'0','1','2','3','4','5','6','7','8','9'};
 System.out.println(" In the given - digits  are");
 for(int i=0;i<input.length();i++){ // looping through all charecters in the given string
     
    if(input.charAt(i)!='0' || input.charAt(i)=='1' || input.charAt(i)=='2' || input.charAt(i)=='3' || input.charAt(i)=='4' ||
            input.charAt(i)=='5' || input.charAt(i)=='6' || input.charAt(i)=='7' || input.charAt(i)=='8' || input.charAt(i)=='9'){ // checking each digit falls into 0 to 9 numbers or not
     
    System.out.println(input.charAt(i)); // if the condition is true  printing digits 
              
     }
 }
    
    }
        
} 



