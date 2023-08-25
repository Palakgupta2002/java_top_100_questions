import java.lang.reflect.Array;
import java.util.ArrayList;

public class day2 {
    public static void main(String[] args) {
        // permutation(5, 9);
        printpermutations("palak", "");

    }

    // 1
    public static void gretestthree(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3) {
            System.out.println(n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2);
        } else {
            System.out.println(n3);
        }
    }

    // #2
    public static void leapyear(int year) {
        if (year % 4 == 0 || year % 400 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    // #3
    public static int primenumber(int num) {
        if (num <= 2) {
            return 0;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return 1;
                }
            }
            return 0;
        }
    }

    // #4
    public static ArrayList givenrprime(int num1, int num2) {
        ArrayList<Integer> array = new ArrayList<>();

        while (num1 != num2) {
            array.add(primenumber(num1));
            num1++;
        }
        return array;
    }

    // #5
    public static int sumofgiven(int num) {
        int sum = 0;
        while (num != 0) {
            int temp = num % 10;
            sum += temp;
            num = num / 10;

        }
        return sum;
    }

    // #6
    public static int[] decimaltobinary(int decimal) {
        int binary[] = new int[20];
        int i = 0;
        while (decimal > 0) {
            int r = decimal % 2;
            binary[i] = r;
            decimal = decimal / 2;
            i++;
        }
        return binary;
    }

    // 7
    public static void decimaltoctal(int decimal) {
        int octal[] = new int[20];
        int i = 0;
        while (decimal > 0) {
            int r = decimal % 8;
            octal[i] = r;
            decimal = decimal / 2;
            i++;
        }
        for (int j = octal.length - 1; j >= 0; j--) {
            System.out.println(octal[j]);
        }
    }

    // 8
    public static void quadrant(int x, int y) {
        if (x > 0 && y > 0)
            System.out.println("first");
        else if (x < 0 && y > 0)
            System.out.println("Second");
        else if (x < 0 && y < 0)
            System.out.println("Quadrant III");
        else if (x > 0 && y < 0)
            System.out.println("Quadrant IV");
        else if (x == 0 && y == 0)
            System.out.println("Origin");
    }

    // #9
    // helping function for permutation factorial
    public static int fact(int n) {
        int fact1 = 1;
        for (int i = n; i >= 1; i--) {
            fact1 *= i;
        }
        return fact1;
    }

    public static void permutation(int n, int r) {
        // for permutations n!/(n-r)!
        int fact = fact(n);
        int fact1 = fact(n - r);
        int permutations = fact / fact1;
        System.out.println(permutations);

    }

    // #10
    public static int handshakes(int num) {
        int handshake = (num - 1) * num / 2;
        return handshake;

    }

    // #11
    // Print Permutations
    public static void printpermutations(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String r = str.substring(0, i) + str.substring(i + 1);
            printpermutations(r, ans + ch);
        }
    }

    // #12
    // Given an integer N the task is to print the F(N)th term in Java
    public static int printFterm(int calculated, int current, int n) {
        int i, curr = 1;
        // Base Condition
        if (current == n + 1)
            return 0;
        for (i = calculated; i < calculated + current; i++) {
            curr *= i;
        }
        return curr + printFterm(i, current + 1, n);

    }

    // #13
    // Subsetsum
    public static void subsetsum(int[] arr, int l, int r, int sum) {
        if (l > r) {
            System.out.println(sum + " ");
            return;
        }
        subsetsum(arr, l + 1, r, sum + arr[l]);
        subsetsum(arr, l + 1, r, sum);
    }

    // #14
    public static void generatepascal(int n) {
        int prev = 1;
        System.out.println(prev);
        for (int i = 1; i <= n; i++) {
            int curr = (prev * (n - i + 1)) / i;
            System.out.print(", " + curr);
            prev = curr;
        }
    }

    // #15
    // Find the Factorial of Given Number
    public static int factorial(int n) {
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }
    // #16
    // Sort first in ascending order and second half in descending
    

}
