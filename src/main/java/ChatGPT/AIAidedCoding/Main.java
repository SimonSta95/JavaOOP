package ChatGPT.AIAidedCoding;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String inputString = "Hello";
        String reversedString = reverseString(inputString);
        System.out.println(reversedString);  // Output: "olleH"

        String inputString1 = "anna";
        boolean isPalindrome = isPalindrome(inputString1);
        System.out.println(isPalindrome);  // Output: true

        inputString = "hello";
        isPalindrome = isPalindrome(inputString);
        System.out.println(isPalindrome);  // Output: false

        int n = 10; // Example: Generate the first 10 prime numbers
        List<Integer> primes = generatePrimes(n);
        System.out.println(primes);  // Output: [2, 3, 5, 7, 11, 13, 17, 19, 23, 29]

    }

    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static List<Integer> generatePrimes(int n) {

        List<Integer> primes = new ArrayList<>();
        if (n < 1) {
            return primes;
        }

        int count = 0; // Count of primes found
        int number = 2; // Number to be checked for primality

        while (count < n) {
            if (isPrime(number)) {
                primes.add(number);
                count++;
            }
            number++;
        }

        return primes;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
