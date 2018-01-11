package Game_BlackJack;
/**
 * 
 * @author tarun kumar 
 * printing Fizz Buzz program in java
 */
public class Fizz_Buzz {
  
    public static void main(String[] args) {
	
		int loopVarible; 
		
		for( loopVarible=1;loopVarible<=100;loopVarible++){
			
                    char temp=tempChar(loopVarible);
			printingSwitch(temp); // printing fizz or buzz 
			
		}

	}
/**
 *  this method returns the charecter 5 or 7 when an input i is divisible by 5 or 7 respectively
 * if divisable by both 5 and 7 , it returns 1
 * @param i
 * @return 
 */
    private static char tempChar(int local) {
        char result=' ';
        int i= local;
   
    if(i%5==0 && i%7==0){ 
      	result='1'; 
	}else if(i%7==0){
      result='7';
     }else if(i%5==0){
     result='5';
    }else {
	System.out.print(" "+i);
     }
        
        return result;
    }
/**
 * printing fizz if input temp =5, buzz if input temp is 7 or FizzBuzz if input temp is 1
 * @param temp 
 */
    private static void printingSwitch(char temp) {
       switch(temp){ 
			
			case '5':
			System.out.print(" "+"Fizz");
			break;
				
			case '7':
			System.out.print(" "+"Buzz");
			break;
                            
                        case '1':
			System.out.print(" "+"FizzBuzz");
			break;
			}
    }
   
}
