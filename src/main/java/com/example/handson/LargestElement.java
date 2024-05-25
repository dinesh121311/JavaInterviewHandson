package com.example.handson;

public class LargestElement {

    public static int findLargest(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int largest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 3, 9, 2};
        System.out.println("Largest element: " + findLargest(array));
    }
}
