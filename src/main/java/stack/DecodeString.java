package stack;


//Given an encoded string, return its corresponding decoded string.
//
//        The encoding rule is: k[encoded_string], where the encoded_string inside the
// square brackets is repeated exactly k times. Note: k is guaranteed to be a positive integer.
//
//        Note that your solution should have linear complexity because this is what you will be asked during an interview.
//
//        Example
//
//        For s = "4[ab]", the output should be
//        decodeString(s) = "abababab";
//
//        For s = "2[b3[a]]", the output should be
//        decodeString(s) = "baaabaaa";
//
//        For s = "z1[y]zzz2[abc]", the output should be
//        decodeString(s) = "zyzzzabcabc".


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DecodeString {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();

        String s = "z1[y]zzz2[abc]";
        String d ="";
        String str = "";
        String out ="";

        for(int i=0;i< s.length();i++){
            if(Character.isDigit(s.charAt(i))) {
                if(!str.isEmpty())
                {
                    stack.push(str);
                    str="";
                }
                d+= s.charAt(i);
            } else if("[".equals(Character.toString(s.charAt(i)))) {
                stack.push(d);
                d="";
                stack.push("[");
            } else if("]".equals(Character.toString(s.charAt(i)))) {
                if(!str.isEmpty())
                {
                    stack.push(str);
                    str="";
                }
                String stackOut = "";
                while(!stack.peek().equals("[")) {
                    stackOut = stack.pop()+stackOut;
                }
              stack.pop();
                int factor = Integer.valueOf(stack.pop());
                String result="";
                for(int i1 = 0; i1 <factor; i1++)
                {
                    result = result + stackOut;
                }
                str= result;
            } else {
                str += Character.toString(s.charAt(i));
            }
        }
        List<String> list = new ArrayList<String>(stack);

        for (String x: list) {
            out = out.concat(x);
        }
        System.out.println(out+str);

    }

}
