package com.company;

import java.util.Arrays;
import java.util.Scanner;

class BubbleSort {
    public void Sorting(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

}
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++)
        {
            int elem = sc.nextInt();
            arr[i] = elem;
        }

        System.out.println(Arrays.toString(arr));

        BubbleSort ob = new BubbleSort();
        ob.Sorting(arr, n);
    }
}
