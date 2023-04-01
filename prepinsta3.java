import java.util.*;
//Codes for Recursion
public class prepinsta3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        // System.out.println("enter a number");
        // int number=sc.nextInt(); 
    //     System.out.println("enter a power");
    //     int powe=sc.nextInt(); 
          
           System.out.println("enter a number");
           int n=sc.nextInt(); 
        //    int[] Array = new int[n];
        //    for(int i=0;i<n;i++){
        //    System.out.println("enter a array's value ");
        //     Array[i]=sc.nextInt();
            
        //    }
         
           //System.out.println((power(number, powe)));
          // System.out.println(primeornot(number, 2));
        //  System.out.println(largestnumber(0, n, Array));
        //   System.out.println(largestelement(Array[],0,-9999));
       
    //  int k=  FindlargestInteger(Array, 0, -3456);
    //  System.out.println(k);
    reversingnumber(n);
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
}
      
    

    
  


    

