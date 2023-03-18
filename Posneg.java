import java.util.*;
class posneg{
    public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int number=sc.nextInt();
oddeven(number);
 
    }
    public static void oddeven(int number) {
        if(number%2==0){
            System.out.println("the enter number is even");
        }
        else{
            System.out.println("the enter number is odd");
        }


        
    }
    public static void posnegnum( int number){
        if(number==0){
            System.out.println("the number is zero");
        }
        else if(number>0){
            System.out.println("the enter number is positive");
        }
        else{
            System.out.println("the enter number is negative");
        }
        
               

    }
}