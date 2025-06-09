package Pattern;

import java.util.Scanner;

public class AllPattern {

    void print1(int n) {
        for (int i = 1; i <= n * 2 - 1; i++) {
            int stars = i;
            if (i > n)
                stars = 2 * n - i;
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void print2(int n) {
        int star = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                star = 1;
            else
                star = 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(star);
                star = 1 - star;
            }
            System.out.println();

        }
    }

    void print3(int n) {
        int spaces = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j);
            }
            for (int j = 1; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            spaces -= 2;
        }
    }

    void print4(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

    }

    void print5(int n) {
        for (int i = 0; i < n; i++) {
            for (char j = 'A'; j <= 'A' + i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    void print6(int n) {
        for (int i = 0; i < n; i++) {
            for (char j = 'A'; j <= 'A' + (n - i - 1); j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    void print7(int n) {
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);
            for (char j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    void print8(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            int breackpoint = (2 * i + 1) / 2;
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch);
                if (j <= breackpoint) {
                    ch++;
                } else {
                    ch--;
                }
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    void print9(int n) {
        int inis = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < inis; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            inis += 2;
            System.out.println();
        }
         inis = inis-2;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < inis; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            inis -= 2;
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int num = sc.nextInt();
        AllPattern ap = new AllPattern();
        ap.print9(num);
    }
}