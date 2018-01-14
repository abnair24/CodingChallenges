package arrays;

import java.util.Scanner;

/**
 * Created by aswathyn on 23/11/17.
 */
public class SumOfArrays {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int size = s.nextInt();

        int[] arrayA = new int[size];
        int[] arrayB = new int[size];
        int[] arrayC = new int[size];
        System.out.println("Enter arrayA elements");

        for(int i = 0; i < size; i++) {

                arrayA[i] = s.nextInt();

        }

        System.out.println("Enter arrayB elements");

        for(int j=0 ; j < size; j++) {

                arrayB[j] = s.nextInt();

        }

        for(int i=0; i< size; i++) {
          arrayC[i] = arrayA[i] + arrayB[i];
            System.out.println(arrayC[i]);
        }


    }
}
