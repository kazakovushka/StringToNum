package edu.practise;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class StringToNum {
    public static void main(String[] args) {
        System.out.println(convert("1"));
        System.out.println(convert("10"));
        System.out.println(convert("20"));
        System.out.println(convert("45"));
        System.out.println(convert("34545"));

    }

    static int convert(String str) {
        char[] allChars = str.toCharArray();
        System.out.println("all ch size " + allChars.length);
        Map<Character, Integer> digits = new HashMap<>();
        digits.put('0', 0);
        digits.put('1', 1);
        digits.put('2', 2);
        digits.put('3', 3);
        digits.put('4', 4);
        digits.put('5', 5);
        digits.put('6', 6);
        digits.put('7', 7);
        digits.put('8', 8);
        digits.put('9', 9);

        int result = 0;

        for (int i = 0; i < allChars.length; i++) {
            int d = digits.get(allChars[i]);
            result = result + d * getMultiplier(allChars.length - i - 1);
        }

        return result;
    }

    static int getMultiplier(int zeroCount) {
        int res = 1;
        for (int i = 0; i < zeroCount; i++) {
            res = res * 10;
        }
        return res;
    }
}
