package quicksort;

import java.util.Arrays;

public class MyQuickSort {
    public static void main(String[] args) {
        int[] arr = {25,2,8,60,3,50, 9, 1};
        int lower = 0;
        int upper = arr.length - 1;
        System.out.println("unsorted --> " + Arrays.toString(arr));
        MyQuickSort obj = new MyQuickSort();
        obj.quickSort(arr,lower, upper);
        System.out.println("sorted --> " + Arrays.toString(arr));
    }
    public void quickSort(int[] arr, int lower, int upper){
        //step 1
        if(lower >= upper){
            return;
        }
        //step 2
        int pivotIndex = partition(arr, lower, upper);
        System.out.println("pivot index = " + pivotIndex);
        //step 3
        System.out.println("sorting left");
        quickSort(arr, lower, pivotIndex - 1);

        //step 4
        System.out.println("sorting right");
        quickSort(arr, pivotIndex + 1 , upper);
    }

    private int partition(int[] arr, int lower, int upper) {
        //step 1
        int pivot = arr[lower];
        System.out.println("pivot --> " + pivot);
        //step 2
        int down = lower;
        //step 3
        int up = upper;
        //step 4
        while (down < up){
            //step 4(a)
            while(down <= upper && arr[down] <= pivot){
                down = down + 1;
            }
            //step 4(b)
            while(up >= lower && arr[up] > pivot){
                up = up -1;
            }
            //step 4(c)
            if(down < up){
                System.out.println("swaping --> " + arr[down] + " with -->" + arr[up]);
                int temp = arr[down];
                arr[down] = arr[up];
                arr[up] = temp;
            }
        }
        System.out.print("Array --> ");
        print(arr, lower, upper);
        System.out.println();
        //step 5
        System.out.println("swaping --> " + arr[lower] + " with -->" + arr[up]);
        arr[lower] = arr[up];
        arr[up] = pivot;
        System.out.print("Array --> ");
        print(arr, lower, upper);
        System.out.println();
        //step 6
        return up;
    }
    void print(int [] arr, int lower, int upper){
        for (int i = lower; i <= upper ; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
