package Basic_math;

import java.util.Scanner;

public class AllBasicMath {

    // Count the number of digits in a number
    public void countDigits(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
    }

    // Reverse the digits of a number
    public void reverseNumber(int num) {
        int reverse = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            reverse = (reverse * 10) + lastDigit;
            num = num / 10;
        }
        System.out.println("Reversed number: " + reverse);
    }

    // Check if a number is a palindrome
    public void isPalindrome(int num) {
        int reverse = 0;
        int original = num;
        while (num > 0) {
            int lastDigit = num % 10;
            reverse = (reverse * 10) + lastDigit;
            num = num / 10;
        }
        if (reverse == original) {
            System.out.println("The number is a Palindrome");
        } else {
            System.out.println("The number is not a Palindrome");
        }
    }

    // Check if a number is an Armstrong number (only for 3-digit numbers)
    public void isArmstrong(int num) {
        int sum = 0;
        int original = num;
        while (num > 0) {
            int lastDigit = num % 10;
            sum += lastDigit * lastDigit * lastDigit;
            num = num / 10;
        }
        if (sum == original) {
            System.out.println("The number is an Armstrong number");
        } else {
            System.out.println("The number is not an Armstrong number");
        }
    }

    // Print all divisors of a number
    public void printDivisors(int num) {
        System.out.print("Divisors: ");
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                if ((num / i) != i) {
                    System.out.print((num / i) + " ");
                }
            }
        }
        System.out.println();
    }

    // Check if a number is prime
    public void isPrime(int num) {
        if (num <= 1) {
            System.out.println("The number is not a Prime number");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("The number is a Prime number");
        } else {
            System.out.println("The number is not a Prime number");
        }
    }

    // Calculate GCD or HCF of two numbers using the Euclidean algorithm
    public void findGCD(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b)
                a = a % b;
            else
                b = b % a;
        }
        if (a == 0)
            System.out.println("GCD or HCF is: " + b);
        else
            System.out.println("GCD or HCF is: " + a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AllBasicMath abm = new AllBasicMath();

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Call any desired method
        abm.isPrime(num); // Example call

        // Uncomment below to test other functions
        // abm.countDigits(num);
        // abm.reverseNumber(num);
        // abm.isPalindrome(num);
        // abm.isArmstrong(num);
        // abm.printDivisors(num);

        // For GCD, input two numbers
        // System.out.print("Enter two numbers for GCD: ");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // abm.findGCD(a, b);
    }
}
