import java.util.*;
class preinsta1{
    public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int number=sc.nextInt();
//  System.out.println("enter a second number");
//  int number2=sc.nextInt();
// System.out.println("enter a third number");
// int number3=sc.nextInt();
//oddeven(number);
//naturalnumber(number);
//sumofrangenumber(number, number2);
//findgreatestnumber(number, number2);
// findgreatestnumberinthree(number, number2, number3);
//leapyearornot(number);
// primeornot(number);
// rangeofprimenumber(number,  number2);
sumofdigits(number);
 
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
    //program for Sum of the Numbers in a Given Range in Java
    public static void sumofrangenumber(int number,int number1) {
        int sum=0;
        for(int i=number; i<=number1;i++){
            sum=i+sum;
        }
        System.out.println(sum);
        
    }
    //progrm for find out a greatest number in between two numbers
    public static void findgreatestnumber(int number,int number1){
        if(number>number1){
            System.out.println(number+" is greater than "+number1);
        }
        else{
            System.out.println(number1+" is greater than "+number);
        }
    }
    //program for find a greatest number in among three number
    public static void findgreatestnumberinthree(int number,int number1,int number2){
        if(number>number1 && number>number2){
            System.out.println(number+" is greater than "+number1+" and "+number2);
        }
        else if(number1>number && number1>number2){
            System.out.println(number1+" is greater than "+number+ " and "+number2);
        }
        else{
            System.out.println(number2+" is greater than "+number1+ " and "+number); 
        }

    } 
    //program for leap  year or not 
    public static void leapyearornot(int number){
        if(number%4==0 || number%400==0){
            System.out.println("the given year is leap year");

        }
        else{
            System.out.println("the given year is not leap year");

        }
    }
    //program for prime number or not
    public static boolean primeornot(int number){
        int count=0;
        if(number==0 || number==1){
           // System.out.println("not prime");
            return true;
        }
        else{
            for(int i=2;i<number;i++){
                if(number%i==0){
                count++;
                }
            }

        }
        if(count>0){
            //System.out.println(" not prime");
            return false;

        }
        else{
           // System.out.println("prime");
            return true;
        }
}
//Program for finding a range of prime
public static void rangeofprimenumber(int number, int number1){
    for(int i=number;i<number1;i++){
        if (primeornot (i)==true)
        System.out.println (i);
    }
}
public static void sumofdigits(int number){
    int sum=0;
    int res=0;
    while(number!=0){
        res=number%10;
        sum=sum+res;
        number=number/10;
    }
    System.out.println(sum);

}

}