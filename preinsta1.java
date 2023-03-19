import java.util.*;
class preinsta1{
    public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int number=sc.nextInt();
//oddeven(number);
naturalnumber(number);
 
    }
     //program for to check the number is even or odd

    public static void oddeven(int number) {
        if(number%2==0){
            System.out.println("the enter number is even");
        }
        else{
            System.out.println("the enter number is odd");
        }


        
    }
    //program for to check the number is positive or negetive
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
    //Program for sum of natural number
    public static int naturalnumber(int number) {
        int sum =0;
        for (int i=1;i<=number;i++){
            sum+=i;
        }
        System.out.println( sum);
        return sum;
        
    }
    

}