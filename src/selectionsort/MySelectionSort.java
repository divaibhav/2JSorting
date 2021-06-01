package selectionsort;

import java.util.Arrays;

public class MySelectionSort {
    public static void main(String[] args) {
        int[] arr = {12,8,16,5,2};
        System.out.println("unsorted --> " + Arrays.toString(arr));
        MySelectionSort obj = new MySelectionSort();
        obj.selectionSort(arr);
        System.out.println("sorted --> " + Arrays.toString(arr));
    }
    public void selectionSort(int[] arr){
        //step 1
        int sortedIndex = arr.length;
        int maximumElement;
        int maximumElementIndex;
        //step 2
        for (int i = 0; i < arr.length ; i++) {
            //step 3
            maximumElement = arr[0];
            maximumElementIndex = 0;
            for (int j = 0; j < sortedIndex; j++) {
                if(maximumElement < arr[j]){
                    maximumElement = arr[j];
                    maximumElementIndex = j;
                }
            }
            System.out.println(Arrays.toString(arr));
            System.out.println("maximun element -->" + maximumElement);
            //step 4 swap
            System.out.println("swapping --> " + arr[maximumElementIndex]
                    + " with --> " + arr[sortedIndex -1]) ;
            --sortedIndex;
            int temp = arr[maximumElementIndex];
            arr[maximumElementIndex] = arr[sortedIndex];
            arr[sortedIndex] = temp;
            System.out.println(Arrays.toString(arr));
        }
    }
}
