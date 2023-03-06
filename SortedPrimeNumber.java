package com.bridgelab.review3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class SortedPrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array: ");
        int size = input.nextInt();
        int[] numbers = new int[size];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }


        HashSet<Integer> primes = new HashSet<Integer>();


        for (int number : numbers) {
            if (isPrime(number)) {
                primes.add(number);
            }
        }

        Integer[] sortedPrimes = primes.toArray(new Integer[primes.size()]);
        Arrays.sort(sortedPrimes);
        System.out.println("Prime numbers is: " + Arrays.toString(sortedPrimes));
    }


    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    }

