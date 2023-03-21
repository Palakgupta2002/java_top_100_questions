import java.util.*;
class preinsta1{
    public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int number=sc.nextInt();
//  System.out.println("enter a second number");
//   int number2=sc.nextInt();
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
//  sumofdigits(number);
//reversenumber( number);
//palindrom(number);
//armstrong(number);
// rangeofarmstong(number, number2);
// Fibonacci(number);
// factorial(number);
// System.out.println(recurrsionfact(number));
// System.out.println(power(number, number2));
// 
// strongnumber(number);
perfectnumber(number);
 
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
//program for a reverse number
 public static int reversenumber(int number) {
    int reverse=0;
    int rem;
    while(number!=0){
        rem=number%10;
        reverse=reverse*10+rem;
        number/=10;
    }
    //System.out.print("the reverse no is "+reverse);
    return reverse;
    
}
//program for palindrom number
public static void palindrom(int number) {
    if( reversenumber(number)==number){
        System.out.println("the number is palindrom");
    }
    else{
        System.out.println("the number is not a palindrom number");
    }
    
}

public static int order(int number) {
    int count=0;
    while(number!=0){
        count++;
        number/=10;
       
    }
    
    return count;   
}
//this a helper subprogram to giving a result of a number
//program for armstrong
public static void armstrong(int num){
    int len;
    //this order function is for to find out a order of number
    len=order(num);
    int sum = 0, temp, digit;
    temp = num;

    // loop to extract digit, find power & add to sum
    while (temp != 0)
      {
	// extract digit
	digit = temp % 10;

	// add power to sum
	sum = sum + (int)Math.pow(digit, len);
	temp /= 10;
    

      }
   if(sum==num){
    System.out.println("the given number is armstong");

   }
   else{
    System.out.println("the given number is  not armstong");


   }
    
}
//program to find out a range of armstong
public static void rangeofarmstong(int lowrangenumber,int highrangenumber) {
    for(int i= lowrangenumber;i<=highrangenumber;i++){
       System.out.print(i+" ");
       armstrong(i);
       
    }
    
}
//program for Fibonacci series 
public static void Fibonacci(int number) {
    int a=0;
    int b=1;
    int c;
    System.out.print(a +","+b);
    for(int i=1;i<=number;i++){
         c=a+b;
         System.out.print(","+c);
        a=b;
        b=c;

    }   
}
//program for a  find factorial number
public static void factorial(int number){
    int res=1;
    //base condition
    if(number==1 || number==0){
        System.out.println(res+" the factorial of the number "+number);

    }
    else{
        for(int i=1;i<=number;i++){
            res=res*i;
        }
        System.out.println(res +" the factorial of the number "+number);
    }

}
//now program of factorial is with the help of recurrsion
public static int recurrsionfact(int number){
    if( number==0){
       return 1;

    } 
    else{
        return number* recurrsionfact(number-1);
    }
}
//power of a number
public static int power(int base,int power){
    //base condition
    if(power==0){
        return 1;
    }
    else{
        return base*power(base,power-1);
    }
}
//program for find out a factor 
public static void factor(int number){
    for(int i=1;i<number;i++){
        if(number%i==0 && primeornot(number)==false){
            System.out.print(i+" ");
           
        }
    }
}
//Program for find strong number
public static void strongnumber(int number){
    int res=0;
    int sum=0;
    int number1=number;
    while(number!=0){
        res=number%10;
       sum=sum+recurrsionfact(res);
       number=number/10;
    }
       if(number1==sum){
        System.out.println("It is strong number");
    }
    else{
        System.out.println("It is not strong number"); 
    }
}
//Program for find a perfect number
public static void perfectnumber(int number) {
    int sum=0;
    for(int i=1;i<number;i++){
        if(number%i==0){
            sum=sum+i;
        }

    }
    if(number==sum){
        System.out.println("This is a perfect number");
    }
    else{
        System.out.println("This is not a perfect number"); 
    }
    
}
//automorphic number




}