// DESCRIPTION -- In this code I am going to implement linear search on arrays in java.

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println("How many elements you want to enter in the array.");
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int[] intArray = new int[arrayLength];
        System.out.println("Enter elements.");
        for (int i = 0; i < arrayLength; i++) {
            int ele = sc.nextInt();
            intArray[i] = ele;
        }
        for (int ele : intArray) {
            System.out.print(ele + " ");
        }
        System.out.println();
        System.out.println("Enter the element you want to search.");
        int searchEle = sc.nextInt();
        int k = 0;
        int index = -1;

        for (int j = 0; j < intArray.length; j++) {
            if (intArray[j] == searchEle) {
                k = 1;
                index = j;
            }
        }
        if (k == 1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element doesn't exist in this array.");
        }

        sc.close();
    }
}
