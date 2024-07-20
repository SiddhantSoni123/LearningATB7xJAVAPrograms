package Ex_20072024;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Write a program that prints numbers from 1 to 100. However, for multiples of 3, print "Fizz" instead of the number, and for multiples of 5,
// print "Buzz." For numbers that are multiples of both 3 and 5, print "FizzBuzz."
public class FizzBuzz_Test {
    public static void main(String[] args) {
        int n = 100;
        for (int i = 1; i <= n; i++) {
            // Check if i is divisible by both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " -> FizzBuzz");
            }
            // Check if i is divisible by 3
            else if (i % 3 == 0) {
                System.out.println(i + " -> Fizz");
            }
            // Check if i is divisible by 5
            else if (i % 5 == 0) {
                System.out.println(i + " -> Buzz");
            }
        }
    }
}
