package challenges;

import java.util.*;

public class BracketChecker {

    public static void main(String[] args) throws Exception {
        BracketChecker std = new BracketChecker();
        std.bracketCheck();
    }

    public void bracketCheck() throws Exception {
        List<String> lines = getStringFromConsole();
        for (String eachLine : lines) {
            boolean resultPerLine = balancedBracketsCheck(eachLine);
            System.out.println(resultPerLine);
        }
    }

    public static boolean balancedBracketsCheck(String eachLine) {
        Stack<Character> stack = new Stack<Character>();

        Map<Character, Character> openingToClosingBrackets = new HashMap<Character, Character>();
        openingToClosingBrackets.put(']', '[');
        openingToClosingBrackets.put('}', '{');
        openingToClosingBrackets.put(')', '(');

        for (int i = 0; i < eachLine.length(); i++) {
            char charAt = eachLine.charAt(i);
            if (openingToClosingBrackets.containsValue(charAt) || openingToClosingBrackets.containsKey(charAt)) { // is opening or closing bracket
                if (openingToClosingBrackets.containsValue(charAt)) {
                    stack.push(charAt);
                } else if (stack.isEmpty() || stack.pop() != openingToClosingBrackets.get(charAt)) { // if there is no entry or no match return false
                    return false;
                }
            }
        }
        if (stack.isEmpty()) { // if there is bracket opened at the end.
            return true;
        } else {
            return false;
        }
    }

    public List<String> getStringFromConsole() throws Exception {
        Scanner inputPattern = new Scanner(System.in);
        List<String> lines = new ArrayList<String>();

        while (inputPattern.hasNextLine()) {
            lines.add(inputPattern.nextLine());
        }
        return lines;
    }
}
