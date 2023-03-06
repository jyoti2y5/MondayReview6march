package com.bridgelab.review3;

import java.util.HashMap;
import java.util.Scanner;

public class CountCharacterFromString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charCount.containsKey(c)) {
                int count = charCount.get(c);
                charCount.put(c, count + 1);
            } else {
                charCount.put(c, 1);
            }
        }


        for (char c : charCount.keySet()) {
            int count = charCount.get(c);
            System.out.println(c + " = " + count);
        }
    }
}


