package Game_BlackJack;

import java.util.Scanner;

public class ConsonantsPrinting {

public static void main(String a[]){
    // this program will check each charecter of a user input with characters of vowels array and number array to check the existance
 System.out.println("Enter the string: ");
 Scanner scanner = new Scanner(System.in);
 String input = scanner.nextLine(); 
 char[] vowelArray = new char[] {'a','e','i','o','u','A','E','I','O','U'};
 char[] numberArray = new char[] {'0','1','2','3','4','5','6','7','8','9'};
 
 System.out.println(" In the given string consonants are");
 for(int i=0;i<input.length();i++){ // looping through all charecters in the given string
if((!new String(vowelArray).contains(String.valueOf(input.charAt(i)))) && 
        !new String(numberArray).contains(String.valueOf(input.charAt(i)))
        ){  // changing each character to string and checking with charecter array consists it or not    
    System.out.println(input.charAt(i)); // if the condition is true  printing consonants 
              
     }
 }
    
    }
        
} 




