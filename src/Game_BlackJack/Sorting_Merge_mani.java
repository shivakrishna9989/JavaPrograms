package Game_BlackJack;

public class Sorting_Merge_mani {
    
    public static void main(String[] args) {

        int[] inputArray={1,3,5,6,9,2,11,12,24}; //input array consists of integers
        
        mergeSort(inputArray);// calling method with argument as input array
        //printing output sorted array
        for(int x:inputArray){
            System.out.print("  "+x);
        }
        
    
    }
    static void mergeSort(int[] inputArray) {
        int arraySize = inputArray.length;
        if (arraySize < 2){
            return;
        }
        int mid = arraySize / 2;
        int leftSize = mid;// declaring left side array with half of array size
        int rightSize = arraySize - mid;//// declaring right side array half of array size
        
        int[] left = new int[leftSize];
        int[] right = new int[rightSize];
        for (int i = 0; i < mid; i++) {
            left[i] = inputArray[i];
        }
        for (int i = mid; i < arraySize; i++) {
            right[i - mid] = inputArray[i];
        }
        // repeating loop for all sub arrays 
        mergeSort(left); 
        mergeSort(right);
        
        // preparing final array with sorted sub arrays
        merge(left, right, inputArray);
    }
//this method simply prints merge sort 
    public static void merge(int[] left, int[] right, int[] arr) {
        int leftSize = left.length;
        int rightSize = right.length;
        
        int i = 0, j = 0, k = 0; // looping variables 
        
        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) { 
                arr[k] = left[i];// moving first small element to the input array position
                i++;
                k++;
            } else {
                arr[k] = right[j]; // moving first small element to the input array position
                k++;
                j++;
            }
        }
        while (i < leftSize) { // if uneven size of the input array present
            arr[k] = left[i]; // adding still left array has an element left
            k++;
            i++;
        }
        while (j < leftSize) { // if uneven size of the input array present
            arr[k] = right[j]; // adding still left array has an element left
            k++;
            j++;
        }
    }
}

