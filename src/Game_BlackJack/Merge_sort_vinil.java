package Game_BlackJack;




import java.util.*;

public class Merge_sort_vinil {
    
    public static void main(String[] args) {
        // taking static integer array for the sorting method
        int[] input_List = {4, 2, 6, 5, 11, 9, 98, 89};
        System.out.println("before Mergesort : " + Arrays.toString(input_List)); // printing array elements
        sortMethod(input_List);
        System.out.println("after Mergesort:  " + Arrays.toString(input_List));
    }
    // this method takes the input parameter 
    public static void sortMethod(int[] array) {
        if (array.length > 1) {
            // splitting input array into two
            int[] left = leftHalfArray(array);  
            int[] right = rightHalfArray(array);
            
            sortMethod(left); // applying 
            sortMethod(right);
            
            // merge the sorted halves into a sorted whole
            mergingMethod(array, left, right);
        }
    }
    
    // copying first half array into left[].
    public static int[] leftHalfArray(int[] array) {
        int size1 = array.length / 2;
        int[] leftArray = new int[size1];
        for (int i = 0; i < size1; i++) {
            leftArray[i] = array[i];
        }
        return leftArray;
    }
    
    // copying second half array into right[]
    public static int[] rightHalfArray(int[] array) {
        int size1 = array.length / 2;
        int size2 = array.length - size1;
        int[] rightArray = new int[size2];
        for (int i = 0; i < size2; i++) {
            rightArray[i] = array[i + size1];
        }
        return rightArray;
    }
    
    //this method compares the left array elements with right array and swaps them accordingly to make result array.
    static void mergingMethod(int[] result, int[] left, int[] right) {
        int leftIndex = 0;   // index into left array
        int rightIndex = 0;   // index into right array
        
        // looping through the size of input array
        for (int i = 0; i < result.length; i++) {
            if (rightIndex >= right.length || (leftIndex < left.length && left[leftIndex] <= right[rightIndex])) 
            {
                result[i] = left[leftIndex];    // sorting in the left array
                leftIndex++;
            } else {
                result[i] = right[rightIndex];   // sorting right array
                rightIndex++;
            }
        }
    }
 }