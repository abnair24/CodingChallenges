package challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        List<String> inputs = readInput();
        for (String eachInput : inputs) {
          int result = calcResult(eachInput);
          System.out.println(result);
        }
    }

    private static int calcResult(String eachInput) {
        String[] partsOfEachInput = eachInput.split("\\s+");

        String operator = partsOfEachInput[0].trim();
        int number1 = Integer.parseInt(partsOfEachInput[1].trim());
        int number2 = Integer.parseInt(partsOfEachInput[2].trim());

        if("+".equals(operator)){
            return number1 + number2;
        }
        if("-".equals(operator)){
            return number1 - number2;
        }
        if("*".equals(operator)){
            return number1 * number2;
        }
        if("/".equals(operator)){
            return number1 / number2;
        }
        if("%".equals(operator)){
            return number1 % number2;
        }
        return -1;
    }

    public static List<String> readInput()
    {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<String>();

        while(true) {
            String inputLine = scanner.nextLine();
            if (inputLine.length()==0) {
                break;
            } else {
                inputs.add(inputLine);
            }
        }
        return inputs;
    }
}
