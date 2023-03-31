import java.util.*;
//Codes for Recursion
public class prepinsta3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int number=sc.nextInt(); 
        System.out.println("enter a power");
        int powe=sc.nextInt(); 
       System.out.println((power(number, powe)));

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

    
}
