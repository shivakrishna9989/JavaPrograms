package Game_BlackJack;

public class Merge_Sort {

    void merge(int arr[], int l, int mid, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = mid - l + 1;
        int n2 = r - mid;
        
        int L[] = new int [n1];
        int R[] = new int [n2];
 
 // copying two half size arrays into L[] and R[] arrays for sorting
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[mid + 1+ j];
 
        int i = 0, j = 0; // used for pointing variables of sub arrays
 
        // starting subarray with an indexx pointed by k as 1 position
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        
        while (i < n1)         {
            arr[k++] = L[i++];
            
        }
      while (j < n2)        {
            arr[k++] = R[j++];
            
        }
    }
 
    //this method is used to sort the elements 
    void doSort(int arr[], int l, int r)
    {
        if (l < r)
        {
            // Find the middle point..
            int mid = (l+r)/2;
 
            // Sort first and second halves..
            doSort(arr, l, mid);
            doSort(arr , mid+1, r);
 
            // Merge the sorted halves..
            merge(arr, l, mid, r);
        }
    }
 

    public static void main(String args[])
    {
        int input[] = {98,89,88,79,69,91,59,49,45};
 
        System.out.println("Given input integer element Array is :");
        printArrayToConsole(input);
 
        Merge_Sort msort = new Merge_Sort();
        msort.doSort(input, 0, input.length-1);
 
        System.out.println(" Sorted array using merge sort algorithm is : ");
        printArrayToConsole(input);
    }

    /* this function is usede to loop over all the array elements and print them */
    static void printArrayToConsole(int input[])
    {
        int n = input.length;
        for (int i=0; i<n; ++i){
            System.out.print(input[i] + " ");}
        System.out.println(" ");
    }
 
}
