package Game_BlackJack;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Csc501_Week6 {
   
public static void main(String F[]){
        
 System.out.println(" Hello User, This program prints how many seconds you have lived so far till today by taking your full date of birth. ");
 System.out.println("Please enter the date in the below format: yyyy,Full_Monthname,day  "); 
 System.out.println(" Example: 1989,JANUARY,10"); 

 
Scanner keyboard = new Scanner(System.in);
String input=keyboard.next();

String[] result = input.split(",");
int year=Integer.parseInt(result[0]);

Month month=null;
// the below if-else ladder is to findout the month of the birthdate
if(result[1].equalsIgnoreCase("JANUARY")){
  month= Month.JANUARY;  

}else if(result[1].equalsIgnoreCase("FEBRUARY")){
      month= Month.FEBRUARY;  
}
else if(result[1].equalsIgnoreCase("MARCH")){
      month= Month.MARCH;  
}
else if(result[1].equalsIgnoreCase("APRIL")){
      month= Month.APRIL;  
}
else if(result[1].equalsIgnoreCase("MAY")){
      month= Month.MAY;  
}
else if(result[1].equalsIgnoreCase("JUNE")){
      month= Month.JUNE;  
}
else if(result[1].equalsIgnoreCase("JULY")){
      month= Month.JULY;  
}
else if(result[1].equalsIgnoreCase("AUGUST")){
  month= Month.AUGUST;  
}
else if(result[1].equalsIgnoreCase("SEPTEMBER")){
  month= Month.SEPTEMBER;  
}
else if(result[1].equalsIgnoreCase("OCTOBER")){
  month= Month.OCTOBER;     
}
else if(result[1].equalsIgnoreCase("NOVEMBER")){
  month= Month.NOVEMBER;  
}
else if(result[1].equalsIgnoreCase("DECEMBER")){
  month= Month.DECEMBER;  
}



System.out.println(" Entered year is "+year+" month is "+month+" and day is "+Integer.parseInt(result[2]));


if(month!=null)// checking weather month spelled correct or not.
{
    LocalDate today = LocalDate.now();
LocalDate birthday = LocalDate.of(year, month, Integer.parseInt(result[2]));

long p2 = ChronoUnit.DAYS.between(birthday, today); // this caliculates no of days between dates

long lifeSeconds= p2*24*60*60;// caliculating no. of seconds in days obtained

System.out.println(" You have lived "+lifeSeconds+" seconds till today's date which means till first second of the day starts");


}
else 
{
System.out.println(" Given input date of birth is not in the mentioned format. Please include , as mentioned in the sample example");

}
    
}
}