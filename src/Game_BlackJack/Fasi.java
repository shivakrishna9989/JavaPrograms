package Game_BlackJack;

import java.util.Scanner;


public class Fasi {
    
    public static void main(String p[]){
        
        Scanner keyboard = new Scanner(System.in);

        
   System.out.println("Hello User.\n"
           + " choose 1 for Generating Decimal equivalant of given number and radix \n"
           + " choose 2 for Output number format stream of an equivalant of given number and radix \n");
   
   
   String input=keyboard.next();
   
   if(Integer.parseInt(input)==1){
       
       System.out.println(" Please enter the input number format stream :");
       String num=keyboard.next();
       
             System.out.println(" Please enter the radix number from 1 to 36 :");  
      String radixNum=keyboard.next();
      int radix=Integer.parseInt(radixNum);
      
       int resultTotal=baseToDecimal(num,radix);
       
       System.out.println(" Decimal Result for given input string is "+resultTotal);
       
   }else if(Integer.parseInt(input)==2){
   
       System.out.println(" Please enter the input number in decimal format :");
      String num=keyboard.next();
        int inputNum=Integer.parseInt(num);
        
        System.out.println(" Please enter the radix number from 1 to 36 :");
      String radixNum=keyboard.next();
      int radix=Integer.parseInt(radixNum);
      
       String resultTotal=decimalToBase(inputNum,radix);
       
       System.out.println(" Result stream with given radix "+radix+ " and for given input string is "+resultTotal);
     
    }else{
       System.out.println(" Please run the application again by choosing an appropriate option ");
       
   } 
    }
    /**
    *static int baseToDecimal(String num, int radix) - 
    * this method should take in a string representing a number and the base (or radix) 
    * of that number and should convert that number to its decimal equivalent and return that value as an int.  
    * You may assume that radix is a number between 1 and 36.
    * @param num
    * @param radix
    * @return 
    */
        public static int baseToDecimal(String num, int radix){
    
            int result=0 ;
            int looper=num.length()-1;
            
            for(int i=0;i<num.length();i++){
                                
                char ch=num.charAt(looper);
                int digit=Integer.parseInt(num.valueOf(ch));
                              
                int local=(int) Math.pow(radix, i);
                              
                result+= digit*local ;
                looper--;
                             
            }
                   
            
      return result;
        }
        
 /**
  * static String decimalToBase(int number, int radix) - 
  * this method should take in a decimal number as an int and the base (or radix) 
  * you wish to convert that number to and return the String version of the decimal number in that base.
  * @param number
  * @param radix
  * @return 
  */       
        
        static String decimalToBase(int number, int radix){
            String result="";
            int remainder;
            int bylocal;
            
    if (number <= 1) {
            System.out.print(number);
            return result+number;
        }
    else {
        if(radix>1){   
            
        bylocal=number/radix;
         remainder=number%radix;
         result=remainder+result;
           while(bylocal>=radix){
               remainder=bylocal%radix;
                 
          
           
        result=remainder+result;
           
        
       bylocal=bylocal/radix;
           }
           
           result=bylocal+result;
           
        }
        
        }
            
       
    
    
      return result;
        }
    

         
         
         
         
    
            
    
}
