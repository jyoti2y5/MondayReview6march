package com.bridgelab.review3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveSpecialCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any String with special character");
        String input=sc.nextLine();

        String result = removeSpecialChars(input);

        System.out.println(" New modified string: " + result);

    }

    public static String removeSpecialChars(String str) {

        Pattern pattern = Pattern.compile("[^a-zA-Z0-9\\s]");
        Matcher matcher = pattern.matcher(str);
        String result = matcher.replaceAll("");


        return result;
    }

}
