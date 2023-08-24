class day1 {
    public static void main(String[] args) {
        // posneg(6);
        // sumnatural(6);
        // sumgiven(5, 9);
        // greatesttwo(6, 9);
        // highestcommon(60, 36);
        // binarytodec(11001);
        // octaldec(1234);
        // System.out.println(pownum(5, 3));
        // if(prime(15, 2))
        // System.out.println(true);
        // else
        // System.out.println(false);
        // System.out.println(reversedigit(8902));
        // System.out.println(substringl("palak"));
       
    }

    // #1
    public static void oddeven(int n) {
        if (n % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("neg");
        }
    }

    // #2
    public static void posneg(int n) {
        if (n < 0) {
            System.out.println("neg");
        } else {
            System.out.println("neg");
        }
    }

    // #3
    public static void sumnatural(int n) {
        int sum = n * (n + 1) / 2;
        System.out.println(sum);
    }

    // #4
    public static void sumgiven(int n, int n1) {
        int sum = 0;
        for (int i = n; i <= n1; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    // #5
    public static void greatesttwo(int n1, int n2) {
        if (n1 > n2) {
            System.out.println(n1);
        } else if (n1 < n2) {
            System.out.println(n2);
        } else {
            System.out.println("equals");
        }
    }

    // #6
    public static void highestcommon(int n, int n1) {
        int hcf = 0;
        for (int i = 1; i <= n || i <= n1; i++) {
            if (n % i == 0 && n1 % i == 0) {
                hcf = i;

            }
        }
        System.out.println(hcf);
    }

    // #7
    public static void lowestcommon(int n, int n1) {
        int lcm = 0;
        for (int i = 0; i < n * n1; i++) {
            if (n % i == 0 && n1 % i == 0) {
                lcm = i;
                break;
            }
        }
        System.out.println(lcm);
    }

    // #8
    public static void binarytodec(int n) {
        int decimal = 0;
        int j = 0;
        while (n > 0) {
            int temp = n % 10;
            decimal += temp * Math.pow(2, j);
            n = n / 10;
            j++;
        }
        System.out.println(decimal);
    }

    // #9
    public static void octaldec(int ocatl) {
        int n = 0;
        int decimal = 0;
        while (ocatl > 0) {
            int temp = ocatl % 10;
            decimal += temp * Math.pow(8, n);
            ocatl = ocatl % 10;
            n++;

        }
        System.out.println(decimal);

    }

    // #10
    public static int hexadecimaldec(String hexa) {
        hexa = hexa.toUpperCase();
        String digits = "0123456789ABCDEF";
        int val = 0;
        for (int i = 0; i < hexa.length(); i++) {
            char c = hexa.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
            val++;
        }
        return val;
    }

    // #11
    public static int pownum(int base, int x) {
        if (x == 0)
            return 1;
        return base * pownum(base, x - 1);
    }

    // #12
    public static boolean prime(int n, int i) {
        // Base case
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;
        return prime(n, i + 1);

    }
    //#13
    public static int reversedigit(int num) {
        int revnum=0;
        while(num>0){
            revnum=revnum*10+num%10;
            num=num/10;
        }
        return revnum;
    }
    //#14
    public static int gcd(int num,int num1) {
        if(num==0)
        return num1;
        if(num1==0)
        return num1;
        if(num>num1){
            return gcd(num-num1, num1);
        }
        return gcd(num, num1-num);
        
    }
    //#15
    public static int substringl(String str){
        if(str.equals(""))
        return 0;
        else
        return substringl(str.substring(1))+1;

    }
    //#16
    public static void largestele(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);

    }
    //#17
    public static int smallest(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max>arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    //#18
    public static int secondlargest(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i] && max!=smallest(arr)){
                max=arr[i];
            }
        }
        return max;
    }
    //#19
    public static int sumofarray(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    //#20
    public static void reversearray(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println(arr.toString());

    }
    //#21
    public static boolean checkvowel(char ch){
        if(ch=='a' ||ch=='u'||ch=='o'||ch=='i'||ch=='e' )
        return true;
        return false;
        
    }
    //#22
    public static boolean alphvets(char ch){
        if(ch<='a' && ch>='z'){
            return true;
        }
        return false;
    }
    //#23
    public static int asciivalue(char ch){
        int a=ch;
        return ch;
    }
    //#24
    public static int lengthofstr(String str){
        if(str.equals("")){
            return 0;
        }
            return lengthofstr(str.substring(1))+1; 
    }
    //#25
    public static String togglestring(String str){
        String str1="";
        for(int i=0;i<str.length();i++){
            if(Character.isLowerCase(str.charAt(i))){
                str1+=Character.toUpperCase(str.charAt(i));
            }
            else{
                str1+=Character.toLowerCase(str.charAt(i));
            }
        }
        return str1;

    }
   
}