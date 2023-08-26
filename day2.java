import java.lang.reflect.Array;
import java.util.*;

public class day2 {
    public static void main(String[] args) {
        // permutation(5, 9);
        // printpermutations("palak", "");
        int arr[] = { 121, 5555, 6666, 777, 121, 5555 };
        // System.out.println(longestpalindrome(arr));
        // repeting(arr);
        nonrepet(arr);

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
    public static void assendesc(int a[], int n) {
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < n / 2; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }

            for (int j = n / 2; j < n - 1; j++) {
                if (a[j] < a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");

    }

    // 17
    // Sort the element
    public static void sortarray(int arr[]) {
        Arrays.sort(arr);
    }

    // 18
    // Finding the Longest Palindrome in an Array
    public static int maximum(int prev, int curr) {
        if (prev < curr) {
            return curr;
        }
        return prev;
    }

    public static boolean ispalindrome(int num) {
        int num1 = num;
        int revrser = 0;
        while (num != 0) {
            int temp = num % 10;
            revrser = 10 * revrser + temp;
            num = num / 10;
        }
        if (revrser == num1) {
            return true;
        } else {
            return false;
        }
    }

    public static int longestpalindrome(int arr[]) {
        // we need two function
        // ispalindome
        // maximum no.
        int max = 0;
        for (int i = 0; i < arr.length; i++)
            if (ispalindrome(arr[i]))
                max = maximum(max, arr[i]);

        return max;
    }

    // 19
    public static void countfreq(int arr[], int n) {
        boolean visited[] = new boolean[n];
        Arrays.fill(visited, false);
        int count_dis = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i] == true) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                }

            }
            count_dis = count_dis + 1;
        }
        System.out.println(count_dis);

    }

    // 20
    // Find rpeting elements in an array
    public static void repeting(int arr[]) {
        int n = arr.length;
        boolean visited[] = new boolean[n];
        Arrays.fill(visited, false);
        for (int i = 0; i < n; i++) {
            if (visited[i] == true)
                continue;
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            if (count != 1) {
                System.out.println(arr[i]);
            }
        }

    }
    // #21
    public static void nonrepeting(int arr[]){
        int n=arr.length;
        boolean visited[]=new boolean[n];
        Arrays.fill(visited,false);
        for(int i=0;i<n;i++){
            if(visited[i]==true)
            continue;
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j])
                visited[j]=true;
                count++;
            }
            if(count==1)
            System.out.println(arr[i]+" ");
        }
    }
    //#22
    //Removing non repeting number
    public static void nonrepet(int arr[]){
        int n=arr.length;
        HashSet hashset=new HashSet();
        for(int i=0;i<n;i++){
            hashset.add(arr[i]);
        }
        System.out.println(hashset);
    }
    //#23
    public static void minimumscalar(int arr[],int arr1[]){
        Arrays.sort(arr);
        Arrays.sort(arr1);
        int i=0;
        int j=arr1.length-1;
        int sum=0;

        while(i!=arr.length){
          sum+=arr[i]*arr1[j];
          i++;
          j--;
        }
        System.out.println(sum);
    }
    //#24
    //Counting element odd or even 
    public static void oddeven(int arr[]){
        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;

            }
            odd++;
        }
        System.out.println("Even"+even+"odd"+odd);
    }
    //#25
    public static void Symentricpair(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for (int j = i + 1; j < 5; j++)
            {
	            if (arr[i][0] == arr[j][1] && arr[i][1] == arr[j][0])
	                System.out.println("(" + arr[i][0] + ", " + arr[i][1] + ")");
	        }

        }
    }


}
