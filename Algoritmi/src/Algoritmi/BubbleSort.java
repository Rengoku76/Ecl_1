package Algoritmi;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {0, 2, 5, 3, 4};
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                
                System.out.println("i="+ (i+1) + i + ", j=" + j + ", ������: " + Arrays.toString(arr));
            }
        }
    }
}