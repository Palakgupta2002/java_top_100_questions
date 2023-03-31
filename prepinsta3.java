import java.util.*;
//Codes for Recursion
public class prepinsta3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int number=sc.nextInt(); 
    //     System.out.println("enter a power");
    //     int powe=sc.nextInt(); 
    //    System.out.println((power(number, powe)));
   System.out.println(primeornot(number, 2));

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
    


    
}
