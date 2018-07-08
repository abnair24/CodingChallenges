package challenges;

import java.util.LinkedHashMap;
import java.util.Map;

//Note: Write a solution that only iterates over the string once and uses O(1)
//      additional memory, since this is what you would be asked to do during a real interview.
//
//        Given a string s, find and return the first instance of a non-repeating character in it.
//        If there is no such character, return '_'.
//
//        Example
//
//        For s = "abacabad", the output should be
//        firstNotRepeatingCharacter(s) = 'c'.
//
//        There are 2 non-repeating characters in the string: 'c' and 'd'. Return c since it appears in the string first.
//
//        For s = "abacabaabacaba", the output should be
//        firstNotRepeatingCharacter(s) = '_'.
//
//        There are no characters in this string that do not repeat.


public class FirstNotRepeatingChar {

    public static void main(String[] args) {
        System.out.println(firstNotRepeatingCharacter("abacabad"));
    }

    public static char firstNotRepeatingCharacter(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for(char c : s.toCharArray()) {
            Integer i = map.get(c);
            if(i == null) {
                map.put(c,1);
            } else {
                map.put(c,i++);
            }
        }
        for(Map.Entry<Character, Integer> ent: map.entrySet()) {
           if(ent.getValue()==1){
               return ent.getKey();
           }
        }
        return '_';
    }
}
