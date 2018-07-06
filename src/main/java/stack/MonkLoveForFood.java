package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class MonkLoveForFood {

    public static void main(String[] args)  {

        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int query = 0;

        int numOfQuery = scanner.nextInt();

        for (int i=0;i<numOfQuery;i++){
            query = scanner.nextInt();
            if(query == 1) {
                if(stack.empty()) {
                    System.out.println("No Food");
                } else {
                    System.out.println(stack.pop());
                }
            } else if(query == 2) {
                stack.push(scanner.nextInt());
            }
        }
    }


}
