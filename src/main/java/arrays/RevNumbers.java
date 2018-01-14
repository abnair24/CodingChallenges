package arrays;

import java.util.Scanner;

/**
 * Created by aswathyn on 22/11/17.
 */
public class RevNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int size = s.nextInt();

        int[] array = new int[size];
        System.out.println("Enter array elements");

        for(int i = 0; i < size; i++) {
            //while (s.hasNextInt()) {
                array[i] = s.nextInt();
           // }
        }

        for(int j = size-1 ; j >=0; --j ){
            System.out.println(array[j]+"\n");
        }
    }
}
