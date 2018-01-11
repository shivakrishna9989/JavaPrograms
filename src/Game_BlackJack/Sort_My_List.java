package Game_BlackJack;
import java.util.Scanner;

public class Sort_My_List {


  public static void main(String []args) throws Exception {
    int count_of_inputSize, temp_buffer;
    Scanner input_scanner = new Scanner(System.in); // capturing the integer elements into array
    System.out.println("please enter the no of integer values to sort");
    count_of_inputSize = input_scanner.nextInt();
     int input_array[] = new int[count_of_inputSize]; // initialization of input array
     System.out.println("Please enter " + count_of_inputSize + " integers : ");
 
    for (int i = 0; i < count_of_inputSize; i++) 
      input_array[i] = input_scanner.nextInt();
 
    for (int i = 0; i < ( count_of_inputSize - 1 ); i++) {
      for (int j = 0; j < count_of_inputSize - i - 1; j++) {
          // swapping loop by checking each element with next element to it
        if (input_array[j] > input_array[j+1]) 
        {
           temp_buffer = input_array[j]; // storing first value into temporary buffer
           input_array[j] = input_array[j+1];// swapping logic
           input_array[j+1] = temp_buffer;
        }
      }
    }
 
    System.out.println("The sorted output integers for the given input array are:");
 
    for (int k = 0; k < count_of_inputSize; k++) 
      System.out.println(input_array[k]);
  }
}

