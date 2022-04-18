package com.company;

import java.util.Scanner;

public class BinSearch {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for(int i = 0; i < n; i++)
        {
            int elem = sc.nextInt();
            arr[i] = elem;
        }

        System.out.println("Enter search element: ");
        int srch = sc.nextInt();

        BinSearch ob = new BinSearch();
        int index = ob.Binsrch(arr, n, srch);
        System.out.println(index);

    }

    public int Binsrch(int[] arr, int n, int key) {
        int high = n - 1 ;
        int low = 0;
        int index = 0;

        for (int i = low; i < high; i++)
        {
            int mid = (high + low)/2;
            if (arr[mid] == key)
            {
                index = mid;
            }
            else if (arr[mid] > key)
            {
                high = mid - 1;
            }
            else if (arr[mid] < key)
            {
                low = mid + 1;
            }

        }

        return index;
    }

}
