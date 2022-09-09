package Task3;

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
        System.out.println(isBisected(array) ? "True" : "False");
    }

    //determines whether the array can be divided into two parts, the sum of which will be equal to
    public static boolean isBisected(int[] array) {
        double halfSumArray = 0, tempHalfSumArray = 0;

        //finds hulfsum of array
        for (int i : array) {
            halfSumArray+=i;
        }
        halfSumArray/=2;

        //successively finding partial sums of an array and comparing them with half the sum of the array
        for (int i=0; i<array.length; i++) {
            tempHalfSumArray += array[i];
            if (tempHalfSumArray==halfSumArray && i!=array.length-1) {
                return true;
            }
        }
        return false;
    }
}