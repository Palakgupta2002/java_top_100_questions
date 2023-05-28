import java.util.*;
//Codes for Recursion
public class prepinsta3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        // System.out.println("enter a number1");
        // int number1=sc.nextInt(); 
        // System.out.println("enter a number2");
        // int number2=sc.nextInt();
        // System.out.println("enter a String");
        // String str=sc.nextLine(); 
          
        //    System.out.println("enter a number");
        //    int n=sc.nextInt(); 
        //    int[] Array = new int[n];
        //    for(int i=0;i<n;i++){
        //    System.out.println("enter a array's value ");
        //     Array[i]=sc.nextInt();
            
        //    }
        // System.out.println("enter a number1");
        // int n=sc.nextInt(); 
        //    char[] str = new char[n*2];
          
         
           //System.out.println((power(number, powe)));
          //System.out.println(primeornot(number, 2));
        //System.out.println(largestnumber(0, n, Array));
        //System.out.println(largestelement(Array[],0,-9999));
       
    //  int k=  FindlargestInteger(Array, 0, -3456);
    //  System.out.println(k);
    // reversingnumber(n);
    //  System.out.println(hcfrecursionfun(number1, number2));
    //    System.out.println(lengthofstring(str));
//  printPermutn(str, "");
// System.out.println(term(1, 1,number1));
// sumallsubset(0, Array.length-1, Array, 0);
// Lastnonzerofactorial(number1);
// parscalprint(number1);
// generatecomb(n, str, 0, 0, 0);
// System.out.print(factorial(n));
printBinaryNumbers(4, 0, 0, "");


    }
    //Power of a Number using Recursion in Java
  
   

    public static int  power(int number,int power ){
        int res=1;
        //base condition
        if(power==1){
           return number;
        }
        //base condition
        if(power==0){
           return 1;
        }
        //main logic
       return res=number*power(number,power-1);
       
    }
    //cheack the given number is prime number or not
    public static boolean primeornot(int number,int divisor){
        //base conditon
        if(number==1 || number==0){
          return  false; 
        }
        //main logic
        if(number%divisor==0){
            return false;
        }
        else{
            while(divisor-1==number){
                return primeornot(number, divisor+1);
            }
           
        }
        return true;
    }
    //largest element in array by recursion
    public static int FindlargestInteger(int[] array, int index, int max) { 

        if (index == array.length)
        {
            return max;

        }
        if (array[index] > max) {
            max = array[index];
        }

        FindlargestInteger(array, index + 1, max);

        return max;     
    }
    //find out reversing number using recurssion
    public static void reversingnumber(int number) {
        //base condition 
        if(number<10){
            System.out.println(number);
            return ;
        }
        else{
            System.out.print(number%10);
            reversingnumber(number/10);
        }   
    }
    //HCF of a Number using Recursion in Java
    public static int hcfrecursionfun(int number1,int number2) {
        if(number1==0){
             return number2;
        }
        if(number2==0){
            return number1;
       }
       if(number1>number2){
        return hcfrecursionfun(number1-number2 , number2);
       }
       else{
        return hcfrecursionfun(number1, number2-number1);
       }   
    }
    //To Calculate length of The String Using Recursion in Java
    public static int lengthofstring (String str) {
        if(str.equals("")){
            return 0;
        }
        else{
            return  lengthofstring(str.substring(1))+1;
         
        }
        
    }
    
    //print permutation of given string
    static void printPermutn(String str, String ans) {
       //If string is empty
       if(str.length()==0){
        System.out.println(ans);
        return ;
       }
       for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        String r=str.substring(0, i)+str.substring(i+1);
        printPermutn(r, ans+ch);
       }
       }
       //Print Given an integer N the task is to print the F(N)th term in Java
       static int term (int calculated, int current, int N)
  {
    int i, cur = 1;
    // Base Condition
    if (current == N + 1)
      return 0;
    // product of terms till current
    for (i = calculated; i < calculated + current; i++)
      cur *= i;
    return cur + term (i, current + 1, N);
  }
  //Print Sums of all Subsets of a given set in Java
  public  static void sumallsubset(int l,int r,int arr[],int sum) {
    //base condition
    //2. and when the base condition start our stack is empty one by one the follows rule LIFO
    if(l>r){
        System.out.println(sum + " ");
        return ;
    }
// 1. these values going in a stack
    sumallsubset(l+1, r, arr, sum+arr[l]);//substring sum
    sumallsubset(l+1, r, arr, sum);//three cases
  }
  //Help Factorial number
   public static int fact(int number) {
    //Base Condition
    if(number==0 || number==1){
        return 1;
    }
    return number*fact(number-1);
    
  }
  // Print Last non-zero digit in factorial in Java
  public static void Lastnonzerofactorial(int n){
  int factorial = fact(n);
  int res;
  while(factorial%10==0){
    factorial/=10;
}
  System.out.println((factorial%10));

  }
  //This is a helper function for Pasacal"s tringle
  public static long ncr(int n,int r){
    long res=1;
    r=Math.min(r, (n-r));
    for(int i=1;i<=r;i++){
        res=(res*(n-i+1))/i;

    }
    return res;
  }
  //Print Find the Nth row in Pascal’s Triangle in Java
  public static void parscalprint(int n){
    for(int i=0;i<=n;i++){
       long res= ncr(n,i);
       System.out.print(res+" ");
       res=1;
    }
   
  }
     //Print Generate all Combinations of Balanced Parentheses in Java
  public static void generatecomb(int n,char[] str,int open,int close,int pos) {
if(close==n){
    for(int i=0;i<str.length;i++)
    System.out.print(str[i]);
    System.out.println("");
    return;
   }
    else{
        if(open>close){
            str[pos]='}';
            generatecomb(n, str, open, close+1, pos+1);
        }
        if(open<n){
            str[pos]='{';
            generatecomb(n, str, open+1, close, pos+1);
        }
    }
}
// Print Find Factorial 
public  static int factorial(int n)
{
    if (n == 0)
        return 1;

    return n * factorial(n - 1);
}

public static void printBinaryNumbers(int n, int ones, int zeros, String currentNumber) {
   
    if (n == 0) {
        System.out.println(currentNumber);
        return;
    }

   
    if (ones > zeros) {
       
        printBinaryNumbers(n-1, ones + 1, zeros, currentNumber + "1");
    }

    printBinaryNumbers(n-1, ones, zeros + 1, currentNumber + "0");
}

}
      
    

    
  


    

