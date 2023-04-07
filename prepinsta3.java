import java.util.*;
//Codes for Recursion
public class prepinsta3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number1");
        int number1=sc.nextInt(); 
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
System.out.println(term(1, 1,number1));

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
}

      
    

    
  


    

