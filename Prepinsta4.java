import java.util.*;
public class Prepinsta4 {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
           int n=sc.nextInt(); 
           int[] Array = new int[n];
           for(int i=0;i<n;i++){
           System.out.println("enter a array's value(positive number) ");
            Array[i]=sc.nextInt();
            // System.out.print(getmin(Array, n));

           }
        //    largestsmallest(Array, n);
        // secondsmallestnumber(Array, n);
        // arraysum(Array, n, 0);
        // System.out.print( arraysumrecursion(Array, n, 0,0));
        // slidingreversearray(Array, n);
        // fhassshdss(n, Array);
        // sortarray(Array, n);
        findfrequency(n, Array);
        }
        //Java Program for finding the largest element of the array
        public static int getmax(int [] array,int n){
            if(n==1){
                return array[0];
            }
           return Math.max(array[n-1],getmax(array, n-1) );
        }
        //Java Program for finding the smallest element of the array
        public static int getmin(int [] array,int n){
            if(n==1){
                return array[0];
            }
           return Math.min(array[n-1],getmin(array, n-1) );
        }
        //Print Java Program for Finding the Smallest and largest element in an array
        public static void largestsmallest(int aar[],int n){
            System.out.print("largest number"+getmax(aar, n));
            System.out.print("smallest number"+getmin(aar, n));
        }
        //Java program for finding the second smallest element in an array
public static void secondsmallestnumber(int aar[],int n){
    int smallest = Integer.MAX_VALUE;
    int secondSmallest = Integer.MAX_VALUE;
    for(int i=0; i<n; i++){
        if(aar[i] < smallest){
            secondSmallest = smallest;
            smallest = aar[i];
        }
        else if(aar[i] < secondSmallest && aar[i] != smallest){
            secondSmallest = aar[i];
        }
    }
    System.out.println("The second smallest number is " + secondSmallest);
}
//print calculate the sum of array
public static void  arraysum(int arr[],int n,int sum){
for(int i=0;i<n;i++){
    sum=sum+arr[i];
}
System.out.println(sum); 

}
//print array sum by recurssion

public static int arraysumrecursion(int arr[],int n,int sum,int pos){
    if(pos==n){
        return sum;
    }
    return arraysumrecursion(arr,n,sum+arr[pos],pos+1);

}
//print reverse pattern of array
//there is three way to do this
//1 approach is :- brute forse to declare one another array and do this
//2 approch is:- secondly i traverse or print it in reverse form 
//3 approch is= i do this one by one to take two iterator mean by sliding window
public static void slidingreversearray(int array[],int n){
    int i=array.length-1;
    int j=0;
    int temp;
    for(int p=0;p<n;p++){
        if(i==j){
            for(int k=0;k<n;k++){
                System.out.print(array[k]+" ");
            }
            return;
        }
        else{
        temp=array[j];
        array[j]=array[i];
        array[i]=temp;
        j++;
        i--;
        }
    }   
}
// Print Sort first half in ascending order and second half in descending
public static void fhassshdss(int n,int arr[]){
    int temp;
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n/2;j++){
            if(arr[j]>arr[j+1]){
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        for(int j=n/2;j<n-1;j++){
            if(arr[j+1]>arr[j]){
                temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
            }
        }
    }
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
//Sort the elements of an array 
public static void sortarray(int[] ary,int n){
    Arrays.sort(ary);
    for(int i=0;i<ary.length;i++){
        System.out.print(ary[i]+" ");
    }
}
//Print Java program to find the frequency of elements in an array
public static void findfrequency(int n,int arr[]){
   
   Arrays.sort(arr);
   for(int i=0;i<arr.length;i++){ 
    int count=1;

    for(int j=i+1;j<arr.length;j++){
        if(arr[i]==arr[j]){
            count++;
        }
        else{
            break;
        }
    }
    System.out.print( arr[i]+":"+count+""+",");
i+=(count-1);
       
    
   }
   
}
//Print Java program for Sorting elements of an array by frequency

public static void sortfindfrequency(int n,int arr[]){
   
    Arrays.sort(arr);
    for(int i=0;i<arr.length;i++){ 
     int count=1;
 
     for(int j=i+1;j<arr.length;j++){
         if(arr[i]==arr[j]){
             count++;
         }
         else{
             break;
         }
     }
     System.out.print( arr[i]+":"+count+""+",");
 i+=(count-1);
        
     
    }
    
 }

}