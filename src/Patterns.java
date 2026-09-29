// Problem: 5 Basic Pattern Programs from Lecture 11
// Time Complexity: O(n^2) for all patterns
// Space Complexity: O(1)

public class Patterns {
    public static void main(String[] args) {
        int n = 5;

        System.out.println("1. Solid Rectangle");
        pattern1(n);

        System.out.println("\n2. Right-Angled Triangle");
        pattern2(n);

        System.out.println("\n3. Inverted Right-Angled Triangle");
        pattern3(n);

        System.out.println("\n4. Half Pyramid of Numbers");
        pattern4(n);

        System.out.println("\n5. Number Triangle");
        pattern5(n);
    }

    // 1. Solid Rectangle
    public static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 2. Right-Angled Triangle
    public static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 3. Inverted Right-Angled Triangle
    public static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 4. Half Pyramid of Numbers
    public static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // 5. Number Triangle (Row number repeated)
    public static void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}