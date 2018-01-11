package Game_BlackJack;

public class FindEasterDateAndMonth {
    public static void main(String[] args) {
        int input=2020;
   
        System.out.println(" the year "+input+" is taken for caliculating Easter day");
        System.out.println("*****");
        System.out.println("*****");
        
        String month_name=null;
        
        int []resultArray=   findEaster(input);
        month_name= monthName(resultArray);
        System.out.println("==>>");
        System.out.println("==>>");
        System.out.println("==>>");

        System.out.println("For the year "+input+" the Easter Sunday will be on "+resultArray[0]+"th day of "+month_name+" month.");
           System.out.print("==>> The END");
   
    }

    private static int[] findEaster(int input) {
        
        int resultArray[]=new int[2];
        int A=0,B=0,C=0,D=0,E=0,F=0,G=0,H=0,M=0,J=0,K=0,L=0,N=0,P=0;
    System.out.println(" caliculating parameters for identifying easter month and date in the given year");
    A=input%19;
    B = input/100;
    C= input%100;
    D=B/4;
    E=B%4;
    G = (8*B+13)/25;
    H = (((((19*A)+B)-D)-G)+15)%30;
    M = (A+(11*H))/310;
    J=C/4;
    K=C%4;
    L= ((2*E)+(2*J)-K-H+M+32)%7;
    N=(H-M+L+90)/25;
    P=(H-M+L+N+19)%32;
    
   resultArray[0]=P;
   resultArray[1]=N;
        
        return resultArray;
    }

    private static String monthName(int[] resultArray) {
        String result =null;
        
        switch (resultArray[1]){  
  case 1:
 result="January";
 break;
  case 2:
  result= "February";
  break;
  case 3:
 result="March";
 break;
  case 4:
  result="April";
  break;
  case 5:
  result="May";
  break;
  case 6:
  result="june";
  break;
  case 7:
  result="july";
  break;
  case 8:
  result="august";
  break;
  case 9:
  result="september";
  break;
  
  case 10:
  result="october";
  break;
  case 11:
  result="november";
  break;
  case 12:
  result= "december";
  default:
  System.out.println("Invalid month number");
  }        
       return result;
    }
    
}
