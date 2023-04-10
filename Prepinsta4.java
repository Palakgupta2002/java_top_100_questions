import java.util.*;
public class Prepinsta4 {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
           int n=sc.nextInt(); 
           int[] Array = new int[n];
           for(int i=0;i<n;i++){
           System.out.println("enter a array's value ");
            Array[i]=sc.nextInt();
            System.out.print(getmax(Array, n));

           }
        }
        //Java Program for finding the largest element of the array
        public static int getmax(int [] array,int n){
            if(n==1){
                return array[0];
            }
           return Math.max(array[n-1],getmax(array, n-1) );
        }
          
}