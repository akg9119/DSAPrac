package Basic_math;

import java.util.Scanner;

public class AllBasicMath {
    public void Count_digits(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count = count + 1;
        }
        System.out.println(count);
    }

    public void Reverse_number(int num) {
        int reverse = 0;
        while (num > 0) {
            int last_digit = num % 10;
            reverse = (reverse * 10) + last_digit;
            num = num / 10;
        }
        System.out.println(reverse);
    }

    public void Palindrome_number(int num) {
        int reverse = 0;
        int number = num;
        while (num > 0) {
            int last_digit = num % 10;
            reverse = (reverse * 10) + last_digit;
            num = num / 10;
        }
        if (reverse == number) {
            System.out.println("The number is a Palindrome");
        } else {
            System.out.println("The number is not a Palindrome");
        }
    }

    public void Armstrong_number(int num) {
        int sum = 0;
        int number = num;
        while (num > 0) {
            int last_digit = num % 10;
            sum = sum + (last_digit * last_digit * last_digit);
            num = num / 10;
        }
        if (sum == number) {
            System.out.println("The number is a Armstrong");
        } else {
            System.out.println("The number is not a Armstrong");
        }
    }

    public void Divisors_number(int num) {

        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                if ((num / i) != i) {
                    System.out.print((num / i) + " ");
                }
            }
        }
    }

    public void Prime_number(int num) {
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                count++;
                if ((num / i) != i) {
                    count++;
                }
            }
        }
        if (count == 2) {
            System.out.println("The number is a Prime number");
        } else {
            System.out.println("The number is not a Prime number");
        }
    }

    public void GCDOrHCF(int a, int b) {
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
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        AllBasicMath abm = new AllBasicMath();
        abm.Prime_number(num);

    }
}
