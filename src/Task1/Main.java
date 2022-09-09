package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arrayLength;                                            //array length
        int[] array;                                                //array
        Scanner scanner = new Scanner(System.in);                   //input operator

        //input of number of array elements
        do {
            System.out.println("Input number of array elements (>=2):");

            arrayLength = scanner.nextInt();

            if (arrayLength < 2) {
                System.out.println("Array length must be >=2!");
            }
        } while (arrayLength < 2);

        //array declaring
        array = new int[arrayLength];

        //array filling
        for (int i=0; i<arrayLength; i++) {
            System.out.println("Input array[" + i + "]:");
            array[i] = scanner.nextInt();
        }

        //output of filled array
        System.out.println("Filled array:");
        for (int i : array) {
            System.out.print(i + " ");
        }

        //method calling and results outputting
        System.out.println(isSorted(array) ? "True" : "False");
    }

    //checking, is array sorted
    public static boolean isSorted(int[] array) {
        for (int i=0; i < array.length - 1; i++) {
            if (array[i] > array[i+1]) {
                return false;
            }
        }

        return true;
    }
}