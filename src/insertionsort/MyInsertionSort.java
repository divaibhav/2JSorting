package insertionsort;

public class MyInsertionSort {
    public void insertionSort(int[] arr){
        //step 1
        int sortedIndex = 0;
        //int unsortedIndex = 1;
        //step 2
        for (int unsortedIndex = 1; unsortedIndex < arr.length; unsortedIndex++) {
            //step 3
            int nextElement = arr[unsortedIndex];
            //step 4
            for (int j = unsortedIndex; j > 0 ; j--) {
                //step 5
                if(arr[j] < arr [j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }
    }
}
