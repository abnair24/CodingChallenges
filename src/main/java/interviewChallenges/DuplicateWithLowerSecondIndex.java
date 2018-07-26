package interviewChallenges;


import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/*
        # Given an array a that contains only numbers in the range from 1 to a.length,
        # find the first duplicate number for which the second occurrence has the minimal index. In other words,
        # if there are more than 1 duplicated numbers, return the number for which the second occurrence has a smaller index
        # than the second occurrence of the other number does. If there are no such elements, return -1.
        #
        # Example
        #
        # For a = [2, 1, 3, 5, 3, 2], the output should be
        # firstDuplicate(a) = 3.
        #
        # There are 2 duplicates: numbers 2 and 3. The second occurrence of 3 has a smaller index than the second
        # occurrence of 2 does, so the answer is 3.
        #
        # For a = [2, 4, 3, 5, 1], the output should be
        # firstDuplicate(a) = -1.
*/


public class DuplicateWithLowerSecondIndex {

    public static void main(String[] args) {
        int [] a = {2, 1, 3, 5, 3, 2};
        System.out.println(firstDuplicate(a));
    }

    public static int firstDuplicate (int[] input) {
        Set<Integer> set = new HashSet<>();

        for (int i : input) {
            if (!set.add(i)) {
                return i;
            }
        }
        return -1;
    }

}
