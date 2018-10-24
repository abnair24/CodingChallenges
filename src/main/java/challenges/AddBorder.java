package challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;


/*
Given a rectangular matrix of characters, add a border of asterisks(*) to it.

Example

For

picture = ["abc",
           "ded"]
the output should be

addBorder(picture) = ["*****",
                      "*abc*",
                      "*ded*",
                      "*****"]
 */

public class AddBorder {

    public static void main(String[] args) {
        List<String> inp = new ArrayList<>();
        inp.add("abc");
        inp.add("ded");

        String [] inx = new String[inp.size()];
        inx = inp.toArray(inx);
        add(inx);
    }

    public static void add(String[] input) {
        String[] n = new String[input.length+2];
        int len = input[0].length()+2;
        char[] chars = new char[len];


        for (int i =0; i <= input.length+1;i++) {
            if(i== input.length+1 || i == 0) {
                Arrays.fill(chars,'*');
                n[i] = new String(chars);
                //n[input.length + 1] = n[i];
                continue;
            }
            n[i]= '*'+ input[i-1]+'*';
        }

       for (String i : n) {
           System.out.println(i);
       }

    }
}
