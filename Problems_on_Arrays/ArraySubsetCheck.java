package Problems_on_Arrays;
// for checking NOT a contiguous subarray...

import java.util.Arrays;

public class ArraySubsetCheck {
    static boolean bSearch(int elem, int arr[], int n) {
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == elem)
                return true;
            else if (arr[mid] < elem)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return false;
    }

    static boolean isSubset(int arr1[], int m, int arr2[], int n) {
        if (m > n)
            return false;
        Arrays.sort(arr2);
        for (int i = 0; i < m; i++) {
            boolean present = bSearch(arr1[i], arr2, n);
            if (present == false)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        int arr1[] = { 1, 3, 4, 5, 2 };
        int arr2[] = { 2, 4, 3, 1, 7, 5, 15 };

        int m = arr1.length;
        int n = arr2.length;

        boolean ans = isSubset(arr1, m, arr2, n);

        if (ans == true)
            System.out.print("arr1[] is a subset of arr2[]");
        else
            System.out.print("arr1[] is not a subset of arr2[]");

    }
}

// Code for Checking if arr2 is a Contiguous Subarray of arr1

import java.util.*;
public class Main{
    public static boolean isSubset(int[] arr1, int[] arr2){
        int x = arr1.length;
        int y = arr2.length;
        if(y > x){
            return false;
        }
        for(int i=0; i<=x-y; i++){
            int j;
            for(j=0; j<y; j++){
                if(arr1[i+j] != arr2[j]){
                    break;
                }
            }
            if(j == y){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = {2, 3, 4, 7};
        System.out.println(isSubset(arr1, arr2));
    }
}
