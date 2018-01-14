package challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class BracketCheckerUsingStack {

    public static void bracketCheck(String pattern) throws Exception {
        int size = pattern.length();

        Stack<Character> sChar = new Stack<Character>();
        boolean b= true;

        charSearch:
        for(int j=0; j<size;j++) {
            char ch = pattern.charAt(j);

            switch(ch)
            {
                case '{':
                case '[':
                case '(':
                    sChar.push(pattern.charAt(j));
                    break;
                case '}':
                case ']':
                case ')':
                    if(!sChar.isEmpty()) {
                        char chx = sChar.pop();

                        if((ch=='}' && chx!='{') || (ch==']' && chx!='[') || (ch==')' && chx != '(')) {
                            b=false;
                            break charSearch;
                        }
                    }
                    else {
                        b=false;
                        break charSearch;
                    }
                    break;
                default:
                    break;
            }
        }

        if(sChar.isEmpty() && b==true){
            System.out.println("true");
        }else
            System.out.println("false");
    }

    public static void main(String[] args) throws Exception {
        BracketCheckerUsingStack std= new BracketCheckerUsingStack();

        std.getStringFromConsole();

    }

    @SuppressWarnings("resource")
    public void getStringFromConsole() throws Exception {


        Scanner s = new Scanner(System.in);
        List<String> lines = new ArrayList<String>();

        while(s.hasNextLine()) {
            lines.add(s.nextLine());
        }
        for(String l:lines) {
            bracketCheck(l);
        }
    }
}
