
package Game_BlackJack;




import java.util.Scanner;

public class Test1234 {
    
    
       

    static boolean running = true;

    public static void main(String[] args)

    {
        Scanner selection = new Scanner(System.in);

        while (running)

        {
           
        System.out.println("=========START===========================>");
        
            System.out.println("What would you like to do? ");

            System.out.println("(V)Print vowels");

            System.out.println("(C) Print consonants");

            System.out.println("(N)Printing numbers");

            System.out.println("(E) Solve expression");

            System.out.println("(Q)uit");
            
String inputSelection=selection.next();






           
if(inputSelection.equalsIgnoreCase("V")){
            
    printVowels();
    System.out.println(" ===END===>");
    
        }else if(inputSelection.equalsIgnoreCase("C")){
            
            printConsonants();
            System.out.println(" ===END===>");
             
        }else if(inputSelection.equalsIgnoreCase("N")){
            
            printDigits();
            System.out.println(" ===END===>");
        }else if(inputSelection.equalsIgnoreCase("E")){
            
            solveExpression();
            System.out.println(" ===END===>");
        }else if(inputSelection.equalsIgnoreCase("Q")){
            quit();
            System.out.println(" ===END===>");
        }


        }
 quit();
    }

/**
 * 
 * printing vowels
 * 
 */ 

    public static void printVowels()

    {
        
System.out.println("Please Enter the String ");
       
     Scanner s = new Scanner(System.in);
     int no_of_vowels=0;
     
     String input=s.next();
     System.out.println(" the vowels in this string are:");
     for(char c:input.toCharArray()){
     if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
             c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
         no_of_vowels++;
         System.out.println(c);
     }    
         
         
     }
      
           System.out.println("The no of vowels in string are :"+no_of_vowels);
    
    }
/**
 * 
 * printing consonants
 */
   public static void printConsonants()

    {
        

        
System.out.println("Please Enter the String ");
       
     Scanner s = new Scanner(System.in);
     int no_of_consonants=0;
     
     String input=s.next();
     System.out.println(" the consonants in this string are:");
     for(char c:input.toCharArray()){
     if((c!='a' && c!='e' && c!='i' && c!='o' && c!='u' &&
             c!='A' && c!='E'&& c!='I' && c!='O' && c!='U')&&(!Character.isDigit(c))){
         no_of_consonants++;
         System.out.println(c);
     }    
         
         
     }
     System.out.println("The no of Consonants in string are :"+no_of_consonants);
      
 
    }

 /**
  * Printing digits
  */

    public static void printDigits()

    {
     Scanner s = new Scanner(System.in);
     int no_of_digits=0;
     
     System.out.println("Please Enter the String ");
     String input=s.next();
     System.out.println(" the digits in the in this string are:");
     for(char c:input.toCharArray()){
     if(Character.isDigit(c)){
         no_of_digits++;
         System.out.println(c);
     }    
         
         
     }
        
        System.out.println("The no of digits in string are :"+no_of_digits);
    }

 /**
  * shifting expression
  * 
  */

    public static void solveExpression(){
    
    }
/**
 * this method exits the process from running while loop 
 */
 

    public static void quit()

    {

        running = false;

    }

 

}

 