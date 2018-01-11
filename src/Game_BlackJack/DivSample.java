package Game_BlackJack;

class Division{
    
    public static void main(String a[]){
       int result = 0;
    int loopVar=81;
    System.out.println("This program is to print counts the number of numbers between 1 and 1 million that are evenly divisible by 9, 13, 27, or 81  ");
    System.out.println("=========>>>>>>>>>");
    while(loopVar<1000000){
        
        if(loopVar % 13 == 0 || loopVar % 9==0 || loopVar % 27==0 || loopVar % 81==0){
           
				
				result = result + 1; // counting variable incremnts
                    }	
        
      loopVar =loopVar+1;
    }
    
		System.out.println("Answer is  "+result);
                System.out.println("=========>>>>>>>>>");
	
    }
}  