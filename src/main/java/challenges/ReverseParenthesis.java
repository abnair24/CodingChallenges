
/*
You have a string s that consists of English letters, punctuation marks, whitespace characters,
and brackets. It is guaranteed that the parentheses in s form a regular bracket sequence.

Your task is to reverse the strings contained in each pair of matching parentheses,
starting from the innermost pair. The results string should not contain any parentheses.

Example

For string s = "a(bc)de", the output should be
reverseParentheses(s) = "acbde".
 */
package challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReverseParenthesis {

    public static char[] input = "abc(cba)ab(bac)c".toCharArray();

    public static void main(String[] args) {
        String inputString = "";
        Stack<String> stack = new Stack<String>();
        String out = "";
        for (int i = 0;i < input.length;i++) {

            if (input[i] == '(') {

                stack.push(inputString);
                stack.push(Character.toString(input[i]));
                inputString = "";

            } else if (input[i] == ')') {

                inputString = reverseString(inputString);

                while (!("(".equals(stack.peek()))) {
                    inputString = inputString.concat(reverseString(stack.pop()));
                }

                if ("(".equals(stack.peek())) {

                    stack.pop();
                    stack.push(inputString);
                    inputString = "";

                }
            } else {

                inputString = inputString.concat(Character.toString(input[i]));
                if (i == input.length - 1) {
                    stack.push(inputString);

                }
            }
        }
        List<String> list = new ArrayList<String>(stack);

        for (String x: list) {
            out = out.concat(x);
        }
        System.out.println(out);
    }

    public static String reverseString(String inp) {
        char[] original = inp.toCharArray();
        String reversed = "";

        for (int i = original.length-1; i>=0; i--) {
           reversed = reversed.concat(Character.toString(original[i]));
        }
        return reversed;
    }


}
