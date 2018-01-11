/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Game_BlackJack;
import java.util.Calendar;
import java.util.Scanner;

public class Ageinmonths  {
int months;
public void getmonth(int birthyear,int birthmonth,int birthday){
Calendar now = Calendar.getInstance();
    int netyears = (now.get(Calendar.YEAR))-birthyear;
         int x=(now.get(Calendar.MONTH) + 1);
        
months=(12*netyears)+((now.get(Calendar.MONTH))-(birthmonth));

}

public static void main(String args[]){
Ageinmonths myage = new Ageinmonths();
Scanner scanner = new Scanner(System.in);
System.out.print("Enter your birth year: ");

int birthYear = scanner.nextInt();
System.out.print("Enter your birth  month: ");
int birthmonth = scanner.nextInt();
System.out.print("Enter your birth date : ");
int birthday = scanner.nextInt();

    System.out.println(" given DATE OF BIRTH : "+birthYear+"-"+birthmonth+"-"+birthday);
    myage.getmonth(birthYear,birthmonth,birthday);
System.out.println("The age of the user in months:" +myage.months);
}
}
