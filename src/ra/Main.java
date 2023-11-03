package ra;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random ran = new Random();
        StopWatch watch = new StopWatch();
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(100000);
        }
        System.out.println(Arrays.toString(arr));
        watch.start();
        sort(arr);
        watch.stop();
        System.out.println("Thời gian sắp xếp : " +watch.getElapsedTime());

    }
   public static void sort(int arr[])
    {
        int n = arr.length;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min])
                    min = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
